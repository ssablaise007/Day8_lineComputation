package Day8_Line;

import Geometry.Line2;
import Geometry.Point2;

public class Main2 {

	public static void main(String args[]) {
		
		Point p1 = new Point();
		p1.x = 4;
		p1.y = 3;
		
		Point p2 = new Point();
		p2.x = 6;
		p2.y = 3;
		
		Line line1 = new Line();
		line1.p1 = p1;
		line1.p2 = p2;
		
		System.out.println(line1.getLength());
		Line line2 = new Line();
		line2.p1 = p1;
		line2.p2 = p2;
		
		System.out.println(line2.getLength());
		
		System.out.println("Result "+line1.equals(line2));
		 
	
		int check = 0;
		if(check == 0)
			System.out.println("Line1 is equal to Line2");
		else if(check > 0)
		System.out.println("Line1 is greater than Line2");
		else
			System.out.println("Line1 is less than Line2");
	
		
		
}
}