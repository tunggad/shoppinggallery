package com.gadgroup.online.core.service;

import com.gadgroup.online.core.dao.PersonDao;
import com.gadgroup.online.core.model.Person;
import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tvu on 25.01.15.
 */
@Service("personManager")
public class PersonManagerImpl extends GenericManagerImpl<Person, Long> implements PersonManager{
    private PersonDao personDao;

    @Autowired
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
        this.dao = personDao;
    }

    public List<Person> searchPerson(String term) {
        return this.personDao.searchPerson(term);
    }
}
