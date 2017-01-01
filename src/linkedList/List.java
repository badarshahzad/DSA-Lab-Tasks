package linkedList;

public class List {

	Node head;

	public List() {
		head = null;
	}

	public List(Node e) {
		head = e;
	}

	Node oldfirst = null;
	Node lasthead = null;

	public void addAtStart(String name, int age) {
		Node newObject = new Node(name, age);
		newObject.next = head;

		// First Index location oldfirst
		if (oldfirst == null) {
			oldfirst = newObject;
			
		}

		// Head traversing after inserting value //lasthead is for just to
		// remember last head
		head = newObject;
		lasthead = head;

	}

	public void addAtEnd(String name, int age) {
		Node atEndValue = new Node(name, age);
		oldfirst.next = atEndValue;
		oldfirst = atEndValue;
	}

	// Just traversing through head objects and showing values on console
	public void display() {
		Node store = head;
		while (store != null) {
			store.display();
			store = store.next;
			System.out.println();
		}
	}

	public void deleteFromStart() {
		if (head.next != null) {
			head = head.next;
		}

	}

	public void deleteFromEnd() {
		Node start = head;
		Node prev = null;
		while (start.next != null) {
			prev = start;
			start = start.next;
		}
		prev.next = null;
	}

	public void deleteFromSpecificPosition() {

	}

	public boolean search(String name) {
		Node startChecking = head;
		boolean exist = false;
		while (startChecking != null) {

			if (startChecking.name == name) {
				exist = true;
			}
			startChecking = startChecking.next;
		}
		return exist;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return (head.toString()).length();
	}
}
