package com.gadgroup.online.core.dao;

import com.gadgroup.online.core.model.Person;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.queryParser.MultiFieldQueryParser;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.util.Version;
import org.appfuse.dao.SearchException;
import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.Session;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tvu on 25.01.15.
 */
@Repository("personDao")
public class PersonDaoImpl extends GenericDaoHibernate<Person, Long> implements PersonDao {
    public PersonDaoImpl() {
        super(Person.class);
    }

    @Override
    public List<Person> searchPerson(String term) {
        Session sess = getSession();
        FullTextSession txtSession = Search.getFullTextSession(sess);

        org.apache.lucene.search.Query qry;
        try {
            Analyzer analyzer = txtSession.getSearchFactory().getAnalyzer(Person.class);
            String[] queries = new String[] {term, term};
            String[] fnames = new String[] {"first_name", "last_name"};
            qry = MultiFieldQueryParser.parse(Version.LUCENE_35, queries, fnames, analyzer);
        } catch (ParseException ex) {
            throw new SearchException(ex);
        }
        org.hibernate.search.FullTextQuery hibQuery = txtSession.createFullTextQuery(qry, Person.class);
        return hibQuery.list();
    }
}
