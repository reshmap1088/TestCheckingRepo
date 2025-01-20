package InterviewPrg;

public class SmallestNoInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a[]= {443,4,32,6};
		
		int small=a[0];
		int len=a.length;
		
		for(int i=0;i<len;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
			
		}
		System.out.println(small);
	}

}
