package com.gadgroup.online.core.dao;

import com.gadgroup.online.core.model.Warehouse;
import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

/**
 * DAO for <code>Warehouse</code> domain object.
 *
 * Created by tvu on 01.03.14.
 */
@Repository("warehouseDao")
public class WarehouseDao extends GenericDaoHibernate<Warehouse, Long> {
    /**
     * Default constructor for Spring to creating bean.
     */
    public WarehouseDao() {
        super(Warehouse.class);
    }
}
