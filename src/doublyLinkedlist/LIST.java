package doublyLinkedlist;

import java.util.Random;

/**
 *
 * @author badar
 * @UOB 14031264
 * @ADT LIST
 * @data 68, 69, 70, 73, 74, 77, 71, 83, 82, 67, 87, 80, 66, 75, 76, 81
 * @LIST trace I68 I69A68 I70A69 I73A70 I74A73 I77A74 I71A70B73 I83A77 I82A77B83
 *       I67B68 I87A83 I80A77B82 I66B67 I75A74B77 I76A75B77 I81A80B82
 */

class Node {
	int data;
	Node next;
	Node previous;

	public Node(int data) {
		this.data = data;
		next = null;
		previous = null;
	}
}

public class LIST {

	Node head = null;
	Node tail = null;
	int sizeOfList = 0;

	/*
	 * addNumStart is just add number at head before 
	 */
	public Node addNumStart(int data) {
		Node n = new Node(data);
		if (sizeOfList == 0) {
			head = n;
			tail = n;
		} else {
			n.next = head;
			head = n;
			head.previous = n;
		}
		sizeOfList++;
		return n;
	}

	/*
	 * addNumEnd is just add number after tail  
	 */
	public Node addNumEnd(int data) {
		Node n = new Node(data);
		if (sizeOfList == 0) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			n.previous = tail;
			tail = n;
		}
		sizeOfList++;
		return n;
	}

	/*
	 * addNumAfter is just add number after specific node 
	 */
	public Node addNumAfter(int data, Node afterNode) {

		if (afterNode == tail)
			return addNumEnd(data);

		Node n = new Node(data);
		Node tempafterNode = afterNode.next;

		// Four prcocess necessary befor adding after a specific node
		// Process:1 new node next place
		n.next = tempafterNode;
		// Process:2 new node previous place
		n.previous = afterNode;
		// Process:3 after node next address assign
		afterNode.next = n;
		// Process:4 afterNode next node of previous assign
		tempafterNode.previous = n;

		sizeOfList++;
		return n;
	}

	/*
	 * addNumBefore is just add number before specific node
	 */
	public Node addNumBefore(int data, Node beforeNode) {

		if (beforeNode == head)
			return addNumStart(data);

		Node n = new Node(data);
		Node tempBeforeNode = beforeNode.previous;

		n.next = beforeNode;
		n.previous = tempBeforeNode;
		tempBeforeNode.next = n;
		tempBeforeNode.previous = n;
		sizeOfList++;

		return n;
	}

	// deteleNumStart is just to delete from the start 
	public void deleteNumStart() {
		head = head.next;
		sizeOfList--;
	}
	// deteleNumEnd is just to delete from the end 
	public void deleteNumEnd() {
		tail = tail.previous;
		sizeOfList--;
	}
	// NumAtIndex is add a data at specific index 
	public void NumAtIndex(int data, int sizeOfList) {
		if (sizeOfList > this.sizeOfList) {
			System.out.println("Your index is grater than sizeOfList of list!");
		}
		Node temp = head;
		while (sizeOfList != 0) {
			temp = temp.next;
			sizeOfList--;
		}
		addNumBefore(data, temp);
	}

	/*
	 * In sort method, I am just traversing head and adding a number at node where
	 * the condition will be fulfill.  
	 */
	public void sort(int num) {
		Node temp = null;
		Node traverse = head;
		Node n = new Node(num);
		
		if (sizeOfList == 0) {
			head = n;
			tail = n;
		}
		/*
		 * In this below condition I checked if number will be greater than  head
		 * then it will traverse the list. add at suitable place I used temp for
		 * condition. The purpose is just to place after the traversing head data.
		 * */
		if (num > head.data) {
			while (traverse != null) {

				if (num > traverse.data) {
					temp = traverse;
				}
				traverse = traverse.next;
			}
			addNumAfter(num, temp);
		} else if (num < head.data) {
			Node tra = traverse;
			addNumBefore(num, tra);
		} else {
			addNumStart(num);
		}
		sizeOfList++;
	}

	/*
	 * display is just to display the list
	 */
	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.println("Value:" + temp.data);
			temp = temp.next;
		}

		//  If you want to show index with each value the you can use below loop!
		/*
		 * int a = 0; while (a < sizeOfList) { System.out.println("Index:" + a +
		 * " Value: " + temp.data); temp = temp.next; a++; }
		 */

	}
	
	public static void main(String args[]) {
		LIST ob = new LIST();
		int[] ar = new int[] { 68, 69, 70, 73, 74, 77, 71, 83, 82, 67, 87, 80, 66, 75, 76, 81 };

		for (int a = 0; a < ar.length; a++) {
			ob.sort(ar[a]);
		}
		ob.display();

		/*
		 * @The mention code below is testing methods 
		 */ 

		//ob.addNumStart(2);
		//ob.addNumStart(1);
		//ob.addNumStart(50);
		//Node y = ob.addNumEnd(-1);
		//ob.addNumAfter(2, y);
		//ob.addNumEnd(3);
		//ob.addNumEnd(-2);
		//ob.addNumEnd(5);
		//ob.addNumEnd(6);
		//ob.addNumEnd(7);
		//ob.addNumEnd(8);
		//ob.deleteNumStart();
		//ob.deleteNumStart();
		//ob.deleteNumEnd();
		//ob.deleteNumEnd();
		//ob.atIndex(11,7);
		//ob.display();
 
	}

}
