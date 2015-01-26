package com.gadgroup.online.core.service;

import com.gadgroup.online.core.model.Person;
import org.appfuse.service.GenericManager;

import java.util.List;

/**
 * Created by tvu on 25.01.15.
 */
public interface PersonManager extends GenericManager<Person, Long> {
    public List<Person> searchPerson(String term);
}
