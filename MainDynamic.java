package Dynamic;

public class MainDynamic {
	
	public static void main(String[] args)
	{
		Shape s;
		
		Triangle t=new Triangle();
		Rectangle r=new Rectangle();
		
		s=t;
		s.input();
		s.compute_area();
		
		
		s=r;
		s.input();
		s.compute_area();
	}

}
