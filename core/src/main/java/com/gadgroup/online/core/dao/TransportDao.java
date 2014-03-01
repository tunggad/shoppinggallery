package com.gadgroup.online.core.dao;

import com.gadgroup.online.core.model.GoodsTranssport;
import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

/**
 * DAO for <code>GoodsTransport</code> domain object.
 *
 * Created by tvu on 01.03.14.
 */
@Repository("transportDao")
public class TransportDao extends GenericDaoHibernate<GoodsTranssport, Long> {
    /**
     * Default constructor for Spring to creating bean.
     */
    public TransportDao() {
        super(GoodsTranssport.class);
    }
}
