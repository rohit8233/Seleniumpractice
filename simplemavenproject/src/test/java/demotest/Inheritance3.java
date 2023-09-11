package demotest;

  interface demo{
	  public void run();
	  
  }

interface demo2 extends demo{
	public void run2();
}
   class Inheritance3 implements demo2{
	 
	  public void run() {
		  System.out.println("hello");
	  }
	  
	  public void run2() {
		  System.out.println("hello john");
	  }
	public static void main(String[] args) {
		Inheritance3 a=new Inheritance3();
         a.run();
         a.run2();
		
	}
	 
 }