package shapes2;

public class Sphere extends Shapes3D{
	double radius;
	
	public Sphere(double radius) {
		
		this.radius = radius;
	}
	
	public double volume() {
		return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
	}
	
	public double surfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}

}
