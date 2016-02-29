package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Tuition_Test {
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
	public void testAnnualIncrease() {
		double tuition=12520;
		double increase=.04;
		assertEquals("annualIncrease failed",52083.20,TuitionCalculator.annualIncrease(tuition,increase),1);
	}
	@Test
	public void testPMT() {
		double principal=52083.20;
		double APR=.02;
		double numberOfPayments=300;
		assertEquals("PMT failed",1062.50,TuitionCalculator.PaymentsPerMonth(principal, APR, numberOfPayments),1);
	}
}
