/**
* @author Justin Le
* 8/23/19
*/
import java.util.Scanner;

/**
*Class that converts seconds into hours, minutes, seconds
*/
public class SecondConv{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Type how many seconds you want to be converted: ");
		int sec = input.nextInt();
		secToTime(sec);

	}
	
	/**
	* Method that translates seconds to hours, minutes, seconds
	* @param sec
	*/
	public static void secToTime(int sec){
		int hours = sec / 3600;
		sec %= 3600;
		int mins = sec / 60;
		sec %= 60;
		printTime(hours, mins, sec);
	}

	/**
	* Method that prints out the hours, minutes, and seconds
	* @param hours
	* @param mins
	* @param sec
	*/
	public static void printTime(int hours, int mins, int sec){
		System.out.println("Hours = " + hours + 
							"\nMinutes = " + mins +
							"\nSeconds = " + sec);
	}
}