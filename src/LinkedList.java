
public class LinkedList {
	
	
	private static int var = 0;
	public LinkedList next;

	public LinkedList(){
		var = 0;
	}
	
	public LinkedList(int a){
		var = a;
	}
	
	public void display(){
		System.out.println("Number store is: "+var);
	}
	
	public static void main(String args[]){
		link ob = new link();
		ob.insert(3);
		ob.insert(4);
		ob.insert(5);
	
		ob.display();
	}
}

	class link{
		LinkedList key;
		
		public link(){
			key=null;
		}
		
		public boolean Isempty(){
			return key==null;
		}
		public void insert(int a){
			LinkedList newItem = new LinkedList(a);
			newItem.next=key;
			key=newItem;
		}
		
		public void display(){
			LinkedList item = key;
			while(item!=null){
				item.display();
				item=item.next;
				System.out.println();
			}
		}
		
		
		
		
	}

