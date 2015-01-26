package com.gadgroup.online.batch;

import com.gadgroup.online.core.model.Person;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;
/**
 * Created by tvu on 24.01.15.
 */
public class UKPersonFieldSetMapper implements FieldSetMapper<Person> {
@Override
public Person mapFieldSet(FieldSet fieldSet) throws BindException {
        Person person = new Person();
        person.setFirst_name(fieldSet.readString("first_name"));
        person.setLast_name(fieldSet.readString("last_name"));
        person.setCompany_name(fieldSet.readString("company_name"));
        person.setAddress(fieldSet.readString("address"));
        person.setCity(fieldSet.readString("city"));
        person.setCounty(fieldSet.readString("county"));
        person.setZip(fieldSet.readString("postal"));
        person.setPhone1(fieldSet.readString("phone1"));
        person.setPhone2(fieldSet.readString("phone2"));
        person.setEmail(fieldSet.readString("email"));
        person.setWeb(fieldSet.readString("web"));
        return person;
        }
    }
