package com.gadgroup.online.core.dao;

import com.gadgroup.online.core.model.GoodsReceipt;
import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

/**
 * DAO for <code>GoodsReceipt</code> domain object.
 *
 * Created by tvu on 01.03.14.
 */
@Repository("receiptDao")
public class ReceiptDao extends GenericDaoHibernate<GoodsReceipt, Long> {
    /**
     * Default constructor for Spring to creating bean.
     */
    public ReceiptDao() {
        super(GoodsReceipt.class);
    }
}
