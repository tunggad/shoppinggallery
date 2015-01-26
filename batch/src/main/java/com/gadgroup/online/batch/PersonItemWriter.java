package com.gadgroup.online.batch;

import com.gadgroup.online.core.model.Person;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by tvu on 23.01.15.
 */
public class PersonItemWriter implements ItemWriter<Person> {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void write(List<? extends Person> items) throws Exception {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Long maxId = getMaxId(session) + 1;

        for ( int i=0; i<items.size(); i++ ) {
            Person person = items.get(i);
            person.setId(maxId+i);

            session.save(person);
            if ( i % 50 == 0 ) { //same as the JDBC batch size
                //flush a batch of inserts and release memory:
                session.flush();
                session.clear();
            }
        }

        tx.commit();
        session.close();
    }

    private Long getMaxId(Session session) {
        Criteria criteria = session
                .createCriteria(Person.class)
                .setProjection(Projections.max("id"));
        Long maxId = (Long)criteria.uniqueResult();

        if (maxId == null) return 0L;
        else return maxId;
    }
}
