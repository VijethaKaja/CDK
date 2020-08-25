
public class TestStudent {

	  public static boolean search(Students[]students,Students student)
	{
		  for(Students obj1: students)
			  if(obj1.getClass().equals(student.getClass()))
				  if(obj1.equals(student))
					  return true;
		  return false;
			  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students[] students=new Students[7];
		students[0]=new EnggStudent(1,"Z","CSE","A");
		students[1]=new EnggStudent(2,"Y","ECE","B");
		students[2]=new EnggStudent(3,"X","IT","C");
		students[3]=new BscStudent(4,"W","Aviation","D");
		students[4]=new BscStudent(5,"V","Animation","B");
		students[5]=new CommerceStudent(6,"U","Accounting","A");
		students[6]=new CommerceStudent(7,"T","Economics","C");
		for(Students s:students)
		{
			System.out.println(s);
		}
		CommerceStudent commercestudent=new CommerceStudent(6,"U","Accounting","A");
		boolean flag=search(students,commercestudent);
		if (flag)
			System.out.println("EQUAL");
		else
			System.out.println("NOT EQUAL");
		
		Students enggstudent=new EnggStudent(1,"Z","EEE","A");
		flag=search(students,enggstudent);
		if (flag)
			System.out.println("EQUAL");
		else
			System.out.println("NOT EQUAL");
		
		

	}

}
