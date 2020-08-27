package com.pojo;

import java.io.Serializable;

public class Employee implements Serializable{
private int empId;
private String empName;
Address address;
public Employee()
{
	empId=1;
	empName="A";
	
}
public Employee(int id,String ename,Address address)
{
	super();
	this.empId=id;
	this.empName=ename;
	this.address=address;
}

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId+"\t"+empName+"\t"+address;
	}
}
