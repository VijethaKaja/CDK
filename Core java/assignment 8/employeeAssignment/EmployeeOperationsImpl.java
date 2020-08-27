package com.employeeAssignment;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Employee;

public class EmployeeOperationsImpl implements EmployeeOperations {
	EmpIOImpl io=new EmpIOImpl();
	List<Employee>employee1=new ArrayList<Employee>();
	Employee e=new Employee();
	@Override
	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		employee1=io.readFromFile();
		employee1.add(employee);
		io.addToFile(employee1);
		return true;
	}

	@Override
	public Employee updateEmployee(int id, String name) {
		// TODO Auto-generated method stub
		employee1=io.readFromFile();
		for(Employee emp:employee1){
			if(emp.getEmpId()==id){
				emp.setEmpName(name);
				e=emp;
				break;
			}
		}
		if(e!=null){
			io.displayToUser(e); 
			io.addToFile(employee1);}
		else
			System.out.println("Employee not found");
		return e; 
	}

	@Override
	public Employee deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employee1=io.readFromFile();
		for(Employee emp:employee1){
			if(emp.getEmpId()==id){
				employee1.remove(emp);
				e=emp;
				break;
			}
		}
		if(e!=null){
			io.displayToUser(e); 
			io.addToFile(employee1);}
		else
			System.out.println("Employee not found");
		return e; 
	}

	@Override
	public Employee findEmployeeById(int id) {
		// TODO Auto-generated method stub
		employee1=io.readFromFile();
		for(Employee emp:employee1){
			if(emp.getEmpId()==id){
				e=emp;
				break;
			}
		}
		if(e!=null){
			io.displayToUser(e); 
			io.addToFile(employee1);}
		else
			System.out.println("Employee not found");
		return e;
	}

	@Override
	public void findAllEmployees() {
		// TODO Auto-generated method stub
		employee1=io.readFromFile();
		for(Employee emp:employee1){
			System.out.println(emp);
			}
		}
	}


