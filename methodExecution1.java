package LEARNPROJECT;

public class methodExecution1 {
	int value=150;
	int operation(int val) {
		val=val/10;
		return val;
	}
	public static void main(String[] args) {
		methodExecution1 m1=new methodExecution1();
		methodExecution m5=new methodExecution();
		int x=m1.operation(200);
		int number=m5.multiplyMethod(5,8);
		System.out.println(x);
		System.out.println(number);
	}

}
