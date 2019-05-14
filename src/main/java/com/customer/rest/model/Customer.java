package com.customer.rest.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
	@Id
	public ObjectId _id;
	String firstName;
	String lastName;
	int    age;
	
	public Customer(ObjectId _id, String firstName, String lastName, int age) {
		this._id = _id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
	}
	
	public String get_id() {
		return _id.toHexString(); 
	}
	  
	public void set_id(ObjectId _id) { 
		this._id = _id; 
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Customer details: id: "+_id+" First Name:"+firstName+" Last Name:"+lastName+" age:"+age;
	}
}
