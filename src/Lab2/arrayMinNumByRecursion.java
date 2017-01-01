package Lab2;
import java.util.Scanner;

public class arrayMinNumByRecursion {
	
	private static int valuemin;
	private static int valuemax;
	private static int min=0;
	private static int calculate(int array[],int size){
		min=size;
		if(min==0){
			if(array[min]<=array[size])
				valuemin=array[min];
		}
		if(array[min-1]<array[size]){
			return calculate(array, size-1);
		} 
	return calculate(array, size-1);
	}
	
	public static void main (String args[]){
		int array[] = {1,2,3,0,-1};
		System.out.println(calculate(array, array.length-1));
		
	}	
}
