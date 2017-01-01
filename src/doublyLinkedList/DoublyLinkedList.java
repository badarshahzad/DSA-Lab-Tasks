package doublyLinkedList;

public class DoublyLinkedList {
	
	int data;
	DoublyLinkedList next;
	DoublyLinkedList prev;
	
	public DoublyLinkedList() {
		data=0;
		next=null;
		prev=null;
	}
	
	public DoublyLinkedList(int a) {
		data=a;
		next=null;
		prev=null;
	}
	
	public  void display(){
		System.out.println("data: " + data);
	}
	
	public static void main(String args[]){
		link object = new link();
		
	
		
		object.addAtEnd(10);
		object.addAtEnd(11);
		object.addAtEnd(5);
		

		object.addAtStart(1);
		object.addAtStart(2);
		object.addAtStart(3);
		object.addAtStart(4);
		
		object.display();;
		//object.display();
	}
	
}
 class link{
	 
	 DoublyLinkedList head;
	 
	 public link(){
		 head=null;
	 }
	 
	 DoublyLinkedList oldFirst=null;
	 public void addAtStart(int a){
		 DoublyLinkedList object3 = new DoublyLinkedList(a);
		 object3.prev=head;
		 object3.next=head;
		 if(oldFirst==null){
			 oldFirst=object3;
		 }
		 head=object3;
	 }
	 
	 public void addAtEnd(int a){
		 DoublyLinkedList valueAtEnd = new DoublyLinkedList(a);
		// valueAtEnd.prev=oldFirst; 
		 oldFirst.next=valueAtEnd;
		 oldFirst=valueAtEnd;
		
		 
		 
		
		/// valueAtEnd.prev=oldFirst;
		 
	 }
	 
	 public void display(){
		 
		 DoublyLinkedList object4=head;
		 
		 while(object4!=null){
			 if(object4.prev==null){
				object4.prev=head;
			 }
			 System.out.println("Next: "+object4.data +"   Previous: "+ object4.prev.data);
			// System.out.println();
			 object4=object4.next;
		 }
	 }
 }
 
 
 
 
 
 
 
 
 
 
 