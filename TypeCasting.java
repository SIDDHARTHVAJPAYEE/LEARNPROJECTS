package LEARNPROJECT;

public class TypeCasting {
	public static void main(String[] args) {
		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("Char type: "+a);
		int x=a;
		System.out.println("Int type : "+x);
		float y=x;
		System.out.println("Float value is : "+y);
		double b=y;
		System.out.println("Double Value is : "+b);
		int l=(int)b;
		System.out.println("Explicit Type casting "+l);
	}

}
