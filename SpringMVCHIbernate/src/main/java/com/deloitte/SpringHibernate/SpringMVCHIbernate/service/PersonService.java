package com.deloitte.SpringHibernate.SpringMVCHIbernate.service;

import java.util.List;

import com.deloitte.SpringHibernate.SpringMVCHIbernate.dao.PersonDAO;
import com.deloitte.SpringHibernate.SpringMVCHIbernate.model.Person;


public interface PersonService {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
	
}
