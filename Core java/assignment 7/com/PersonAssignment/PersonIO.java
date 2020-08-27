package com.PersonAssignment;
import java.util.List;
import com.pojo.Person;
public interface PersonIO {
	List<Person> getPersons(); //get data about persons from user
	Person findById(int id, List<Person>persons);//find the person by id
	boolean removePerson(int id,List<Person>persons);//remove person by id
	Person updatePerson(int id,List<Person>persons); //update by id
	List<Person> displayPersons(List<Person>persons); //display data 
	List<Person> addPerson(List<Person> persons, Person person); //add person to list 

}
