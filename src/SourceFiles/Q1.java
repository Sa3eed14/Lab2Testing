package SourceFiles;

import java.util.Scanner;

public class Q1 {
	
	public String EvenOdd(int a) {
		if(a%2==0) {
			return("EVEN");
		}
		else {
			return("ODD");
		}
	}
	public int[] MinMaxValues(int[] arr) {

		int[] ans= {arr[0],arr[0]};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<ans[0]) {
				ans[0]=arr[i];
			}
			if(arr[i]>ans[1]) {
				ans[1]=arr[i];
			}
		}
		return ans;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number for Even/odd classification: ");
		int n = in.nextInt();
		System.out.println("Enter Size of array for minmax vals:");
		int s= in.nextInt();
		System.out.println("Enter Values of array: ");
		int[] arr1 = new int[s];
		for(int i=0;i<s;i++) {
			arr1[i]= in.nextInt();
		}
		Q1 c = new Q1();
		System.out.println("Number is: "+c.EvenOdd(n));
		int[] tes= {5,7,6,3,2,9,22,44,66,22,77,0,33};
		int[] ans = c.MinMaxValues(arr1);
		System.out.println("Minimum Value: "+ ans[0]);
		System.out.println("Maximum Value: "+ ans[1]);
	}

}
