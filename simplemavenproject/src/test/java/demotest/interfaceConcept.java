package demotest;


interface demo1 {
	
	void display1();
}

interface demo3{
	
	void display2();
}

 
public class interfaceConcept implements demo1, demo3{

	
		public void display1() {
			 System.out.println("Hello");
		 }
		 
		 public void display2() {
			 System.out.println("Hello world");

		 }
	}

