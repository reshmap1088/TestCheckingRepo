package InterviewPrg;

public class SecondSmallestNoInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {33,29,55,1,66};
		
		int small=a[0];
	    int secsmall=a[0];
	    
	    int len=a.length;
	    
	    for(int i=0;i<len;i++)
	    {
	    	if(a[i]<small)
	    	{
	    		secsmall=small;
	    		small=a[i];
	    		
	    	}
	    	else if(a[i]<secsmall)
	    	{
	    		secsmall=a[i];
	    	}
	    	
	    	
	    }
	    
	    System.out.println(small);
	    System.out.println(secsmall);
	}

}
