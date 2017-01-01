package linkedList;

public class Node {

	String name;
	int age;
	Node next;
	
	//Constructor to assign default values
	public Node() {
		name = "Abc";
		age = 10;
		next = null;
	}
	
	//Constructor every object when it made then values will assign 
	public Node(String name, int age) {
		this.name = name;
		this.age = age;
		next = null;
	}

	//Displaying values 
	public void display() {
		System.out.println("Name: " + name + " Age: " + age);

	}
}
