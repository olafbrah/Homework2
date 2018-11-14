package shapes;

public class Square extends Shape{
	double len;
	public Square(double len) {
		this.len = len;
	}
	public double getArea() {
		return Math.pow(len, 2);
	}
}
