package com.cap.anurag.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="empmicro")
public class Employee {
@Id
@GeneratedValue
@Column(length=10)
private int id;
@Column(length=10)
private String ename;

@Column(length=10)
private int esal;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Employee() {
	super();
}
public int getEsal() {
	return esal;
}
public void setEsal(int esal) {
	this.esal = esal;
}
public Employee(int id, String ename, int esal) {
	super();
	this.id = id;
	this.ename = ename;
	this.esal = esal;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", ename=" + ename + ", esal=" + esal + "]";
}


}
