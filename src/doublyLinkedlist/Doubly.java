package doublyLinkedlist;

public class Doubly {

	//14031264	 68, 69, 70, 73, 74, 77, 71, 83, 82, 67, 87, 80, 66, 75, 76, 81 

	int size = 0;
	Node head = null;
	Node tail = null;

	public Node addAtStart(int data) {
		Node n = new Node(data);
		if (size == 0) {
			head = n;
			tail = n;
		}else {
			n.next = head;
			head = n;
			head.previous = n;
		}
		size++;
		return n;
	}
	
	public Node addAtEnd(int data){
		Node n = new Node(data);
		if(size==0){
			head=n;
			tail=n;
		}else{
			tail.next = n;
			n.previous = tail;
			tail = n;
		}
		size++;
		return n;	
	}
	
	public Node addAfter(int data,Node afterNode){
		
		if(afterNode==tail)
			return addAtEnd(data);
		
		Node n = new Node(data);
		Node tempafterNode = afterNode.next;
		
		//Four prcocess necessary befor adding after a specific node
		//Process:1 new node next place
		n.next = tempafterNode ;
		//Process:2 new node previous place
		n.previous =afterNode;
		//Process:3 after node next address assign
		afterNode.next=n;
		//Process:4 afterNode next node of previous assign  
		tempafterNode.previous=n;
		
		size++;
		return n;
	}
	
	public Node addBefore(int data, Node beforeNode){
		
		if(beforeNode==head)
			return addAtStart(data);
		
		Node n = new Node(data);
		Node tempBeforeNode = beforeNode.previous;
		
		n.next = beforeNode;
		n.previous = tempBeforeNode;
		tempBeforeNode.next = n;
		tempBeforeNode.previous=n;
		size++;
		
		return n;
	}

	public void print(){
		Node temp = head;
		
		/*while(temp!=null){
			System.out.println("Value:"+size+" Index: "+temp.data);
			temp= temp.next;
		}
		*/
		
		/*If you want to show index with each value the you can use below loop!
		 */
		int a=0;
		while(a<size){
			System.out.println("Index:"+a+" Value: "+temp.data);
			temp= temp.next;
			a++;
		}
	}
	
	public void deleteFromStart(){
		head = head.next;
		size--;
	}
	public void deleteFromEnd(){
		tail = tail.previous;
		size --; 
	}
	public void atIndex(int data,int size){
		if(size>this.size){
			System.out.println("Your index is grater than size of list!");
		}
		Node temp = head;
		while(size!=0){
			temp = temp.next;
			size --;
		}
		addBefore(data, temp);
			
	}
	public static void main(String args[]) {
		Doubly ob = new Doubly();
		
		ob.addAtStart(2);
		ob.addAtStart(1);
		ob.addAtStart(50);
		//Node y = ob.addAtEnd(-1);
		//ob.addAfter(2, y);
		ob.addAtEnd(3);
		//ob.addAtEnd(-2);
		ob.addAtEnd(4);
		ob.addAtEnd(5);
		ob.addAtEnd(6);
		ob.addAtEnd(7);
		ob.addAtEnd(8);
		//ob.deleteFromStart();
		//ob.deleteFromStart();
		ob.deleteFromEnd();
		ob.deleteFromEnd();
		ob.atIndex(11,7);
		
		//When I want to add at index 1 or 2 or 3 then error occur 
	
		ob.print();
		
	}

}

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
