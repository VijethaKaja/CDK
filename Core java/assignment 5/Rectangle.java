
public class Rectangle extends Shapes implements Calculation {
	private int length,breadth;
	public Rectangle()
	{
		super("Rectangles");
	}
	public Rectangle(int length,int breadth)
	{
		super("Rectangles");
		this.length=length;
		this.breadth=breadth;
	}
	
	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return length*breadth ;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(length+breadth);
	}

}
