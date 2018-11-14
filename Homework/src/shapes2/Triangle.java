package shapes2;
import java.lang.Math;
public class Triangle extends Polygon{
	public int x1;
	public int x2;
	public int x3;
	public int y1;
	public int y2;
	public int y3;
	
	double s1 = distanceFormula(x1, y1, x2, y2);
	double s2 = distanceFormula(x2, y2, x3, y3);
	double s3 = distanceFormula(x1, y1, x3, y3);
	
	public Triangle(int x1, int y1, int x2, int y2,int x3, int y3) {
		super(3);
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
	}
	public double perimeter() {
		return s1 + s2 + s3;
	}
	public double area() {
		double angle = Math.acos((Math.pow(s1, 2)+Math.pow(s3, 2)-Math.pow(s2, 2))/(2*s1*s2));
		double height = s2*Math.sin(angle);
		return 0.5*height*s3;
	}
	
}
