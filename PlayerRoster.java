import java.util.Scanner;
public class PlayerRoster {
 public static void main(String[] args) {
 final int MAX_PLAYERS = 5;
 int[] jerseyNums = new int[MAX_PLAYERS];
 int[] playerRating = new int[MAX_PLAYERS];
 Scanner scnr = new Scanner(System.in);

 for (int i = 0; i < MAX_PLAYERS; i++) {

 System.out.print("Enter player " + (i+1) + "'s jersey number: ");
 int jersey = scnr.nextInt();
 jerseyNums[i] = jersey;
 System.out.println();

 System.out.print("Enter player " + (i+1) + "'s rating: ");
 int rating = scnr.nextInt();
 playerRating[i] = rating;
 System.out.println();
 System.out.println();
 }
 boolean done = false;
 String command = scnr.nextLine();

 while (!done) {

 System.out.println("MENU");
 System.out.println("o - Output roster");
 System.out.println("u - Update player rating");
 System.out.println("a - Output players above a rating");
 System.out.println("q - Quit");
 System.out.println("");
 System.out.println("Choose an option: ");

 command = scnr.nextLine();
 if (command.contains("q") || command.contains("Q")) {

 done = true;
 } else if (command.contains("o") || command.contains("O")) {

 System.out.println("ROSTER");
 for (int i = 0; i < MAX_PLAYERS; i++) {
 System.out.println("Player " + (i + 1) +
 " -- Jersey number: " + jerseyNums[i] +
 ", Rating: " + playerRating[i]);
 }
 System.out.println();
 } else if (command.contains("u") || command.contains("U")) {
	 System.out.print("Enter a jersey number: ");
	 int jersey = scnr.nextInt();
	
	 int i;
	 for (i = 0; i < MAX_PLAYERS; i++) {
	 if (jerseyNums[i] == jersey) {
	 break;
	 }
	 }

	 System.out.print("Enter new rating for player: ");
	 int rating = scnr.nextInt();
	
	 playerRating[i] = rating;
	 
	 command = scnr.nextLine();
	 } else if (command.contains("a") || command.contains("A")) {
	
	 System.out.println("Enter a rating: ");
	 int rating = scnr.nextInt();
	
	 System.out.println("ABOVE " + rating);
	 for (int i = 0; i < MAX_PLAYERS; i++) {
	 if (playerRating[i] > rating) {
	 System.out.println("Player " + (i + 1) +
	 " -- Jersey number: " + jerseyNums[i] +
	 ", Rating: " + playerRating[i]);
	 }
	 }
	 System.out.println();
	
	 command = scnr.nextLine();
	 }
	 }
	 scnr.close();
	 return;
	 }
	}