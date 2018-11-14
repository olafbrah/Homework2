package shapes2;

public abstract class Polygon extends Shape2D{
	int sides;
	public Polygon(int x) {
		this.sides=x;
	}
	public abstract double perimeter();
	public double distanceFormula(int x1, int y1, int x2, int y2) {
		 return (Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)));
	 }
}
