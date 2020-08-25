
public class Square extends Shapes implements Calculation {
	private int length;
	public Square()
	{
		super("Square");
	}
	public Square(int length)
	{
		super("Square");
		this.length=length;
	
	}
	
	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return length*length;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4*length;
	}

}
