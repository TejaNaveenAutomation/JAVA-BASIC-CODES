package programs;

import java.util.Scanner;

public class TryAndCatchException {
	
	public static void main(String[] args) {
		
		/************************/
		// try and catch
		/************************/
		
		 try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[3]);//change the index number to check
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		    }

	            
	}

}
