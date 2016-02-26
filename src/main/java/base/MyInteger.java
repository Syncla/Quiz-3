package base;

public class MyInteger {
	private int iValue;
	MyInteger(int iValue){
		this.iValue=iValue;
	}
	public int getiValue() {
		return iValue;
	}
	public boolean isEven(){
		return isEven(getiValue());
	}
	public boolean isOdd(){
		return isOdd(getiValue());
	}
	public boolean isPrime(){
		return isPrime(getiValue());
	}
	public static boolean isEven(int value){
		return (value%2==0);
	}
	public static boolean isOdd(int value){
		return (value%2!=0);
	}
	public static boolean isPrime(int value){
		for (int i=2;i<value;i++){
			if (value%i==0){
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(MyInteger myInt){
		return isEven(myInt.getiValue());
	}
	public static boolean isOdd(MyInteger myInt){
		return isOdd(myInt.getiValue());
	}
	public static boolean isPrime(MyInteger myInt){
		return isPrime(myInt.getiValue());
	}
	public boolean equals(int value){
		return (getiValue()==value);
	}
	public boolean equals(MyInteger myInt){
		return (getiValue()==myInt.getiValue());
	}
}
