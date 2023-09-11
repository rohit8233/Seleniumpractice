package demotest;

 class A{
	
	 public void add() {
		 
	 System.out.println("I have oneplus6t mobile");
 }	 
}
 
 class B extends A{
	 public void add() {
		 System.out.println("I have oneplus7t mobile");
	 }
	 
 }
public class MethodOverriding {

	public static void main(String[] args) {
		B ref=new B();
		ref.add();
	}
}
