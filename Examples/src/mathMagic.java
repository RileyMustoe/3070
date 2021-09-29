// Math and operator example

public class mathMagic {
	
	public static void main(String[]args ) {
		
		// Orginal number was 7
		int myNumber = 256;
		int stepOne = myNumber * myNumber;
		int stepTwo = stepOne + myNumber;
		int stepThree = stepTwo / myNumber;
		int stepFour = stepThree + 17;
		int stepFive = stepFour - myNumber;
		int stepSix = stepFive / 6;
		
		System.out.println(stepSix);
		
	}
	
}