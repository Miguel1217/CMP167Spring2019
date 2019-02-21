/*
 * Author : Miguel
 * Desc : AgeTitle
 * Created : 2.21.19
 */
package week4;

import java.util.Scanner;

public class Agetitle {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userAge;
		
		userAge = scnr.nextInt();
		
		if (userAge > 25) {
			System.out.println("Adult");
		}
		else if (userAge == 19-25) {
			System.out.println("Young adult");
		}
		else (userAge < 19) {
			System.out.println("Teen");
		}
		
	}

}
