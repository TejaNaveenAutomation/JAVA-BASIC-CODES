package programs;

public class primeNumberVerify_EvenNumbersPrint {
	public static void main(String[] args) {
		
		/************************/
		// print prime numbers only
		/************************/
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number:");
//		
		int num= 100;//sc.nextInt(), 
		int count=0;
		for(int i =1; i<num; i++)
		{
			count=0;
			for(int j=2; j<i/2; j++)
			{
				if(i%j== 0)
				{
					count++;
					break;
				}

			}
			if(count==0)
				System.out.println(i);
		}
		

		/************************/
		// check prime number or not
		/************************
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		
		int num=sc.nextInt(), count=0;
		
		for(int i =2; i<num; i++)
		{
			if(num%i == 0)
			{
				count++;
				break;
			}
		}
		if(count ==0)
			System.out.println("\n It is a prime number");
		else
			System.out.println("\n It is not a prime number");
*/	
		
		/************************/
		// print only even numbers
		/************************
		
		int num = 100;
		for(int i =1; i<num; i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"  ");
			}
			
		}
*/		
		
	}

}
