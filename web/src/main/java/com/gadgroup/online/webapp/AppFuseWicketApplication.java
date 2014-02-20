package com.gadgroup.online.webapp;

import de.agilecoders.wicket.core.Bootstrap;
import de.agilecoders.wicket.core.settings.BootstrapSettings;
import de.agilecoders.wicket.webjars.WicketWebjars;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import org.apache.wicket.authroles.authentication.AuthenticatedWebApplication;
import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.resource.loader.ClassStringResourceLoader;
import org.apache.wicket.settings.IRequestCycleSettings;
import com.gadgroup.online.webapp.pages.Home;
import com.gadgroup.online.webapp.pages.Login;
import org.apache.wicket.Page;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.wicketstuff.annotation.scan.AnnotatedMountScanner;

/**
 * AppFuse Wicket Frontend Application class.
 *
 * @author Marcin Zajączkowski, 2010-09-02
 */
public class AppFuseWicketApplication extends AuthenticatedWebApplication {

    private static final String BASE_PACKAGE_FOR_PAGES = "com.gadgroup.online.webapp.pages";
    public static final String APP_FUSE_RESOURCE_FILE_NAME = "ApplicationResources";

    protected final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    protected void init() {
        super.init();
        registerSpringComponentInjector();
        initPageMounting();
        setOnePassRenderStrategy();
        registerAppFuseSpecificStringResourceLoader();
        initBootstrap();
        initWebjars();
    }

    private void initWebjars() {
        WicketWebjars.install(this);
    }

    private void registerSpringComponentInjector() {
        getComponentInstantiationListeners().add(new SpringComponentInjector(this, getContext(), true));
    }

    private void initPageMounting() {
        //Hint from:
        //http://blog.xebia.com/2008/10/09/readable-url%E2%80%99s-in-wicket-an-introduction-to-wicketstuff-annotation/
        new AnnotatedMountScanner().scanPackage(BASE_PACKAGE_FOR_PAGES).mount(this);
    }

    /**
     * Redirects after post causes page to be shrunk (probably) due to SiteMesh bug:
     * http://jira.opensymphony.com/browse/SIM-217
     */
    private void setOnePassRenderStrategy() {
        getRequestCycleSettings().setRenderStrategy(IRequestCycleSettings.RenderStrategy.ONE_PASS_RENDER);
    }

    //TODO: MZA: Move to a separate class
    /**
     * Registers AppFuse specific IStringResourceLoader at the end to use ApplicationResources.properties
     * for unhandled keys.
     */
    private void registerAppFuseSpecificStringResourceLoader() {
        Class applicationResourcesClass = getOrCreateArtificialApplicationResourcesClass();
        getResourceSettings().getStringResourceLoaders().add(new ClassStringResourceLoader(applicationResourcesClass));
    }

    private Class<?> getOrCreateArtificialApplicationResourcesClass() {
        try {
            return Class.forName(APP_FUSE_RESOURCE_FILE_NAME);
        } catch (ClassNotFoundException e) {
            return createArtificialApplicationResourcesClass();
        }
    }

    private Class<?> createArtificialApplicationResourcesClass() {
        try {
            ClassPool classPool = ClassPool.getDefault();
            CtClass applicationResourcesCtClass = classPool.makeClass(APP_FUSE_RESOURCE_FILE_NAME);
            return applicationResourcesCtClass.toClass();
        } catch (CannotCompileException e) {
            throw new RuntimeException("Unable to instantiate Wicket application", e);
        }
    }

    private void initBootstrap() {
        BootstrapSettings settings = new BootstrapSettings();
        Bootstrap.install(this, settings);
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return Home.class;
    }

    @Override
    protected Class<? extends AuthenticatedWebSession> getWebSessionClass() {
        return SSAuthenticatedWebSession.class;
    }

    @Override
    protected Class<? extends WebPage> getSignInPageClass() {
        return Login.class;
    }

    protected ApplicationContext getContext() {
        return WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
    }
}
