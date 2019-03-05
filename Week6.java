import java.util.Scanner;

public class Week6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n;
		int sum = 0;
		int counter = 0;
		
		System.out.println("Please enter the n: ");
		n = keyboard.nextInt();
		
		while(counter < n) {
			counter++;
			sum += counter;
		}
		System.out.println("The sum is "+ sum); 
	  }
	}

