package programs;

public class planidromeNumberAndString {
	
	public static void main(String[] args) {
		/************************/
		// planidrome number
		/************************
		
//		System.out.println("Enter a number");
//		Scanner sc  = new Scanner(System.in);
		
		int num=353;//It is the number variable to be checked for palindrome 
		int rev,sum=0,temp;    
         temp=num;    
         while(num>0){    
                 rev=num%10;  //getting remainder  
                   sum=(sum*10)+rev;    
                       num=num/10;    
          }    
              if(temp==sum)    
                 System.out.println("palindrome number ");    
              else    
                 System.out.println("not palindrome");   

*/		
		/************************/
		// planidrome string
		/************************
	      Scanner sc = new Scanner(System.in);   
	      System.out.println("Enter a string:");
	      
	      String original, reverse = ""; // Objects of String class  
	      original = sc.nextLine();  
	      
	      int length = original.length(); 
	      
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
*/      
	}

}
