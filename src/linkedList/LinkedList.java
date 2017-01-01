package linkedList;

public class LinkedList {

	public static void main(String argsp[]) {

		List ob = new List();

		/*
		 * Insering elements in the start
		 */
		ob.addAtStart("Ashraf", 22);
		ob.addAtStart("Abid", 21);
		ob.addAtStart("Ali", 20);

		/*
		 * Insering elements at the end
		 */
		ob.addAtEnd("Bilal", 24);
		ob.addAtEnd("Badar", 25);
		ob.addAtEnd("Babar", 26);

		/*
		 * Displaying all the elements in the nodes
		 */
		ob.display();

		/*
		 * Deleting elements at the start of linked list
		 */
		// System.out.println("Deleted first one");
		// ob.deleteFromStart();
		// ob.display();

		/*
		 * Deleting elements at the end of linked list
		 */
		// System.out.println("Deleted End one");
		// ob.deleteFromEnd();
		// ob.display();

		/*
		 * Searching element is exist or not?
		 */
		// System.out.println(ob.search("Badar"));
	}
}
