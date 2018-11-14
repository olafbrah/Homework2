package shapes2;

public class Quadrilateral extends Polygon {
	int x1;
	int x2;
	int x3;
	int x4;
	int y1;
	int y2;
	int y3;
	int y4;
	
	double s1 = distanceFormula(x1, y1, x2, y2);
	double s2 = distanceFormula(x2, y2, x3, y3);
	double s3 = distanceFormula(x3, y3, x4, y4);
	double s4 = distanceFormula(x4, y4, x1, x1);
	
	
	public Quadrilateral(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
		super(4);
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;
	}
	
	public Quadrilateral() {
		super(4);
	}
	
	public double perimeter() {
		return s1 + s2 + s3 + s4;
	}

	
	public double area() {
		return 0;
	}
	
/*	public double area() {
		return Math.max(s1, Math.max(s2, Math.max(s3, s4)))*Math.min(s1, Math.min(s2, Math.min(s3, s4)));
	}
	*/
}

