package Tasks;

import java.util.Scanner;

public class lab10 {
	
	   public static boolean isPositiveString(String input) {
	        
	        input = input.toUpperCase();

	        
	        for (int i = 0; i < input.length() - 1; i++) {
	            char currentChar = input.charAt(i);
	            char nextChar = input.charAt(i + 1);

	            
	            if (nextChar <= currentChar) {
	                return false;
	            }
	        }
	        return true;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter a string to check if it's positive: ");
	        String userInput = sc.nextLine();

	        
	        if (isPositiveString(userInput)) {
	            System.out.println("✅ The string \"" + userInput + "\" is a Positive String.");
	        } else {
	            System.out.println("The string \"" + userInput + "\" is NOT a Positive String.");
	        }

	        sc.close();


	}

}
