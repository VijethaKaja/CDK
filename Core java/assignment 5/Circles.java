
public class Circles extends Shapes implements Calculation {
	private int radius;
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public Circles()
	{
		super("Circle");
	}
	public Circles(int radius)
	{
		super("Circle");
		this.radius=radius;
	}
	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*3.14*radius;
	}

}
