package com.gadgroup.online.core.dao;

import com.gadgroup.online.core.model.InventoryUpdate;
import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

/**
 * DAO for <code>InventoryUpdate</code> domain object.
 *
 * Created by tvu on 01.03.14.
 */
@Repository("inventoryUpdateDao")
public class InventoryUpdateDao extends GenericDaoHibernate<InventoryUpdate, Long> {
    /**
     * Default constructor for Spring to creating bean.
     */
    public InventoryUpdateDao() {
        super(InventoryUpdate.class);
    }
}
