package com.PersonAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pojo.Person;

public class PersonImpl implements PersonIO {
	Scanner sc=new Scanner(System.in);
	@Override
	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		int id,n=0;
		String name;
		List<Person> person=new ArrayList<Person>();
		while(n<5){
		System.out.println("Enter person details");
		id=sc.nextInt();
		name=sc.next();
		person.add(new Person(id,name));
		n+=1;
		}
		
		return person;
	}
	
	@Override
	public Person findById(int id, List<Person> persons) {
		// TODO Auto-generated method stub
		for(Person p:persons){
			if(p.getpId()==id){
				return p;
			}
		}
		return null;
	}

	@Override
	public boolean removePerson(int id, List<Person> persons) {
		// TODO Auto-generated method stub
		for(Person p:persons){
			if(p.getpId()==id){
				persons.remove(new Integer(id));
				return true;
			}
		}
		return false;
	}

	public Person updatePerson(int id, List<Person> persons) {
		// TODO Auto-generated method stub
		String name;
		for(Person p :persons){
			if(p.getpId()==id){
				System.out.println("Enter name");
				name=sc.next();
				p.setName(name);
				return p;
			}
		}
		return null;
	}

	@Override
	public List<Person> displayPersons(List<Person>persons) {
		// TODO Auto-generated method stub
		for(Person person: persons){
			System.out.println(person.toString());
		}
		return persons;
	}

	@Override
	public List<Person> addPerson(List<Person> persons, Person person) {
		// TODO Auto-generated method stub
		persons.add(person);
		return persons;
	}
	
	
}
