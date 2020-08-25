public class SalariedEmployee extends Employee{
	private long salary;
	private double incentives;
	private double ta;
	long total;
	public SalariedEmployee()
	{
		salary=10000;
		incentives=800.00;
		ta=200.00;
	}
	public SalariedEmployee(long salary,double incentive,double ta)
	{
		super();
		this.salary=salary;
		this.incentives=incentive;
		this.ta=ta;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public double getIncentives() {
		return incentives;
	}
	public void setIncentives(double incentives) {
		this.incentives = incentives;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	public void display()
	{
		super.display();
		System.out.println("Salary: "+salary+" incentives are "+incentives+" ta is "+ta);
	}
	public long totalSalary()
	{
		total=(long)(salary+incentives+ta);
		return total;
	}
	
	
	

}
