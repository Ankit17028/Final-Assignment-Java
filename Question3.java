
/*
Write a Java program to invoke parent class constructor from a child class. Create
Child class object and parent class constructor must be invoked. Demonstrate by
writing a program. Also explain key points about Constructor.
*/



class NegativeNoException extends Exception{
	
	
	NegativeNoException(String msg) {
		
		
		super(msg);
		
	}
	
	
}


public class Question3 {

	public static void main(String[] args)  {

		//Scanner sc = new Scanner(System.in);

		//System.out.println("Enter a positive No");

		//int n=sc.nextInt();
		int n=-11;
		try {

			if(n<0) {

				throw new NegativeNoException("The no entered is negative");

			}


		}catch(Exception e ) {


			System.out.println(e);

		}


	}

}
