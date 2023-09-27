/**
 * 
 */
package dayoftheweek;

import java.util.Scanner;

/**
 * 
 */
public class FavWeek {

	/**
	 * 
	 */
	public FavWeek() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Whats your favorite day of the week?");
		String day=Input.nextLine();
		System.out.println(day+" is a good day");
		Input.close();
	}

}
