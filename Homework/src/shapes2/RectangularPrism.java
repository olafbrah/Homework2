package shapes2;

public class RectangularPrism extends Shapes3D{
	double s1;
	double s2;
	double s3;
	public RectangularPrism(double s1, double s2, double s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	
	public RectangularPrism() {
		super();
	}
	
	public double volume() {
		return s1 * s2 * s3;
	}
	
	public double surfaceArea() {
		return 2 * ((s1 * s2) + (s2 * s3) + (s1 * s3)); 
	}
}
