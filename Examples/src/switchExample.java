public class switchExample
{
    public static void main(String[] args)
    {

    	int fieldgoal;
    	fieldgoal = 30;
    	
    	switch (fieldgoal) {
    	
    	case 6: 
    		System.out.print("This is a touchdown");
    		break;
    		
    	case 2:
    		System.out.print("This is a safety");
    		break;
    		
    	case 3:
    		System.out.print("This is a field goal");
    		break;
    		
    	case 3000:
    		System.out.print("This is an impossible score");
    		break;
    		
    	default:
    		System.out.print("Nothing matches, what sport are you playing?");
    		break;	
    	
    	}
    	
    }
}
