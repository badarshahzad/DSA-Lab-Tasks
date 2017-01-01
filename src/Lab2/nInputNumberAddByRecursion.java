package Lab2;

import java.util.Scanner;

public class nInputNumberAddByRecursion {

	private static int calculate(int sum){
		if(sum==0)
			return sum;
		
		return sum = sum + calculate(sum-1);
	}
	
	public static void main (String args[]){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Enter you number : ");
		num = input.nextInt();
		System.out.println(calculate(num));
	}
}
