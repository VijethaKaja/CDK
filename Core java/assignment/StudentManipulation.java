
public class StudentManipulation {
	Student[] createStudents()
	{
		Student[] stu=new Student[5];
		stu[0]=new Student("a",10,9,6,new int[] {40,60,90,20});
		stu[1]=new Student("b",9,6,4,new int[]{70,45,23,67});
		stu[2]=new Student("c",12,7,3,new int[]{12,62,90,22});
		stu[3]=new Student("d",14,6,2,new int[]{55,75,90,20});
		stu[4]=new Student("e",15,8,5,new int[]{40,60,44,78});
		return stu;
		
	}
	int total(Student st)
	{
		int total=0;
		for(int i:st.getMarks())
		{
			total+=i;
		}
		return total;
	}
	int findmax(Student [] students)
	{
		int max=-9999;
		for( Student s:students)
		{
			int[] marks=s.getMarks();
			for(int i:marks)
			{
				if(i>max)
					max=i;
			}
				
		}
		return max;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManipulation sm=new StudentManipulation();
		Student[] s=sm.createStudents();
		System.out.println("Max is "+sm.findmax(s));
		for(int i=0;i<5;i++)
		System.out.println("Total of "+s[i].getName()+" is "+sm.total(s[i]));
	}

}
