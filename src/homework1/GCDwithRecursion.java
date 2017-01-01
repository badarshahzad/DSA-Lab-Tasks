package homework1;

public class GCDwithRecursion {
	
	private static int divider;
	private static int divident;
	private static int remander;
	public static int GCD(int a,int b){
		if(a>b){
			divident=a;
			divider=b;
		}else
		{
			divident=b;
			divider=a;
		}
		remander = divident%divider;
		if(divident%divider==0){
			return divider;
		}
		a=remander;
		b=divider;
		return GCD(a,b);
	}
	
	public static void main(String args[]){
		int a = 30;
		int b = 20;
		System.out.println(GCD(a,b));
	}

}
