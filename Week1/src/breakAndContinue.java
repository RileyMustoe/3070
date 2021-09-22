
public class breakAndContinue {

	public static void main(String[] args) {

		/*
		// Break statement example
		while (1==1) {
			System.out.println("Help, I'm stuck in a loop!!!");
			
			break;
		}
		*/
		
		
		for (int i=0; i<=10; i++) {
			
			if(i==7) {
				continue;
			}
			
			System.out.println(i);
		}
		
		
	}

}
