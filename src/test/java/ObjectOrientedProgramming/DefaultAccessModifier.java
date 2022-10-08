package ObjectOrientedProgramming;


public class DefaultAccessModifier {

	public static void main(String[] args) {
		New obj = new New();
		System.out.println(obj.x); 
		obj.m1();
	}

}
class New{
	 int x=90;
	 void m1() { 
		System.out.println("This is Default method & belongs to Class New");
	}
}