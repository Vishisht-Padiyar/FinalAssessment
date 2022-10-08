package ObjectOrientedProgramming;

public class Overloading {

	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.add(10,20);
		obj.add(10.1,9.7,20.2);
		obj.add(100.1f,13.8f);		
	}
	
	void add(int x, int y) {
		System.out.println(x+y);
	}
	void add(double a, double b, double c) {
		System.out.println(a+b+c);
	}
	void add(float x, float y) {
		System.out.println(x+y);
	}

}
