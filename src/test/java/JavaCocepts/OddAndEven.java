package JavaCocepts;

public class OddAndEven {

	public static void main(String[] args) 
	{
		int a[]= {1,2,4,6,3,8,9};
		
		int even = 0;
		int odd = 0;
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				even++;
			}
			else
				odd++;
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
