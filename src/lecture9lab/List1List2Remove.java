package lecture9lab;

public class List1List2Remove{

	String str;
	int num;
	List1List2Remove StrNext;
	List1List2Remove NumNext;
	public List1List2Remove() {
		StrNext=null;
		NumNext=null;
		str=null;
		num=0;
	}
	public List1List2Remove(String str){
		this.str=str;
	}
	public List1List2Remove(int num){
		this.num=num;
	}
	
	public void displayStr(){
		System.out.println("String is: "+str );
		
	}
	public void displayNum(){
		System.out.println("Num is: "+num );
		
	}
	
	public static void main(String args[]){
		link ob = new link();
		ob.insertL1("A");
		ob.insertL1("B");
		
		ob.insertL2(1);
		ob.insertL2(2);
		
		ob.display();
	}
	
}

class link{
	List1List2Remove Strhead;
	List1List2Remove Numhead;
	public link() {
		Strhead=null;
		Numhead=null;
	}
	
	public void insertL1(String var){
		List1List2Remove addStr = new List1List2Remove(var);
		addStr.StrNext=Strhead;
		Strhead=addStr;
	}
	public void insertL2(int num){
		List1List2Remove addNum = new List1List2Remove(num);
		addNum.NumNext=Numhead;
		Numhead=addNum;
	}
	
	public void display(){
		List1List2Remove viewStr=Strhead;
		while(viewStr!=null){
			viewStr.displayStr();
			viewStr = viewStr.StrNext;
			
		}
		List1List2Remove viewNum=Numhead;
		while(viewNum!=null){
			viewNum.displayNum();
			viewNum = viewNum.NumNext;
		}
	}
	
	public void delete(){
		List1List2Remove remove=Numhead;
		List1List2Remove elementRemove=Strhead;
		int deleteIndex;
		int count=1;
		while(remove.NumNext!=null){
			deleteIndex=remove.num;
			//while(elementRemove.NumNext.)
			if(count==deleteIndex){
				
				
			}
			remove=remove.NumNext;
		
		}
	}
	
}



