package lab7;
public class BinaryTree {
	
	Node root;
	public void addNode(int key) {
		Node newNode = new Node(key);

		if (root == null) {
			root = newNode;
		} else {
			Node focused = root;
			Node parent;
			while (true) {
				parent = focused;
				// To make left node
				if (key < focused.key) {
					focused = focused.leftChild;
					if (focused == null) {
						parent.leftChild = newNode;
						return;
					}
				}
				// To make Right node
				else {
					focused = focused.RightChild;
					if (focused == null) {
						parent.RightChild = newNode;
						return;
					}
				}
			}
		}
	}

	public void inOrderTraverseTreee(Node focusNode) {

		if (focusNode != null) {
			inOrderTraverseTreee(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraverseTreee(focusNode.RightChild);
		}
	}

	public void preOrder(Node focusNode) {

		if (focusNode != null) {
			System.out.println(focusNode);
			inOrderTraverseTreee(focusNode.leftChild);
			inOrderTraverseTreee(focusNode.RightChild);
		}
	}
	public void postOrder(Node focusNode) {

		if (focusNode != null) {
			inOrderTraverseTreee(focusNode.leftChild);
			inOrderTraverseTreee(focusNode.RightChild);
			System.out.println(focusNode);

		}
	}

	public static void main(String args[]) {

		BinaryTree theTree = new BinaryTree();
		
		
		theTree.addNode(30);
		theTree.addNode(22);
		theTree.addNode(5);
		theTree.addNode(1);
		theTree.addNode(9);
		theTree.addNode(0);

		theTree.inOrderTraverseTreee(theTree.root);
		System.out.println();
		theTree.preOrder(theTree.root);
		System.out.println();
		theTree.postOrder(theTree.root);
	}

}

class Node {

	int key;
	Node leftChild;
	Node RightChild;

	Node(int value) {
		key = value;
	}

	public String toString() {
		return key + "";
	}
}
