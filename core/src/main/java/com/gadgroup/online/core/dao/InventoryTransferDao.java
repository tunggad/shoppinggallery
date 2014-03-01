package com.gadgroup.online.core.dao;

import com.gadgroup.online.core.model.InventoryTransfer;
import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

/**
 * DAO for <code>InventoryTransfer</code> domain object.
 *
 * Created by tvu on 01.03.14.
 */
@Repository("inventoryTransferDao")
public class InventoryTransferDao extends GenericDaoHibernate<InventoryTransfer, Long> {
    /**
     * Default constructor for Spring to creating bean.
     */
    public InventoryTransferDao() {
        super(InventoryTransfer.class);
    }
}
