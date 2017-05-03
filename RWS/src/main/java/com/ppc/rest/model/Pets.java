package com.ppc.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PETS")
public class Pets {
	
	@Id
	@Column(name="id")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="name")
	String name;	
	
	@Column(name="type")
	int type;

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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" , "+this.name+" , "+this.type;
	}

}
