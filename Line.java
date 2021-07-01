package Geometry;
import java.util.Objects;

public class Line {
	@Override
	public int hashCode() {
		return Objects.hash(p1, p2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Line other = (Line) obj;
		return Objects.equals(p1, other.p1) && Objects.equals(p2, other.p2);
	}
	public Point p1;
	public Point p2;
	public double getLength() {
		return Math.sqrt(((p2.x-p1.x)*(p2.x-p1.x))+((p2.y-p1.y)*(p2.y-p1.y)));
	}
	public double compareTo(Line line2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}