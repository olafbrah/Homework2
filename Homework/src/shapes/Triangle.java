package shapes;

public class Triangle extends Shape {
double base;
double height;
public Triangle(double base, double height) {
	this.height = height;
	this.base = base;
}
public double getArea() {
	return 0.5*base*height;
}
}
