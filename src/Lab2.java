import java.util.Scanner;

/*
 * Brad Malarkey
 * 
 * Lab 2: use conditional statements to automate decision making process
 */
public class Lab2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner and establish variable
		int num;
		String userName;
		
		System.out.println("Please enter your first name: ");
		userName = input.nextLine();
		System.out.println("Hello " + userName + "! Please enter a whole number between 1 and 100: "); //prompt user for necessary input
		num = input.nextInt();
		
		while ((num%2) == 0) { //use a while loop to differentiate between even and odd numbers
		
			if (num >= 2 && num < 25) { //different conditional statements to capture the ranges and provide the correct output
				System.out.println("Even and less than 25");
			}
			else if (num >= 26 && num < 60) {
				System.out.println("Even.");
			}
			else if (num > 60) {
				System.out.println("Even.");
			}
			break;
		}
		
		while ((num%2) != 0) {
			if (num > 60) {
				System.out.println("Odd and over 60.");
			}
			else {
				System.out.println("Odd.");
			}
			break;
		}
		System.out.println("Thanks, " + userName + ". Goodbye!"); //end the program officially

	}

}
