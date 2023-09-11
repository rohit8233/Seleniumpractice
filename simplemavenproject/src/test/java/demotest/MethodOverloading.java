package demotest;

public class MethodOverloading{
	
	public static void main(String[] args) {
		
		//MethodOverloading a=new MethodOverloading();
		int Num=AddNumber(2,3);
		double Num2=AddNumber(2.2, 4.2);
		System.out.println(Num);
		System.out.println(Num2);

		
		
		
	}
	
	public static int AddNumber(int a, int b) {
		return a+b;
	}
	
	public static double AddNumber(double a, double b) {
		return a+b;
	}
	
	
}