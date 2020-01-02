package com.DanskeIt.Example;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

private String name;

private String Id;

private Hostel hostel;

public String getName() {
	return name;
}
 
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return Id;
}
 
public void setId(String id) {
	Id = id;
}

@Autowired
public void setHostel(Hostel hostel) {
	this.hostel = hostel;
}


@Override
public String toString() {
	return "Student [name=" + name + ", Id=" + Id + ", hostel=" + hostel + "]";
}

public void display()
{
	System.out.println("Inside student");
	hostel.display();
}
}
