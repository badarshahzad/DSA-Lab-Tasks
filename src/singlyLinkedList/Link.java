package singlyLinkedList;

public class Link {

	public String book;
	public int millionsSold;

	public Link next;

	public Link() {
		book = null;
		millionsSold = 0;
	}

	public Link(String book, int millionsSold) {

		this.book = book;
		this.millionsSold = millionsSold;

	}

	public void display() {

		System.out.println(book + ": " + millionsSold + ",0000");

	}

	public static void main(String args[]) {
		Linklist obj = new Linklist();
		obj.insertNewLink("b", 3);
		obj.insertNewLink("a", 2);
		obj.insertNewLink("v", 1);

		obj.display();
		
		System.out.println(obj.find("a").book);

	}
}

class Linklist {
	public Link firstLink;

	public Linklist() {
		firstLink = null;
	}

	public boolean isEmpty() {
		return (firstLink == null);
	}

	public void insertNewLink(String book, int millionsold) {
		Link newlink = new Link(book, millionsold);
		newlink.next = firstLink;
		firstLink = newlink;
	}

	public void display() {
		Link theLink = firstLink;

		while (theLink != null) {
			theLink.display();
			theLink = theLink.next;
			System.out.println();
		}
	}

	public Link find(String book) {
		Link theLink = firstLink;
		if (!isEmpty()) {
			while (theLink.book != book) {
				if (theLink.next == null) {
					return null;
				} else {

					theLink = theLink.next;
				}
			}
		} else {
			System.out.println("Empty Linked list");
		}
		return theLink;
	}
}
