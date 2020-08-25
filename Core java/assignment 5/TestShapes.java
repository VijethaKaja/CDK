
public class TestShapes {
	public static void main(String[] args) {
		Circles s1=new Circles(10);
		Rectangle s2=new Rectangle(4,5);
		Square s3=new Square(6);
		System.out.println(s1.getName()+" Area is "+s1.Area()+" perimeter is "+s1.perimeter());
		System.out.println(s2.getName()+" Area is "+s2.Area()+" perimeter is "+s2.perimeter());
		System.out.println(s3.getName()+" Area is "+s3.Area()+" perimeter is "+s3.perimeter());
		
	}

}
