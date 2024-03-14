package com.keerthi;

public class ArrayExample {

	public static void main(String[] args)
	{
		int arr[]= {11,12,13,14,15,16,17,18,19,20};
		System.out.println("Even Numbers");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		System.out.println("\nOdd Numbers");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
