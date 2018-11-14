package shapes2;

	public class Hexagon extends Polygon{
		int x1;
		int x2;
		int x3;
		int x4;
		int x5;
		int x6;
		int y1;
		int y2;
		int y3;
		int y4;
		int y5;
		int y6;
		
		double s1 = distanceFormula(x1, y1, x2, y2);
		double s2 = distanceFormula(x2, y2, x3, y3);
		double s3 = distanceFormula(x3, y3, x4, y4);
		double s4 = distanceFormula(x4, y4, x5, y5);
		double s5 = distanceFormula(x5, y5, x6, y6);
		double s6 = distanceFormula(x6, y6, x1, y1);

		public Hexagon(int x1, int x2, int x3, int x4, int x5,int x6, int y1, int y2, int y3, int y4, int y5, int y6) {
			super(6);
			this.x1 = x1;
			this.x2 = x2;
			this.x3 = x3;
			this.x4 = x4;
			this.x5 = x5;
			this.x6 = x6;
			this.y1 = y1;
			this.y2 = y2;
			this.y3 = y3;
			this.y4 = y4;
			this.y5 = y5;
			this.y6 = y6;
		}
		
		public double perimeter() {
			return s1 + s2 + s3 + s4 + s5+s6;
		}
		
		public double area() {
			return ((0.5*perimeter()*(s1/Math.tan(s1/perimeter())*360))/6)+((0.5*perimeter()*(s2/Math.tan(s2/perimeter())*360))/6)+
					((0.5*perimeter()*(s3/Math.tan(s3/perimeter())*360))/6)+((0.5*perimeter()*(s4/Math.tan(s4/perimeter())*360))/6)+
					((0.5*perimeter()*(s5/Math.tan(s5/perimeter())*360))/6)+((0.5*perimeter()*(s6/Math.tan(s6/perimeter())*360))/6);
		}
}
