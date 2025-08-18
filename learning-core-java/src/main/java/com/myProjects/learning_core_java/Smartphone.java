package com.myProjects.learning_core_java;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Smartphone {
	@Id
	private int id;
	private String name;
	@ManyToOne
	private Person owner;
	
	
	
	public Smartphone() {
		super();
	}
	public Smartphone(int id, String name, Person owner) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
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
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Smartphone [id=" + id + ", name=" + name + ", owner=" + owner + "]";
	}
}
