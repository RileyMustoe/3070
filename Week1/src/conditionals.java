// Example of conditional If/Else statements

/* Basic IF statement

public class conditionals {
	
	public static void main (String[]args) {
		
		int touchdown = 6;
		
		if (touchdown == 6)
		{
			System.out.println("A touchdown was scored");
		}
		else
		{
			System.out.println("A touchdown was NOT scored");
		}
		
	}
	
}

*/

// If elseif example

/*
public class conditionals {
	
	public static void main (String[]args) {
		
		int touchdown = 3;
		
		if (touchdown == 6)
		{
			System.out.println("A touchdown was scored");
		}
		else if (touchdown < 6)
		{
			System.out.println("This could be a field goal");
		}
		else
		{
			System.out.println("A touchdown was not scored");
		}
		
		
	}
	
}

*/

// Example of shortcut available for If Else
public class conditionals {
	
	public static void main (String[]args) {
		
		int touchdown = 6;
		
		String result = (touchdown == 6) ? "This is a touchdown" : "Maybe a Field goal?";
		
		System.out.println(result);
		
		
	}
}