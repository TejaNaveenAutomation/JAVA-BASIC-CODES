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
		 

		 String s = "teja naveen";
		 
		 String rev ="";
		 for(int i = 0; i<s.length(); i++) {
			 rev = s.charAt(i)+rev;
		 }
		 System.out.println("reverse :"+rev);
		 
		   StringBuffer sb = new StringBuffer("programming");  
	        System.out.println("string: " + sb);  
	        // reversing of stringbuffer  
	        System.out.println("reverse: " + sb.reverse());  
	        
	     String str="tejaghhj";
	            String result = "";
	            for (int i = str.length() - 1; i >= 0; i--) {
	                result += str.charAt(i);
	            }
	            System.out.println("\n revsd:"+result);
	            
	            
	            String stri, revs = "";
	            Scanner sc = new Scanner(System.in);
	       
	            System.out.println("Enter a string:");
	            str = sc.nextLine();
	       
	            int length = str.length();
	       
	            for ( int i = length - 1; i >= 0; i-- )
	               revs = revs + str.charAt(i);
	            
	            System.out.println("  "+revs);
	            
	            //
	       
//	            if (str.equals(revs))
//	               System.out.println(str+" is a palindrome");
//	            else
//	               System.out.println(str+" is not a palindrome");
	       
	            
	            
	}

}
