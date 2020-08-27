package com.employeeAssignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pojo.Address;
import com.pojo.Employee;

public class EmpIOImpl implements EmpIO {
	Scanner sc=new Scanner(System.in);
	Employee employee=new Employee();

	@Override
	public void addToFile(List<Employee> employees) {
		// TODO Auto-generated method stub
		try(FileOutputStream fo=new FileOutputStream("Employee.txt");ObjectOutputStream oo=new ObjectOutputStream(fo);)
		{
			for(Employee e:employees)
				oo.writeObject(e);
			System.out.println("Added");
		}
		catch(FileNotFoundException f)
		{
			f.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> readFromFile() {
		// TODO Auto-generated method stub
		List<Employee> employee=new ArrayList<Employee>();
		try(FileInputStream fo=new FileInputStream("Employee.txt");ObjectInputStream oo=new ObjectInputStream(fo);)
		{
			
			Object o=oo.readObject();
			try{
			while(o!=null){
			Employee ex=(Employee) o;
			System.out.println(ex.getEmpId()+"\t"+ex.getEmpName()+"\t"+ex.getAddress());
			employee.add(ex);
			o=oo.readObject();
			}
			}
			catch(Exception e)
			{
				System.out.println("Read File");
			}
			return employee;
			}
		catch(FileNotFoundException | ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return employee;
	}

	@Override
	public Employee readFromUser() {
		// TODO Auto-generated method stub
		System.out.println("Enter details");
		Employee e=new Employee(sc.nextInt(),sc.next(),new Address(sc.next(),sc.nextInt(),sc.next()));
		employee=e;
		return e;
	}

	@Override
	public void displayToUser(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println(emp);
	}

}
