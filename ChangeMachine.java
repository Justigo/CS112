/**
* @author Justin Le
* 8/23/19
*/
import java.util.Scanner;
import java.lang.Math;

/**
* Class that converts an amount into change
*/
public class ChangeMachine{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("How much would you like to convert to change?: ");
		double amount = input.nextDouble();
		int[] change = exchange(amount);
		printChange(change);
	}
	/**
	* Method that calculates the change except for nickels
	* @param amount
	* @return gives an array with all the changed organized
	*/
	public static int[] exchange(double amount){
		int dollar10 = (int)(amount / 10);
		amount %= 10;
		int dollar5 = (int)(amount / 5);
		amount %= 5;
		int dollar1 = (int)(amount / 1);
		amount %= 1;
		int cents50 = (int)(amount/.50);
		amount %= .50;
		int quarters = (int)(amount/.25);
		amount %= .25;
		int dime = (int)(amount/.10);
		amount %= .10;
		int penny = Math.round((float)(amount/0.01));
		int[] change = new int[]{dollar10, dollar5, dollar1, cents50, quarters, dime, penny};
		return change;

	}

	/**
	* Method that takes the array of change and prints them in order
	* @param change
	*/
	public static void printChange(int[] change){
		System.out.printf("$ 10 = %d\n" +
						   "$ 5 = %d\n" +
						   "$ 1 = %d\n" +
						 "50 cents = %d\n" +
						 "Quarters = %d\n" +
						 	"Dimes = %d\n" +
						 	"Penny = %d",
						 	change[0], change[1], change[2], change[3], change[4], change[5], change[6]);
	}
	
}