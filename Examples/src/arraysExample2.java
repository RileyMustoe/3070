import java.util.Scanner;

public class arraysExample2 {
	
	public static void main(String[] args) {
		
	final int EMPLOYEES = 3; // Initial number of employees
	int[] hours = new int[EMPLOYEES]; // Defining our Array
	
	// Remember the Scanner functionality?
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter your hours worked by " + EMPLOYEES + " employees.");
	
	// Get employee information
	System.out.print("Employee 1: ");
	hours[0] = keyboard.nextInt();
	
	System.out.print("Employee 2: ");
	hours[1] = keyboard.nextInt();
	
	System.out.print("Employee 3: ");
	hours[2] = keyboard.nextInt();
	
	
	// Display the information entered
	System.out.println("The hours you entered are: ");
	System.out.println(hours[0]);
	System.out.println(hours[1]);
	System.out.println(hours[2]);
	
	
	
	}
}