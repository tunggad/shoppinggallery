package com.gadgroup.online.core.dao;

import com.gadgroup.online.core.model.GoodsIssue;
import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

/**
 * DAO for <code>GoodsIssue</code> domain object.
 *
 * Created by tvu on 01.03.14.
 */
@Repository("issueDao")
public class IssueDao extends GenericDaoHibernate<GoodsIssue, Long> {
    /**
     * Default constructor for Spring to creating bean.
     */
    public IssueDao() {
        super(GoodsIssue.class);
    }
}
