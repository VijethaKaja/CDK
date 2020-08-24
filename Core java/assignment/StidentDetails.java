
public class StidentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stu=new Student[5];
		stu[0]=new Student("a",10,9,6,new int[] {40,60,90,20});
		stu[1]=new Student("b",9,6,4,new int[]{70,45,23,67});
		stu[2]=new Student("c",12,7,3,new int[]{12,62,90,22});
		stu[3]=new Student("d",14,6,2,new int[]{55,75,90,20});
		stu[4]=new Student("e",15,8,5,new int[]{40,60,44,78});
		for(Student s:stu){
			s.display();
		}
	}

}
