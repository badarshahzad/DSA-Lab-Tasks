package lab9;

import java.util.Scanner;

public class LinearProbing {

	public static void hash(String store[],int index,int num){
		if (store[index].equals(" ")) {
			store[index] = String.valueOf(num);
		} else {
			index++;
			if(index==10){
				index=0;
			}
			hash(store,index,num);
		}
		
	}
	
	public static void main(String args[]) {
		String store[] = new String[10];
		for (int a = 0; a < store.length; a++) {
			store[a] = " ";
		}

		Scanner input = new Scanner(System.in);

		int num;
		int index;

		for (int a = 0; a < store.length; a++) {
			System.out.print("Enter Num: ");
			num = input.nextInt();
			index = num % 10;
			hash(store,index,num);
		}

		for (int a = 0; a < store.length; a++) {
			System.out.println("Index: "+a+ "Store: "+store[a]);
		}


	}

}
