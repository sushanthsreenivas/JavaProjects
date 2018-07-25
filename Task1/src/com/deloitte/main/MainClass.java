package com.deloitte.main;

public class MainClass {

	public static void main(String[] args) {
		
	
		 
		int []arr1 = {1,2,3,4,5};
		int []arr2 = new int[10];
		
		for(int i=0; i<5;i++)
		{
			System.arraycopy(arr1,i, arr2, i, 1 );
			System.out.println(arr2[i]);
		}
	}

}
