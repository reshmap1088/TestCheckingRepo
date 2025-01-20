package InterviewPrg;

public class FindingCommonElementInTwoArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a1= {1,2,3,2,1};
		Integer[] a2= {1,2,3,};
		
		int len1=a1.length;
		int len2=a2.length;
		
		int i=0,j=0;
		
		while(i<len1 && j<len2)
		{
			if(a1[i]==a2[j])
			{
				System.out.println(a1[i]);
				i++;j++;
			}
			else
			{
				j++;
			}
			
		}
	}

}
