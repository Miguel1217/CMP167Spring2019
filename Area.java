/*
 * Area.java
 * Miguel Solis
 * This program implements area functions/method
 */
import java.util.Scanner;
public class Area {
	static Scanner scnr = new Scanner(System.in);
	/*
	 * rectArea: void
	 * inputs: width and lenght
	 * process: area= width*length
	 * output: area
	 */
	public static void rectArea() {
		Scanner scnr = new Scanner(System.in);
		int width, length, area;
		System.out.println("Let's calculate rectangle area");
		
		System.out.print("Enter width:");
		width = scnr.nextInt();
		System.out.print("Enter length:");
		length = scnr.nextInt();
		
		area = width * length;
		
		System.out.println("The area is " + area);
		

	}
	/*
	 * circArea
	 * inputs: radius
	 * process: area= pi*r*r
	 * output: area
	 */
	public static void circArea() {
		double radius, area;
		System.out.println("Area of the circle");
		
		System.out.println("Enter radius:");
		radius = scnr.nextDouble();
		
		area = Math.PI * radius * radius;
		
		System.out.println("The cricle area is " + area);
		
	}
	/*
	 * triArea
	 * inputs: height, base
	 * process: area= h*b/2
	 * output: area
	 */
	public static void triArea() {
		int height, base, area;
		System.out.println("Area of the triangle");
		
		System.out.println("Enter height:");
		height = scnr.nextInt();
		System.out.println("Enter base:");
		base = scnr.nextInt();
		
		area = height * base / 2;
		
		System.out.println("The triangle angle is " + area);
		
	}
	public static void main(String[] args) {
		rectArea();
		circArea();
		triArea();
	}

}