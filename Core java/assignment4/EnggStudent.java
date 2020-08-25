
public class EnggStudent extends Students {
	private String stream;
	private String collegeName;
	public EnggStudent()
	{
		
	}
	public EnggStudent(int rollno,String name,String stream,String collegeName)
	{
		super(rollno,name);
		this.stream=stream;
		this.collegeName=collegeName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\t"+stream+"\t"+collegeName;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		EnggStudent enggstudent=(EnggStudent)obj;
		return super.equals(enggstudent) && this.getStream().equals(enggstudent.getStream()) && this.getCollegeName().equals(enggstudent.getCollegeName());

	}

}
