
public class Student {
	private String name;
	private int age,standard,id;
	private int[] marks=new int[4];
	public Student()
	{
	
	}
	public Student(String n,int a,int st, int i,int[] m)
	{
		this.name=n;
		this.age=a;
		this.standard=st;
		this.id=i;
		this.marks=m;
	}
	public void setAge(int n)
	{
		this.age=n;
	}
	public void setId(int n)
	{
		this.id=n;
	}
	public void setStandard(int n)
	{
		this.standard=n;
	}
	public void setMarks(int[] n)
	{
		this.marks=n;
	}
	public void setName(String s)
	{
		this.name=s;
	}
	public int getAge()
	{
		return this.age;
	}
	public String getName()
	{
		return this.name;
	}
	public int getId()
	{
		return this.id;
	}
	public int getStandard()
	{
		return this.standard;
	}
	public int[] getMarks()
	{
		return this.marks;
	}
	void display()
	{
		System.out.print(name+"\t"+age+"\t"+standard+"\t"+id+"\t");
		for (int i:marks)
			System.out.print(i+" ");
		System.out.println();
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.display();
	}

}
