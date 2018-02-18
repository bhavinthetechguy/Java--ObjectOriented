package Recursive;

public class RecursiveIsMember 
{
	public static void main(String[] args)
	{
		int[] array;
		array = new int[10];
		array[0] = 2;
		array[1] = 4;
		array[2] = 6;
		array[3] = 8;
		array[4] = 10;
		array[5] = 12;
		array[6] = 14;
		array[7] = 16;
		array[8] = 18;
		array[9] = 20;
		
		int num = 0;
		boolean value;
		
		System.out.println("Matched Numbers");
		
		/*
		 * Non-Recursive
		for(int i=0;i<21;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(num == array[j])
				{
					System.out.println(num);
				}
			}
			num++;
		}
		*/
	
		for(int i=0;i<21;i++)
		{
			value = isMember(array,0,(array.length-1),num);
			if(value == true)
			{
				System.out.println(num);
			}
			num++;
			
		}
	}
	
	public static boolean isMember(int[] array, int f, int l,int value)
	{
		int mid;
		if(f > l)
		{
			return false;
		}
		
		mid = (f + l)/2;
		
		if(array[mid] == value)
		{
			return true;
		}
		else if(array[mid] < value)
		{
			return isMember(array,mid+1,l,value);
		}
		else
		{
			return isMember(array,f,mid-1,value);
		}
	}
}
