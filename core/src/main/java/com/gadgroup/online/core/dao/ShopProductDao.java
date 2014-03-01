package com.gadgroup.online.core.dao;

import com.gadgroup.online.core.model.ShopProduct;
import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

/**
 * DAO for <code>ShopProduct</code> domain object.
 *
 * Created by tvu on 01.03.14.
 */
@Repository("shopProductDao")
public class ShopProductDao extends GenericDaoHibernate<ShopProduct, Long> {
    /**
     * Default constructor for Spring to creating bean.
     */
    public ShopProductDao() {
        super(ShopProduct.class);
    }
}
