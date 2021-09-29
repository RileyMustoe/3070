import java.util.ArrayList;
import java.util.Arrays;

public class arraysListExample {
	
	public static void main(String[] args) {
		
		/*
		// Create an ArrayList and initialize with values
		ArrayList<String> gradeList = new ArrayList<>(Arrays.asList("97", "84", "100", "66"));
		*/
		
		ArrayList<String> gradeList = new ArrayList<>();
		
		gradeList.add("99");
		gradeList.add("89");
		gradeList.add("79");
		gradeList.add("100");
		gradeList.add("10");
		gradeList.add("67");
		gradeList.add("66");
		
		gradeList.set(4, "88");
		
		
		
		//Removing values from the Array
		/*
		 gradeList.remove(4);
		 */
		
		
		
		System.out.println(gradeList);
	}
	
}