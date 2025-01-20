package InterviewPrg;

public class FindingCommonElementInThreeArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a1[]= {1,2,3,2,1};
		Integer a2[]= {1,2,3};
		Integer[] a3= {1,2,3,4};
		
		int len1=a1.length;
		int len2=a2.length;
		int len3=a3.length;
		
		int i=0,j=0,k=0;
		System.out.print("{");
		while(i<len1 && j<len2 && k<len3)
		{
		
			if(a1[i]==a2[j] && a2[j]==a3[k])
			{
				System.out.print(+a1[i]);
				i++;j++;k++;
			}
			else if(a2[j]==a3[k])
			{
				j++;
			}
			else
			{
				k++;
			}
			
			System.out.print(",");
		} 
		
		System.out.println("}");
	}

}
