package com.myProjects.learning_core_java;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Address {

	@Id
	private int id;
	private String address;
	@ManyToMany
	private List<Person> people;
	
	public Address() {
		super();
	}

	public Address(int id, String address, List<Person> people) {
		super();
		this.id = id;
		this.address = address;
		this.people = people;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		if(this.people == null)
			this.people = people;
		else
			this.people.addAll(people);
	}
	
	public void addPerson(Person p) {
		if(this.people == null)
			this.people = new ArrayList<Person>();
		this.people.add(p);
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + ", people=" + people + "]";
	}
	
}
