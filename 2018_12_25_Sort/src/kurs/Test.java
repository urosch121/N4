package kurs;

import java.util.Scanner;

public class Test 
{
	public static void StampajNiz(int a[], int n)
	{
		for(int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		
		System.out.println();
	}
	
	public static void SortRastuce(int a[], int n)
	{
		for(int i = 0; i < n-1; i++)
			for(int j = i+1; j < n; j++)
				if(a[j] < a[i])
				{
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Unesite broj elemenata niza a: ");
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			System.out.print(i + ": ");
			a[i] = in.nextInt();			
		}
		in.close();
		StampajNiz(a, n);
		SortRastuce(a, n);
		StampajNiz(a, n);
	}

}
