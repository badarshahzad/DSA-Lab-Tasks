package lab3;

public class ImplementFunctionsOnArray {

	
	//inseart an element at start method
	private static int store;
	private static int counter=0;
	
	public static int arrayTransfer(int array[],int startIndex,int startIndexNumber){
		
		return 0;
	}
	public static int[] insertElementInStart(int array[],int element){
		
			if(counter+1==array.length)
				return array;
		
			if(array[counter]==0 && counter==0){
				array[counter]=element;
				counter++;
				return insertElementInStart(array, element);
			}
			if(array[counter]!=0 && counter==0){
				store=array[counter];
				array[counter]=element;
				arrayTransfer(array,counter+1,store);
				return insertElementInStart(array, element);
			}
			
			if(array[counter]==0 || array[counter]!=0 && counter!=0 ){
				store=array[counter];
				array[counter+1]=array[counter];
				array[counter]=store;
				counter++;
				return insertElementInStart(array, element);
			}
			
			
		return array;
	}
	
	//inseart an element at end method
	public static void insertElementInEnd(int array[],int element){
		for(int a=0;a<array.length-1;a++)
			if(a==array.length-1)
				array[a]=element;
	}
	
	//inseart an element at specific index method
	public static void insertElementAtIndex(int array[],int index,int element){
		for(int a=0;a<array.length-1;a++)
			if(a==index)
				array[a]=element;
	}
	
	//remove element at the start
	public static void removeElementInStart(int array[],int element){
		
	}
	
	//remove the last element
	public static void removeElementInEnd(int array[],int element){
		
	}
	
	//remove an element at specific index method
	public static void removeElementAtIndex(int array[],int element){
		
	}
	
	public static void main(String args[]){
		int []array = {5,1,2,2,0};
		insertElementInStart(array, 2);
		for(int a=0;a<array.length;a++){
			System.out.println(array[a]);
		}
		
		
	}
}
