package ObjectOrientedProgramming;


public class Override extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Override dog = new Override();
		dog.animal();
		

	}
	void animal() {
		super.animal();
		System.out.println("The animal is a dog");
	}
}
class Parent{
	void animal() {
		System.out.println("This is an animal");
	}
}