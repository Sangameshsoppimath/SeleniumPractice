package JavaCocepts;

public class LinearSearch {

	public static void main(String[] args) 
	{
		// Search 20 is present in the array
		
		int a[]= {10,46,47,38,30,20};
		
		int searchElement=20;
		
		boolean status = false;
		
		for(int ele:a)
		{
			if(ele==searchElement)
			{
				System.out.println("Element Found  : "+searchElement);
				status=true;
				break;
			}
			
		}

		if(status==false)
		System.out.println("Element Not found");
	}

}
