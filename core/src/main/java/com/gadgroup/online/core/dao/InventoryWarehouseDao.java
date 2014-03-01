package com.gadgroup.online.core.dao;

import com.gadgroup.online.core.model.InventoryAtWarehouse;
import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

/**
 * DAO for <code>InventoryAtWarehouse</code> domain object.
 *
 * Created by tvu on 01.03.14.
 */
@Repository("inventoryWarehouseDao")
public class InventoryWarehouseDao extends GenericDaoHibernate<InventoryAtWarehouse, Long> {
    /**
     * Default constructor for Spring to creating bean.
     */
    public InventoryWarehouseDao() {
        super(InventoryAtWarehouse.class);
    }
}
