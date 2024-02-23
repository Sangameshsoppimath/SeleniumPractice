package JavaCocepts;

public class SumOfElements 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,5,7};
		
		int sum=0;
		
		for(int i=0;i<a.length-1;i++)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
	}

}
