package programs;

public class countAndSum {
	
	public static void main(String[] args) {
		
		/************************/
		// Sum of all elements of an array
		/************************/
		
		int arr[]= new int [] {1,2,3,4,5,6,7,};
		int sum =0;
		
		  for (int i = 0; i < arr.length; i++)
		  {
			  sum=arr[i]+sum; 
		  }
		  System.out.println("sum of the numbers in the array "+sum);

		/************************/
		// count of all elements of an array
		/************************
		 
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println("lenght of the array is : "+arr.length);
*/
		/************************/
		// lenght of the string
		/************************
		String string ="teja";
		System.out.println("lenght of the string: "+string.length());
*/
		
		int num=12345678;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
