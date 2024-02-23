package JavaCocepts;

public class MulttidimArray 
{
	public static void main(String[] args) 
	{
		Object arr[][]= {{1,"Sangamesh"},{2,"Poornima"},{3,"Samas"}};
		
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			{
				System.out.println(arr[r][c]+"   ");
			}
		}
		
	}

}
