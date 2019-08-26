/**
* @author Justin Le
* 8/23/19
*/
import java.util.Scanner;
import java.lang.Math;

/**
* Class that finds how much you need to invest to reach a goal in x years
*/
public class MoneyInves{
	private static final double RATE = 2.99 * 0.01;
	private static final double GOAL = 10000;
	private static final int YEARS = 10;

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("How much would you like to deposit?: ");
		double amount = input.nextDouble();
		double result = interest(amount);
		if(result >= 0.01){
			System.out.printf("You will have to deposit $%.2f more today if you want to reach $%.2f in " + 
								YEARS + " years.", result, GOAL);
		}else{
			
			System.out.println("You have deposited enough to achieve $" + GOAL +
				" in " + YEARS + " years.");
		}
	}

	/**
	* Method that finds the total interest that you need to deposit
	* @return total needed to invest
	*/
	public static double totalInterest(){
		return GOAL/Math.pow(1+RATE, YEARS);
	}

	/**
	* Method that returns total needed from how much was invested
	* @param amount 
	* @return total - given
	*/
	public static double interest(double amount){
		double totalNeeded = totalInterest();
		if (amount >= totalNeeded){
			return 0;
		}
		return totalNeeded - amount;
	}
}
