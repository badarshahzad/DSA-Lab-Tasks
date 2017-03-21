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
	public static int hashKey;
	public static int bukketLength;
	public static Writer writer = null;

	public static int hashKeyFunction(int key) {
		hashKey = key % bukketLength;
		return hashKey;
	}

	public static void insert(int buket[], int num) throws IOException {

		if (buket[hashKey] == 0) {

			writer.write(" I" + num + "@" + hashKey + " ");
			buket[hashKey] = num;
			steps++;

		} else {

			hashKey++;

			if (hashKey == 101) {
				hashKey = 0;
			}

			writer.write(" P" + hashKey + " ");
			steps++;
			insert(buket, num);

		}

	}

	public static void main(String args[]) throws IOException {

		int N = 14031264;
		int num = 0;
		Random random = new Random();
		int[] buket;
		int counter = 0;

		try {

			// --------Here I am just write the details about data structure and

			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Reslut.txt"), "UTF-8"));
			writer.write(" 4031264\n\n");
			writer.write(" Hash Table Insertion Linear Probing ");

			// Initially i am starting from 10 then I have added condition when
			// k==9 the k will become k=100 and
			// when k==99 then k will initazlize to k==1000

			int count = 0;
			int k = 10;
			for (int ak = 0; ak < k; ak++) {
				// Here every iteration complete like from 10 times when 1 iteration complete and steps count and
				// and inserted into buket then for step 2 again here am just initializing again array to same buket
				// I did this to escape from to intialize with zero with loop
				// I giving array lenght to below globel variable bukketlength
				
				buket = new int[101];
				bukketLength = buket.length;

				// these are just lines that will print in file
				if (k == 10 && ak == 0) {
					writer.write("\n  1) K = 10 \n");
				}
				if (k == 100 && ak == 1) {

					writer.write("\n  2) K = 100 \n");
				}
				if (k == 1000 && ak == 1) {
					writer.write("\n  3) K = 1000 \n");

				}

				// Randome number genearating but N+1 as to include my uob number the random goes to N-1 not to N
				// Hashey funciton is just return the key

				for (int a = 0; a < 100; a++) {
					
					//Randome number assigning 
					num = random.nextInt(N + 1);
					//num = 14031259;
					hashKey = hashKeyFunction(num);
					steps++;

					// The purpose of this line is to just add new line in file
					// as printing on single line consequence of
					// eclipse one line printing bug that still not resolve

					if (a % 5 == 0) {
						writer.write("\n ");
					}

					// before inserting key in buket I insert into file here
					writer.write("  P" + hashKey);
					insert(buket, num);

				}

				// printing steps after each iterationg and counter is just to
				// counting the total steps
				// the purpose of steps=0 is to just starting again itration
				// should be zero

				writer.write("\n\n  Number of Steps: S = " + steps + "\n");
				counter = counter + steps;
				steps = 0;

				// A condition to convert 10 loop to hundred
				// No confusion here as I am starting k again from k=0

				if (ak == 9 && count == 0) {

					writer.write("\n\t  Average:" + counter + "/" + k + "=" + counter / k + "\n");
					counter = 0;
					k = 100;
					ak = -1;
					count++;

				}

				if (ak == 99 && count == 1) {

					writer.write("\n\t Average:" + counter + "/" + k + "=" + counter / k + "\n");
					counter = 0;
					k = 1000;
					ak = -1;
					count++;

				}

				if (ak == 999 && count == 2) {

					writer.write("\n\t Average:" + counter + "/" + k + "=" + counter / k + "\n");

				}
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
