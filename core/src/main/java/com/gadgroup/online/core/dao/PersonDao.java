package com.gadgroup.online.core.dao;

import com.gadgroup.online.core.model.Person;
import org.appfuse.dao.GenericDao;

import java.util.List;

/**
 * Created by tvu on 25.01.15.
 */
public interface PersonDao extends GenericDao<Person, Long>{
    public List<Person> searchPerson(String term);
}
