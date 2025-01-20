package InterviewPrg;

public class GreatestNoInAnArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]= {33,2,66,4,22};
		
		int large=arr1[0];
		
		int len =arr1.length;
		
		for(int i=0;i<len;i++)
		{
			if(arr1[i]>large)
			{
				large=arr1[i];
			}
		
		}
		
		System.out.println(large);
	}

}
