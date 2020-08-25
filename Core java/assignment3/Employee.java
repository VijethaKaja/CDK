
public class Employee {
private int empId;
private String empName;
public Employee()
{
	empId=1;
	empName="A";
	
}
public Employee(int id,String ename)
{
	super();
	this.empId=id;
	this.empName=ename;
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

public void display()
{
	System.out.println("id is "+empId+" name is "+empName);
}

}
