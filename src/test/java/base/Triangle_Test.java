package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle_Test {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDefaultConstrucotr() {
		Triangle t = new Triangle();
		assertTrue(1 == t.getSide1());
		assertTrue(1 == t.getSide2());
		assertTrue(1 == t.getSide3());
	}

	@Test
	public void testSpecificConstructor() {
		Triangle t = new Triangle(3, 4, 5);
		assertTrue(3 == t.getSide1());
		assertTrue(4 == t.getSide2());
		assertTrue(5 == t.getSide3());
	}

	@Test
	public void testArea() {
		Triangle t = new Triangle(3, 4, 5);
		assertTrue(6.0 == t.getArea());
	}

	@Test
	public void testPerimeter() {
		Triangle t = new Triangle(3, 4, 5);
		assertTrue(12.0 == t.getPerimeter());
	}

	@Test
	public void testToString() {
		Triangle t = new Triangle(3, 4, 5);
		String tempString = "";
		tempString += "The triangle with sides:\n";
		tempString += "a = 3.0\n";
		tempString += "b = 4.0\n";
		tempString += "c = 5.0\n";
		tempString += "Has a perimeter of 12.0\n";
		tempString += "And an area of 6.0";
		assertTrue(tempString.equals(t.toString()));
	}

	@Test
	public void testDefaultConstructorFalse() {
		Triangle t = new Triangle();
		assertFalse(0 == t.getSide1());
		assertFalse(0 == t.getSide2());
		assertFalse(0 == t.getSide3());
	}

	@Test
	public void testSpecificConstructorFalse() {
		Triangle t = new Triangle(3, 4, 5);
		assertFalse(1 == t.getSide1());
		assertFalse(1 == t.getSide2());
		assertFalse(1 == t.getSide3());
	}

	@Test
	public void testAreaFalse() {
		Triangle t = new Triangle(3, 4, 5);
		assertFalse(12 == t.getArea());
	}

	@Test
	public void testPerimeterFalse() {
		Triangle t = new Triangle(3, 4, 5);
		assertFalse(6 == t.getPerimeter());
	}

	@Test
	public void testToStringFalse() {
		Triangle t = new Triangle(3, 4, 5);
		String tempString = "";
		tempString += "The triangle with sides:";
		tempString += "a: 3";
		tempString += "b: 4";
		tempString += "c: 5";
		tempString += "Has a perimeter of 12";
		tempString += "And an area of 6";
		assertFalse(tempString.equals(t.toString()));
	}

}
