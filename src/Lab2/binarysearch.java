package Lab2;

public class binarysearch {
		
		private static int indicator=0;
		private static int store=0;
		public static int search(int array[],int length,int num){
			indicator = length/2;
			if(num==array[indicator])
				return indicator;
			if(num>array[indicator]){
				if(num==array[indicator]+1)
					return indicator+1;
				
				for(int a=indicator+1;a<=length;a++){
					array[a]=array[a];
					store=a;
				}
				return search(array,store,num);
			}
			else if(num<array[indicator]){
				if(num==array[indicator]-1)
					return indicator-1;
				
				for(int a=0;a<=indicator-1;a++){
					array[a]=array[a];
					store=a;
				}
				return search(array,store,num);
				
			}
			else
				return 0;
		}
	
		
		public static void main(String args[]){
			int []array = {0,1,2,5,6,7,8,9,10};
			int num=6;
			System.out.println(search(array,array.length-1,num));
			}	

}
