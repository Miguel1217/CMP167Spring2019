/*
 * Author : Miguel Solis
 * Created : 4.18/19
 * desc : A program that handles grades
 */

import java.util.Scanner;
public class Grades {
	static Scanner scnr = new Scanner(System.in);
	
	public static int readGrades(int[] grades) {
		int position=0;
		while(position < grades.length) {
			System.out.println("Enter a grade: ");
			int grade = scnr.nextInt();
			if( grade >= 0) {
			grades[position] = grade;
		}
			else {
				break;
			}
			
		}
		return position;
		
	}
	
	public static void main(String[] args) {
		int[] arr= new int[10];
		int size = readGrades(arr);
		System.out.println("The size of the array is currently: "+size);
	}

}
