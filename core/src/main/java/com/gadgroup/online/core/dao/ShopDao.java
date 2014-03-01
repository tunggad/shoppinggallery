package com.gadgroup.online.core.dao;

import com.gadgroup.online.core.model.Shop;
import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

/**
 * DAO for <code>Shop</code> domain object.
 *
 * Created by tvu on 01.03.14.
 */
@Repository("shopDao")
public class ShopDao extends GenericDaoHibernate<Shop, Long> {

    /**
     * Default constructor for Spring to creating bean.
     */
    public ShopDao() {
        super(Shop.class);
    }
}
