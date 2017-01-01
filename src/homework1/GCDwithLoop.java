package homework1;

public class GCDwithLoop {

	public static void main(String args[]){
		int a = 20;
		int b = 10;
		int bigNum;
		int bigDivisor=0;
		if(a>b)
			bigNum=a;
		else
			bigNum=b;
		for(int x=1;x<=bigNum;x++){
			if(a%x==b%x){
				bigDivisor=x;
			}
		}
		System.out.println("Greatest common divisor: "+ bigDivisor);
	}
}
