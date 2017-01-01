package lab9;

import java.util.Scanner;

public class QuadraticProbing {

	public static int increment= 1;
	public static int defultIndex;
	public static void hash(String store[],int index,int num){
		if (store[index].equals(" ")) {
			store[index] = String.valueOf(num);
		} else {
			defultIndex = index + (increment * increment);
			increment++;
			
			if(defultIndex>=store.length){
				defultIndex = defultIndex % 10;
			}
				
			hash(store,defultIndex,num);
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
