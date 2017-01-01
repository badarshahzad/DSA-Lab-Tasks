package coursework;



public class CW_14031264 {
	
	int data;
	CW_14031264 next;
	CW_14031264 prev;
	
	public CW_14031264() {
		data=0;
		next=null;
		prev=null;
	}
	
	public CW_14031264(int a) {
		data=a;
		next=null;
		prev=null;
	}
	
	public  void display(){
		System.out.println("data: " + data);
	}
	
	public static void main(String args[]){
		link object = new link();
		
	
		

		
		object.addAtStart(1);
		object.addAtStart(2);
		object.addAtStart(2);
		object.addAtStart(3);
//		object.addAtStart(35);
//		object.addAtStart(4);
//		object.addAtStart(5);
		 
//		object.addAtEnd(6);
		//object.addAtEnd(7);
		//object.addAtEnd(8);
		
		object.display();;
		//object.display();
	}
	
}
 class link{
	 
	 CW_14031264 head;
	 
	 public link(){
		 head=null;
	 }
	 
	 CW_14031264 oldFirst=null;
	 public void addAtStart(int a){
		 CW_14031264 object3 = new CW_14031264(a);
		 object3.prev=head;
		 object3.next=head;
		 if(oldFirst==null){
			 oldFirst=object3;
		 }
		 head=object3;
		
	 }
	 
	 public void addAtEnd(int a){
		 CW_14031264 valueAtEnd = new CW_14031264(a);
		// valueAtEnd.prev=oldFirst; 
		 oldFirst.next=valueAtEnd;
		 oldFirst.prev=valueAtEnd;
		/* System.out.println(oldFirst.prev.data);
		 System.out.println(head.prev.data);
		 System.out.println(head.data);
		 System.out.println(head.next.data);*/
		
		/// valueAtEnd.prev=oldFirst;
		 
	 }
	 
	 public void display(){
		 
		 CW_14031264 object4=head;
		 
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
 
 
 
 
 
 
 
 
 
 
 