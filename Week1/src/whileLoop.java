import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		
		/*
		// Basic While Loopage
		int number = 0;
		
		while (number <= 10) {
			System.out.println("Not Yet");
			number++;
		}
		
		System.out.println("All done counting!");

		*/
		
		// Input validation using While Loop
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		while(name.isBlank()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello "+name);
	}

}
