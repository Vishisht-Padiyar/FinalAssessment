package ObjectOrientedProgramming;


public class ProtectedAccessModifier extends ProtectedAccessParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedAccessModifier a = new ProtectedAccessModifier();
		a.add(7,100);
		//This is executed only because this inherits the parent from other package
	}
}
