package homework2;

public class ImplementFunctionsOnArray {

	//display content of array method
	public static void displaycontents(int array[]){
		for(int a=0;a<array.length-1;a++)
			System.out.println(array[a]);
	}
	
	//search and element of array method
	public static void searchElement(int array[], int searchElement){
		for(int a=0;a<array.length-1;a++)
			if(array[a]==searchElement)
				System.out.println(array[a]);
	}
	
	//inseart an element at start method
	public static void insertElementInStart(int array[],int element){
		for(int a=0;a<array.length-1;a++)
			if(a==0)
				array[a]=element;
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
	
	//remove element that match in search cretatiria
	public static void removeElementAtSearch(int array[],int searchElement){
		
	}
	
	public static void main(String args[]){
		int []array = {1,2,3,4,5};
		
	}
}
