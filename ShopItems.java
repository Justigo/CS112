/**
* @author Justin Le
* 8/26/19
*/
import java.util.Scanner;

/**
* Class that calculates prices of items that someone buys
*/
public class ShopItems{
	private static Scanner input = new Scanner(System.in);
	private static final double TAX = 6.25 * .01;
	private static final int TOTAL_ITEMS = 3;
	private static String[] items = new String[TOTAL_ITEMS];
	private static int[] quantities = new int[TOTAL_ITEMS];
	private static double[] prices = new double[TOTAL_ITEMS];

	public static void main(String[] args){
		for(int itemCount = 0; itemCount< TOTAL_ITEMS; itemCount++){
			itemInfo(itemCount);
		}
		billing();
	}

	/**
	* @param itemCount
	* Method that asks user about the info of the item they're buying
	*/
	public static void itemInfo(int itemCount){
		System.out.printf("Input name of item %d:\n", itemCount+1);
		String item = input.next();
		System.out.printf("Input quantity of item %d:\n", itemCount+1);
		int quantity = input.nextInt();
		System.out.printf("Input price of item %d:\n", itemCount+1);
		double price = input.nextDouble();
		items[itemCount] = item;
		quantities[itemCount] = quantity;
		prices[itemCount] = price;
	}

	/**
	* Method that will print all of the info that the user has given
	*/
	public static void billing(){
		System.out.println("Your bill:");
		System.out.printf("%-30s%-10s%-10s%-10s\n", "Item", "Quantity", "Price", "Total");
		double subtotal =0;
		for(int itemCount = 0; itemCount<TOTAL_ITEMS; itemCount++){
			double itemTotal = quantities[itemCount] * prices[itemCount];
			subtotal += itemTotal;
			System.out.printf("%-30s%-10d%-10.2f%-10.2f\n", 
				items[itemCount], quantities[itemCount], prices[itemCount], itemTotal);
		}
		double salesTax = subtotal * TAX;
		System.out.printf("%-50s%-10.2f\n", "Subtotal", subtotal);
		System.out.printf("%-50s%-10.2f\n", TAX * 100 + "% sales tax", salesTax);
		System.out.printf("%-50s%-10.2f\n", "Total", salesTax + subtotal);
	}
}