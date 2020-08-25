
public class CommerceStudent extends Students {
	private String major;
	private String collegeName;
	public CommerceStudent()
	{
		
	}
	public CommerceStudent(int rollno,String name,String major,String collegeName)
	{
		super(rollno,name);
		this.major=major;
		this.collegeName=collegeName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\t"+major+"\t"+collegeName;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	CommerceStudent commercestudent=(CommerceStudent)obj;
	return super.equals(commercestudent) && this.getMajor().equals(commercestudent.getMajor()) && this.getCollegeName().equals(commercestudent.getCollegeName());
	
	}
}
