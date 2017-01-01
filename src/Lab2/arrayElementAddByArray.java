package Lab2;

public class arrayElementAddByArray {


	private static int sum=0;
	private static int calculate(int array[],int size){
		if(size==0){
		sum = sum + array[size];
		return sum;
		}
		else
			sum = sum + array[size];
	return calculate(array, size-1);
	}
	
	public static void main (String args[]){
		int array[] = {1,2,3,9};
		System.out.println(calculate(array, array.length-1));
		
	}	
}

