package InterviewPrg;

public class GreatestNoInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a=new int[] {1,2,4,53,3,4,55};
		
		int len=a.length;
		int large=a[0];

		
		for(int i=0;i<len;i++)
		{
			if(a[i]>large )
			{
				large=a[i];
			
				
			}
			
		}
			
		System.out.println(large);
		
	}

}
