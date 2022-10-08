package ObjectOrientedProgramming;


public class Interface implements ParentA, child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface a = new Interface();
		a.m1();
		a.m2();
	}
	public void m1() {
		System.out.println("m1 output");
		
	}
	public void m2() {
		System.out.println("m2 output");
	}

}
interface ParentA{
	abstract void m1();
	
}

interface child{
	abstract void m2();
	
}