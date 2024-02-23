package JavaCocepts;

public class DuplicateSearch {

	public static void main(String[] args) {
		
		int a[]= {20,220,40,20,10,40,20,50,40,50,33,33,};
		
		int duplicate = 33;
		int dupCount = 0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==duplicate)
			{
				dupCount++;
							}
		}
		System.out.println(dupCount);

	}

}
