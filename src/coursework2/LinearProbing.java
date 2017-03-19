package coursework2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Random;
import java.util.Scanner;

public class LinearProbing {

	public static int steps = 0;

	static int hashKey;
	static int bukketLength;
	public static int hashKeyFunction(int key) {
		hashKey = key % bukketLength;
		return hashKey;
	}

	
	public static void insert(int buket[], int keyIndex, int num) throws IOException {

		if (buket[keyIndex] == 0) {

			writer.write("\t I" + num + "@" + keyIndex + "\t");
			buket[keyIndex] = num;
			steps++;

		} else {

			keyIndex++;

			if (keyIndex == 101) {
				keyIndex = 0;
			}

			writer.write("\t P" + keyIndex + "\t");
			steps++;
			insert(buket, keyIndex, num);

		}

	}

	static Writer writer = null;

	public static void main(String args[]) throws IOException {

		int N = 14031264;
		int num = 0;
		Random random = new Random();
		int[] buket;
		int counter = 0;

		try {

			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Results.txt"), "UTF-8"));
			writer.write("\t14031264\n\n");
			writer.write("\tHash Table Insertion Linear Probing ");

			int k = 10;
			int count = 0;
			for (int ak = 0; ak < k; ak++) {

				buket = new int[101];
				bukketLength = buket.length;

				if (k == 10) {
					writer.write("\n \t 1) K = 10 \n");
				}
				if (k == 100) {
					writer.write("\t 2) K = 100 \n");
				}
				if (k == 1000) {
					writer.write("\t 3) K = 1000 \n");
				}

				for (int a = 0; a < buket.length; a++) {

					num = random.nextInt(N);
					//System.out.println(num);
					hashKey = hashKeyFunction(num);
					steps++;

					if (a % 3 == 0) {
						
						writer.write("\n ");
						
					}

					writer.write("\t P" + hashKey + "\t");
					insert(buket, hashKey, num);
					a++;
					
				}
				//System.out.println("Steps: " + steps);
				writer.write("\n\n\n \t Number of Steps: S = " + steps + "\n");
				counter = counter + steps;
				//System.out.println("Total count: " + counter);
				//System.out.println("Ak count: \t" + ak);
				steps = 0;

				// A condition to convert 10 loop to hundred

				if (ak == 9 && count == 0) {

					writer.write("\n\t Average:" + counter + "/" + k + "=" + counter / k + "\n");
					//System.out.println("\n\n \t Average: " + counter / 10 + "\n\n");
					counter = 0;
					k = 100;
					ak = 0;
					//System.out.println("\t counter: " + counter + "\tk is :" + k + "\tak:" + ak);
					count++;
					
				}

				if (ak == 99 && count == 1) {

					writer.write("\n\t Average:" + counter + "/" + k + "=" + counter / k + "\n");
					//System.out.println("\n\n \t Average: " + counter / 100 + "\n\n");
					counter = 0;
					k = 1000;
					ak = 0;
					//System.out.println("\t counter: " + counter + "\tk is :" + k + "\tak:" + ak);
					count++;
					
				}

				if (ak == 999 && count == 2) {
					
					writer.write("\n\t Average:" + counter + "/" + k + "=" + counter / k + "\n");
					
				}
				
				// -----------Testing---------------
				/*
				Scanner input = new Scanner(System.in);
				System.out.println("Enter num: ");
				num = random.nextInt(14031264);
				int hashKey = 0;
				int a = 0;
				System.out.println("Frist step: " + steps);
				while (a < 3) {
					System.out.println("Frist step: " + steps);
					System.out.println("Numer: " + num);
					num = input.nextInt();
					hashKey = hashKeyFunction(num, store.length);
					steps++;
					add(store, hashKey, num);
					writer.write("\t P" + hashKey);
					hash(store, key, num);
					a++;
				}
				System.out.println("totoal" + steps);
				 */			 
				/// ----------end test

			}

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
