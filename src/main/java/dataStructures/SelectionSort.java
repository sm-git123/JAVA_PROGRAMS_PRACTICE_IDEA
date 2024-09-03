package dataStructures;

public class SelectionSort {
	
	public static void main(String args[])
	{
		int arr[] = {10,9,8,5,4,7,3,2,1};
		
		sort(arr);
		print(arr);
	}
public static void sort(int[] a)
{
	int n = a.length;
	
	
	for(int i=0;i<n-1;i++)
		
	{
		int min_element = i;
		for(int j=i+1;j<n;j++)
		
		{
			if(a[j] < a[min_element])


			min_element=j;
			
			
			}
		int temp =a[min_element];
		a[min_element]=a[i];
		a[i]=temp;
	
	}
}

public static void print(int [] ar)

{
	int nn = ar.length;
	for(int i=0;i<nn;i++)
	{
		 System.out.print(ar[i]+" "); 
	}
}
}
