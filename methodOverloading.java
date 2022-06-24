package LEARNPROJECT;

public class methodOverloading {

		public int add(int number1,int number2) {
			return number1+number2;
		}
		public int add(int number1,int number2,int number3) {
			return number1+number2+number3;
		}
		public static void main(String[] args) {
			methodOverloading m1=new methodOverloading();
			methodOverloading m2=new methodOverloading();
			System.out.println(m1.add(12,568));
			System.out.println(m1.add(12,568,84));
	}

}
