package homework1;


public class RelativePrime {
	//The relative prime are those number whose GCD is 1 
	
	private static int divider;
	private static int divident;
	private static int remander;
	public static String GCD(int a,int b){
		prime(a,b);
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
			return String.format("Not prime");
		}
		if(divident%divider==1){
			return String.format("Prime");
		}
		a=remander;
		b=divider;
		return GCD(a,b);
	}
	
	public static int prime(int a,int b){
		
		return 0;
	}
	
	public static void main(String args[]){
		int a = 12;
		int b = 13;
		System.out.println("The two numbers are relative prime: "+GCD(a,b));
	}

}