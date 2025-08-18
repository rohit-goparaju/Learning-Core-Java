package com.myProjects.learning_core_java;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

/**
 * 
 */
@Entity
public class Person {

	@Id
	private int id;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Person spouse;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	private List<Smartphone> smartphones;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "people")
	private List<Address> addressList;
	
	public Person() {
		super();
	}

	
	public Person(int id, String name, Person spouse, List<Smartphone> smartphones, List<Address> addressList) {
		super();
		this.id = id;
		this.name = name;
		this.spouse = spouse;
		this.smartphones = smartphones;
		this.addressList = addressList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getSpouse() {
		return spouse;
	}

	public void setSpouse(Person spouse) {
		this.spouse = spouse;
	}

	public List<Smartphone> getSmartphones() {
		return smartphones;
	}

	public void setSmartphones(List<Smartphone> smartphones) {
		if(this.smartphones == null)
			this.smartphones = smartphones;
		else
			this.smartphones.addAll(smartphones);
	}
	
	public void addSmartphone(Smartphone phone) {
		if(this.smartphones == null) {
			this.smartphones = new ArrayList<Smartphone>();
		}
		this.smartphones.add(phone);
	}

	
	public List<Address> getAddressList() {
		return addressList;
	}


	public void setAddressList(List<Address> addressList) {
		if(this.addressList == null)
			this.addressList = addressList;
		else
			this.addressList.addAll(addressList);
	}
	
	public void addAddress(Address address) {
		if(this.addressList == null)
			this.addressList = new ArrayList<Address>();
		this.addressList.add(address);
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name+"]";
	}
	
}
