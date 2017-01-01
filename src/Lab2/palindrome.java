package Lab2;

public class palindrome {
	
	private static int a=0;
	public static int ispalindrom(int array[],int length){
		
		if(array.length==a)
			return 1;
		
		if(array[a]==array[length]){
			a++;
			return ispalindrom(array,length-1);
		}
		else if(a>length)
			return 0;
		else
			return 0;
	}

	public static void main(String args[]){
		int []array = {0,1,2,1,0,};
		System.out.println(ispalindrom(array,array.length-1));
		}	
}
