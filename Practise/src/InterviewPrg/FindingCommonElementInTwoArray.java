package InterviewPrg;

public class FindingCommonElementInTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer[] a1= {1,2,3,2,1};
		Integer[] a2= {1,2,3};
		
		
		int n1=a1.length; //5
		int n2=a2.length; //3
		
		int i=0;
		int j=0;
		
		while(i<n1 && j<n2)
		{
			if(a1[i]==a2[j])
			{
				System.out.println(a1[i]);
				i++; j++;
			}
			else if(a1[i]<a2[j])
			{
				i++;
			}
			else
			{
				j++;
			}
			
				
		}
	}

}
