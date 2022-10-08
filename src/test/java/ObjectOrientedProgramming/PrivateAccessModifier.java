package ObjectOrientedProgramming;

public class PrivateAccessModifier {

	public static void main(String[] args) {
		A obj =new A();
		//System.out.println(obj.x); 			// OUT OF SCOPE AS ITS PRIVATE
		//obj.m1(); 							// OUT OF SCOPE AS ITS PRIVATE
		obj.m2(); 								// WITH IN SCOPE AS ITS PRIVATE

	}

}
class A{
	private int x=90; //Private variable
	private void m1() { //Private Method
		System.out.println("This is private method & belongs to Class A ");
	}
	void m2() {//This method acts as a default access modifier
		System.out.println("This is not private method & belongs to Class A ");
	}
	 A(){ // if we create this as private constructor it will be out of scope and object cannot be created outside this class 
		System.out.println("This is private constructor");
	}


}