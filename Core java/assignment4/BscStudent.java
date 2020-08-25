
public class BscStudent extends Students {
	private String specialization;
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	private String collegeName;
	public BscStudent()
	{
		
	}
	public BscStudent(int rollno,String name,String specialization,String collegeName)
	{
		super(rollno,name);
		this.specialization=specialization;
		this.collegeName=collegeName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\t"+specialization+"\t"+collegeName;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		BscStudent bscstudent=(BscStudent)obj;
		return super.equals(bscstudent) && this.getSpecialization().equals(bscstudent.getSpecialization()) && this.getCollegeName().equals(bscstudent.getCollegeName());
	
	}

}
