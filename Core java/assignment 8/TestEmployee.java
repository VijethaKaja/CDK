import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.employeeAssignment.EmpIOImpl;
import com.employeeAssignment.EmployeeOperationsImpl;
import com.pojo.Address;
import com.pojo.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EmployeeOperationsImpl EO=new EmployeeOperationsImpl();
		EmpIOImpl IO=new EmpIOImpl();
		int num;
		List<Employee> employee=new ArrayList<Employee>();
		employee.add(new Employee(1,"v",new Address("h",3,"t")));
		employee.add(new Employee(2,"x",new Address("k",4,"a")));
		IO.addToFile(employee);
		System.out.println("select an operation\n1. add Employee\n2. update Employee\n3. findEmployee by id\n4. find all\n5. delete employee\n6.STOP");
		while(true)
		{
			System.out.println("Enter option");
			num=sc.nextInt();
			switch(num)
			{
			case 1:
				System.out.println("Enter employee details");
				boolean added=EO.addEmployee(IO.readFromUser());
				if(added)
				{
					System.out.println("employee added");
				}
				else
				{
					System.out.println("cannot add employee");
				}
				break;
			case 2:
				System.out.println("Enter employee details");
				Employee updated=EO.updateEmployee(sc.nextInt(),sc.next());
				System.out.println("Updated");
				break;
			case 3:
				System.out.println("Enter employee details");
				Employee found=EO.findEmployeeById(sc.nextInt());
				System.out.println("Found");
				break;
			case 4:
				EO.findAllEmployees();
				break;
			case 5:
				System.out.println("Enter employee details");
				Employee deleted=EO.deleteEmployee(sc.nextInt());
				System.out.println("Deleted");
				break;
			case 6:
				sc.close();
				System.exit(0);
				
			}
		}

	}

}
