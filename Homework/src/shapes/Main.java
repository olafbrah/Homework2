package shapes;

public class Main {
	public static void main(String args[]) {
		Circle circle = new Circle(7);
		System.out.println(circle.getArea());
		Square square = new Square(6);
		System.out.println(square.getArea());
		Triangle triangle = new Triangle(3,4);
		System.out.println(triangle.getArea());
	}
}
