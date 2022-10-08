package ObjectOrientedProgramming;


public class ExceptionHandeling {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int a[]= new int[7];
		
		
		try {
			a[10] = 100/0;
			
			
			//a[11] = 10;
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("Index out of range");
		}
		catch(ArithmeticException e) {
			System.out.print("Arithmetic Exception occured");
		}
		catch(Exception e) {
			System.out.print("Exception occured");
		}

	}

}
