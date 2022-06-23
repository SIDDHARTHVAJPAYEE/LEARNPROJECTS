package LEARNPROJECT;

public class Student {
	public static void main(String gg[]) {
		studentDemo s1=new studentDemo();
		s1.display(45,"Syed");
		studentDemo s2=new studentDemo();
		s2.display(48,"Rakesh");
	}
}
class studentDemo{
	int id;
	String name;
	void display(int id,String name) {
		System.out.println(id+" "+name);
	}
}
