package tree;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BinaryTree {

	Node root = null;

	
	/*public void insert(int id){
		Node  newNode = new Node(id);
		if(root==null){
			root = newNode;
			return;
		}
		
		Node current = root;
		Node parent = null;
		
	}
	*/
	
	//-----Below is my code that is working fine for preorder but not for post and in order!
	
	
	public void insert(int id) {
		Node addNode = new Node(id);
		if (root == null) {
			root = addNode;
		} else {
			Node cpRoot = root;
			while (true) {
				if (id <root.data) {
					cpRoot = cpRoot.left;
					if (cpRoot == null) {
						cpRoot = addNode;
						return;
					}
				} 
				else{
					cpRoot = cpRoot.right;
					if (cpRoot == null) {
						cpRoot = addNode;
						return;
					}
				}
			}
		}
			
	}

	public void display(Node root) {

		if (root != null) {
			
			System.out.println("Data is: " + root.data);
			display(root.left);
			display(root.right);
		}

	}



	public static void main(String args[]) {
		  
		BinaryTree b = new BinaryTree();
		b.insert(43);b.insert(15);b.insert(8);b.insert(30);
		//b.insert(20);b.insert(35);b.insert(60);b.insert(50);
		//b.insert(82);b.insert(70);

		b.display(b.root);

	}
}

class Node {
	int data;
	Node right;
	Node left;

	public Node(int data) {
		this.data = data;
		right = null;
		left = null;

	}

}
