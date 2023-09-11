package demotest;


 class test{
	
	 int age;
	 String name;
	 public test() {
		 age=12;
		 name="Aman";
		 System.out.println("I am in Constructor");
	 }
	 
	 public test(int a, String name) {
		 
		 System.out.println(a+" "+name);

	 }
}
public class Constructor {

	public static void main(String[] args) {
		test ref=new test(12,"aman");
		test ref2=new test();
	}
	
}
