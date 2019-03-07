/*
 * Factorial
 * Miguel Solis
 * This program calculates the factorial
 * 3.7.19
 */
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("\t\t Welcome to Factorial");
		System.out.println("\t This program calculates factorial");
		
		System.out.print("Please enter value of n: ");
		int n = scnr.nextInt();
		int fact = 1;
		
		System.out.println("\n****************");
		
		for(int i=1; i<=n; i++)
			fact *=i;
		
		System.out.printf("The factorial of %d is %d%n", n, fact);
		System.out.println("****************");
	}

}
