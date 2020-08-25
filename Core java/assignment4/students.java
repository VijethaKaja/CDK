
public class Students {
	private int rollno;
	private String name;
	public Students()
	{
		
	}
	public Students(int rollno,String name)
	{
		super();
		this.rollno=rollno;
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollno+"\t"+name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
