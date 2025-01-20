package InterviewPrg;

public class SecondLargestNoInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,2,33,5,11,6};
		
		int large=a[0];
		int secondlarge=a[0];
		//int thirdlarge=a[0];
		
		int len=a.length;
		
		for(int i=0;i<len;i++)
		{
			if(a[i]>large )
			{
				//thirdlarge=secondlarge;
				secondlarge=large;
				large=a[i];
				
			}
			else if(a[i]>secondlarge)
			{
				secondlarge=a[i];
			}
			/*
			 * else if(a[i]>thirdlarge) { thirdlarge=a[i]; }
			 */
			
		}
		System.out.println(large);
		System.out.println(secondlarge);
	//	System.out.println(thirdlarge);
	}

}
