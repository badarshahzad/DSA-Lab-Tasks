/*
package lab7;

public class Node {

	Node left;
	Node right;
	Node root;
	int data;
	int height;

	public Node() {
		left = null;
		right = null;
		root = null;
		height = 0;

	}

	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
		root = null;
		height = 0;
	}

	public void display(){
		System.out.println(data);
	}
	
	public static void main(String args[]) {
		Tree ob = new Tree();
		ob.addNode(3);
		ob.display();
		
	}

}

class Tree {
	Node head;

	public Tree() {
		head = null;
	}

	public void addNode(int newdata) {
		Node newNode = new Node(newdata);
		if(newNode.root==null){
		newNode.root = newNode;
		head = newNode.root;
		newNode.left = null;
		newNode.right = null;
		newNode.height = 0;
		}
	}
	
	public void display(){
		while(head.root!=null){
			System.out.println(head);
		}
	}
	
}










*/