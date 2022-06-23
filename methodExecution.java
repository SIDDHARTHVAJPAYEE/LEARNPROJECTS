package LEARNPROJECT;

public class methodExecution {

	public int multiplyMethod(int num1,int num2) {
		int result;
		result=num1*num2;
		return result;
	}
	public static void main(String[] args) {
		methodExecution m1=new methodExecution();
		int x=m1.multiplyMethod(20,5);
		System.out.println(x);
	}

}
