package anudipassign;


import java.util.*;

public class Missingarray {

	public static void main(String[] args) {
		//importing the scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of array element");
		int n = sc.nextInt();
		int[] arr = new int[n];
		//entering the array element
		System.out.println("Enter the element into the array");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		//sorting the user input array
		Arrays.sort(arr);
		/*Missing element */
		for(int i=0;i<n;i++) {
			if(arr[i]!=i) {
				//comparing the array element 
				System.out.println("Missing no is :"+i);
				//breaking from the loop
				break;
			}
		}
		//closing the scanner class
		sc.close();
	}

}
