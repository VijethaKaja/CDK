import java.util.*;
class Emp{
		private  int empno;
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		private String ename;
		private double salary;
		
		
}
class asgn{
	public static void main(String args[]) {
	String employeedetails[]=new String[5];
	Scanner sc=new Scanner(System.in);
	Emp e= new Emp();
	int no=e.getEmpno();
	String name=e.getEname();
	double sal=e.getSalary();
	for(int i=0;i<5;i++)
	{
		no=sc.nextInt();
		name=sc.next();
		sal=sc.nextDouble();
	    employeedetails[i]=Integer.toString(no)+" "+name+" "+Double.toString(sal);
		
	}
	System.out.println("empno  ename  salary");
	for(int i=0;i<5;i++)
	{
		System.out.println(employeedetails[i]);
	}
	sc.close();
	
	}
	
	
}

