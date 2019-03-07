/*
 * Average
 * Miguel Solis
 * This program calculates the average using for loop
 * 3.7.19
 */
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("\t\t Welcome to Average");
		System.out.println("\t This program calculates average of first nth number");
		
		System.out.print("Please enter value of n: ");
		int n = scnr.nextInt();
		int sum = 0;
		
		System.out.println("\n****************");
		
		for(int i=1; i<=n; i++)
			sum += i;
		
		int average = sum/n;
		
		System.out.println("The average is "+average);
		
		System.out.println("\n****************");
	}

}
