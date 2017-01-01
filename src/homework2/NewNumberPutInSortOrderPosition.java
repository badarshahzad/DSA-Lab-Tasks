package homework2;

import java.util.Scanner;

public class NewNumberPutInSortOrderPosition {
	
	//Array that should be consist of 9 number and 10th element as input and insert in appropriate position 
		
		private static int x=0;
		private static int y=0;
		private static int z=0;
		public static int invert(int array[],int length){
			
			
			z=array[x];
			array[x]=array[length];
			array[length]=z;
			x++;
			if(x==length-1)
				return 1;
			else if (x-1!=length-1){
				return invert(array,length-1);
			}
			return 1;
		}

		public static void main(String args[]){
			int []array = new int[10];
			Scanner input = new Scanner(System.in);
			for(int a=0;a<array.length;a++){
				array[a]= input.nextInt();
			}
			invert(array,array.length-1);
			for(int a=0;a<array.length;a++){
				System.out.println(array[a]);
			}
			
		}
	}

