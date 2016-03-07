package base;

/**
 * @author Vinay
 *
 */

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	/**
	 * No Parameters Default constructor for Triangle Creates a triangle with
	 * sides (1,1,1) parameters: none returns: instance of triangle
	 */
	public Triangle() {
		// Call the constructor Triangle(double,double,double)
		// With parameters 1,1,1
		this(1, 1, 1);
	}

	/**
	 * Creates a triangle with sides given by the parameters side1, side2, side3
	 * parameters: side1 double side2 double side3 double returns: instance of
	 * triangle
	 */
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/**
	 * Returns side 1 parameters: none returns: double
	 */
	public double getSide1() {
		return side1;
	}

	/**
	 * Returns side 2 parameters: none returns: double
	 */
	public double getSide2() {
		return side2;
	}

	/**
	 * Returns side 3 parameters: none returns: double
	 */
	public double getSide3() {
		return side3;
	}

	/**
	 * Returns the perimeter of the triangle (side1+side2+side3) parameters:
	 * none returns: double
	 */
	@Override
	public double getPerimeter() {
		return getSide1() + getSide2() + getSide3();
	}

	/**
	 * Returns the area of the triangle using Heron's formula
	 * Area=Sqrt(p(p-a)(p-b)(p-c)) where p is perimeter/2 parameters: none
	 * returns double
	 */
	@Override
	public double getArea() {
		// Using Heron's formula
		double p = getPerimeter() / 2;
		double Area = p * (p - getSide1()) * (p - getSide2()) * (p - getSide3());
		Area = Math.pow(Area, .5);
		return Area;
	}

	/**
	 * Generates a string describing the triangle in a user friendly way
	 * 
	 * parameters: none returns: String
	 */
	@Override
	public String toString() {
		String tempString = "";
		tempString += "The triangle with sides:\n";
		tempString += "a = " + getSide1() + "\n";
		tempString += "b = " + getSide2() + "\n";
		tempString += "c = " + getSide3() + "\n";
		tempString += "Has a perimeter of " + getPerimeter() + "\n";
		tempString += "And an area of " + getArea();
		return tempString;
	}
}
