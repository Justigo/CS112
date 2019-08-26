/**
* @author Justin Le
* 8/26/19
*/

import java.util.Scanner;

/**
* Class that uses the Babylon algorithm
*/
public class BabylonSqr{
	private static final int iterations = 5;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("What number would you like to find the square root of?: ");
		double num = input.nextDouble();
		double guess = num / 2.0;
		double babyNum = babyAlg(num, guess, 0);
		System.out.printf("After %d iterations of the Babylonian algorithm, the square root is %.2f\n", iterations, babyNum);

	}

	/**
	* @param num
	* @param guess
	* @param count
	* @return square root of num using the Babylon algorithm after 'iterations' times
	*/
	public static double babyAlg(double num, double guess, int count){
		if(count == iterations){
			return guess;
		}
		double r = num / guess;
		guess = (guess + r) / 2.0;
		return babyAlg(num, guess, ++count);
	}
}