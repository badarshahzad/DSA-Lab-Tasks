package kaka;

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
	public Node(int data){
		this.data = data;
		left = null;
		right = null;
		root = null;
		height = 0;
	}
	
	public static void main(String args[]){
		
		}
	
}

class Tree{
	Node head;
	
	public Tree(){
		head = null;
	}
	
	public void addNode(int newdata){
		Node newNode = new Node(newdata);
		newNode.root = head;
		head = newNode;
		
	}
	
	
	
}