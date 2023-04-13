package programs;


import java.util.*;

public class reverseNumberStringArray {
	
	public static void main(String[] args) {
		

		/************************/
		// reverse a number
		/************************
		
		int number=12321, rev=0,temp;
		temp=number;
		
		while(number>0)
		{
			int reminder = number%10;
			rev = rev*10+reminder;
			number=number/10;
		}
		if(temp==rev)
		{
			System.out.println("It is a palindrome number");
		}
		else
		{
			System.out.println("It is a not a palindrome number");
		}
*/	
//		System.out.println("Reverse number: "+rev);

		/************************/
		// reverse a string
		/************************/
		
		String orginalString="Teja";
		System.out.println(orginalString);
		String rev="";
		
		for(int i=0; i<orginalString.length(); i++)
		{
			rev = orginalString.charAt(i)+rev;
		}
		System.out.println("Reverse string :"+rev);

		/************************/
		// print array in reverse order
		/************************/
		
		 //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5}; 
        
        
        
        System.out.println("length of the array is: "+arr.length); 
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        
        System.out.println("\n Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        } 

		/************************/
		// print name using for and while loop
		/************************
		
	for(int i =1; i<5;i++)
	{
		System.out.println("teja");
	}
	
		int name= 1;
		while(name<=5) {
			System.out.println("\nteja");
			name++;
			
		}
		
     
  */
		
		/************************/
		// print name usinf for and while loop
		/************************
		 
		List <String> list =new ArrayList<String>();  
		 //Adding elements in the List  
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");  
		 for(int i =0; i<list.size(); i++ ) {
			 System.out.println(list.get(i));
		 }
		 //Iterating the List element using for-each loop  

		 
		 List <Integer> li =new ArrayList<Integer>();  
		 //Adding elements in the List  
		 li.add(1);  
		 li.add(2);  
		 li.add(3);  
		 li.add(4);  
		 //Iterating the List element using for-each loop  
		 for(int i =0; i<li.size(); i++)  
		  System.out.println(li.get(i));  
*/
	}

}
