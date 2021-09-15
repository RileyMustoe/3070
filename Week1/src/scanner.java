import java.util.Scanner;

public class scanner {
	
	public static void main(String[] args) {
		
		// Info we want from our user
		String name;
		int hours;
		double payRate;
		double grossPay;
		
		// Creating the Scanner object for later use
		Scanner keyboard = new Scanner(System.in);
		
		// Get user data
		System.out.print("What's your name? ");
		name = keyboard.nextLine();
		
		System.out.print("How many hours did you work this week? ");
		hours = keyboard.nextInt();
		
		System.out.print("What is your hourly rate? ");
		payRate = keyboard.nextDouble();
		
		grossPay = hours * payRate;
		
		// Display results of our program
		System.out.println("Hello, " + name);
		System.out.println("Your gross pay is $" + grossPay);
		
	}
}