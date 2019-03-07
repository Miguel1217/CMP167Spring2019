import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("\t\t Welcome to Power");
		System.out.println("\t This program calculates the first nth powers of 2");
		System.out.print("Please enter value of n:");
		int n     = scnr.nextInt();
		
		System.out.println("\n__________________________");
		
		int power = 1;
		
		for(int i = 2; i <=n; i++ )
		{
			power = power*2;
			System.out.println(power);
		}
	}

}
