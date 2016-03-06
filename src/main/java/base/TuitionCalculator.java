package base;
import java.util.Scanner;
public class TuitionCalculator {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double tuition;
		double increase;
		double APR;
		double yearsToRepay;
		double afterGraduation;
		double monthlyPayments;
		
		System.out.println("What is the inital tution cost?");
		tuition=input.nextDouble();
		System.out.println("What is the yearly percentage increase?");
		do {
			System.out.println("Enter a number greater than 0");
			increase=input.nextDouble()/100;
		}while (increase<0);
		System.out.println("What is the APR for the loan?");
		do {
			System.out.println("Enter a number greater than 0");
			APR=input.nextDouble()/100;
		}while (APR<0);
		System.out.println("For how many years will you be paying of the loan");
		yearsToRepay=input.nextDouble();
		afterGraduation=annualIncrease(tuition,increase);
		monthlyPayments=PaymentsPerMonth(afterGraduation,APR,yearsToRepay*12);
		System.out.printf("At this tuititon rate you will owe the college $%.2f\n",afterGraduation);
		System.out.printf("You can pay it off in "+(int)(yearsToRepay*12)+" months at $%.2f a month.",monthlyPayments);
	}
	/**
	 * Function takes a tuition and interest rate and calculates how
	 * much it will cost to attend 4 years of college
	 * @param tuition - yearly cost
	 * @param increase - 1.00-.00
	 * @return
	 */
	public static double annualIncrease(double tuition, double increase){
		
		double endValue=0;
		for (int semesters=1;semesters<=4;semesters++){
			endValue+=tuition*(1+increase);
		}
		return endValue;
	}
	
	/**
	 * Given a Principal value, an interest rate, and the number of payments that need to be made
	 * this method calculates the amount of money that needs to be paid each month
	 * @param principal
	 * @param interest - domain of 1.00-.00
	 * @param numberOfPayments - in months
	 * @return
	 */
	public static double PaymentsPerMonth(double principal,double interest,double numberOfPayments){
		
		double PMT=0;
		PMT=principal*((interest*Math.pow((1+interest),numberOfPayments))/(Math.pow((1+interest),numberOfPayments-1)));
		return PMT;
	}
}
