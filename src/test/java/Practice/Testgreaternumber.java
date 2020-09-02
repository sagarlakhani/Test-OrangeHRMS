package Practice;

public class Testgreaternumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 200;
		int b = 150;
		int c = 300;

		//highest number
		if (a > b) {
			if (a > c) {
				System.out.println("a is greater number");
			} else {
				System.out.println("c is greater number");
			}
		} else if (b > c) {
			System.out.println("b is greater number");
		} else {
			System.out.println("c is greater number");
		}

		//highest number
		if (a > b && a > c) {
			System.out.println("a is greater number");
		} else if (b > a && b > c) {
			System.out.println("b is greater");
		} else {
			System.out.println("C is greater");
		}

		
		//second highest
		if (a > b && a < c) {
			System.out.println("a is 2nd greater number");
		} else if (b > a && b < c) {
			System.out.println("b is 2nd greater");
		} else {
			System.out.println("C is 2nd greater");
		}

	}

}
