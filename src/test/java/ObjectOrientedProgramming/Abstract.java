package ObjectOrientedProgramming;



public class Abstract extends Parent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract a = new Abstract();
		a.m1();
	}
	void m1() {
		System.out.println("m1 output");
		
	}

}
abstract class Parent1{
	abstract void m1();
	
}