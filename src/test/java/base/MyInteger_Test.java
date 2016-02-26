package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
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
	public void testIsEven() {
		int testValue=2;
		MyInteger instance = new MyInteger(testValue);
		assertTrue("isEven failed",instance.isEven());
	}
	@Test
	public void testIsOdd() {
		int testValue=1;
		MyInteger instance = new MyInteger(testValue);
		assertTrue("isOdd failed",instance.isOdd());
	}
	@Test
	public void testIsPrime() {
		int testValue=29;
		MyInteger instance = new MyInteger(testValue);
		assertTrue("isPrime failed",instance.isPrime());
	}
	@Test
	public void testIsEvenFalse() {
		int testValue=3;
		MyInteger instance = new MyInteger(testValue);
		assertFalse("isEven failed",instance.isEven());
	}
	@Test
	public void testIsOddFalse() {
		int testValue=2;
		MyInteger instance = new MyInteger(testValue);
		assertFalse("isOdd failed",instance.isOdd());
	}
	@Test
	public void testIsPrimeFalse() {
		int testValue=10;
		MyInteger instance = new MyInteger(testValue);
		assertFalse("isPrime failed",instance.isPrime());
	}
	@Test
	public void testIsEvenStatic() {
		int testValue=2;
		assertTrue("isEven Static failed",MyInteger.isEven(testValue));
	}
	@Test
	public void testIsOddStatic() {
		int testValue=1;
		assertTrue("isOdd Static failed",MyInteger.isOdd(testValue));
	}
	@Test
	public void testIsPrimeStatic() {
		int testValue=11;
		assertTrue("isPrime Static failed",MyInteger.isPrime(testValue));
	}
	@Test
	public void testIsEvenStaticFalse() {
		int testValue=7;
		assertFalse("isEven Static failed",MyInteger.isEven(testValue));
	}
	@Test
	public void testIsOddStaticFalse() {
		int testValue=6;
		assertFalse("isOdd Static failed",MyInteger.isOdd(testValue));
	}
	@Test
	public void testIsPrimeStaticFalse() {
		int testValue=100;
		assertFalse("isPrime Static failed",MyInteger.isPrime(testValue));
	}
	@Test
	public void testIsEvenMyInteger() {
		MyInteger testValue=new MyInteger(2);
		assertTrue("isEven MyInteger failed",MyInteger.isEven(testValue));
	}
	@Test
	public void testIsOddMyInteger() {
		MyInteger testValue=new MyInteger(9);
		assertTrue("isOdd MyInteger failed",MyInteger.isOdd(testValue));
	}
	@Test
	public void testIsPrimeMyInteger() {
		MyInteger testValue=new MyInteger(31);
		assertTrue("isPrime MyInteger failed",MyInteger.isPrime(testValue));
	}
	@Test
	public void testEqualsInt() {
		MyInteger testValue=new MyInteger(2);
		int otherTestValue=2;
		assertTrue("equals int failed",testValue.equals(otherTestValue));
	}
	@Test
	public void testEqualsIntFalse() {
		MyInteger testValue=new MyInteger(2);
		int otherTestValue=3;
		assertFalse("equals int failed",testValue.equals(otherTestValue));
	}
	
	@Test
	public void testEqualsMyInteger() {
		MyInteger testValue=new MyInteger(2);
		MyInteger otherTestValue= new MyInteger(2);
		assertTrue("equals MyInteger failed",testValue.equals(otherTestValue));
	}
	@Test
	public void testEqualsMyIntegerFalse() {
		MyInteger testValue=new MyInteger(2);
		MyInteger otherTestValue= new MyInteger(3);
		assertFalse("equals MyInteger failed",testValue.equals(otherTestValue));
	}

}
