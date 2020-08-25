
public class TestSalariedEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalariedEmployee SE=new SalariedEmployee(12000,5000.00,400.00);
		SE.display();
		System.out.println("Total salary is "+SE.totalSalary());
	}

}
