package shapes2;

public class Square extends Quadrilateral{
		double sideLength;
		
		public Square(double sideLength) {
			super();
			this.sideLength = sideLength;
		}
		
		public double perimeter() {
			return 4 * sideLength;
		}
		
		public double area() {
			return Math.pow(sideLength, 2);
		}
	}