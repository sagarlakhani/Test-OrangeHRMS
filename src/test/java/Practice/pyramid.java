package Practice;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		Scanner keyboard = new Scanner(System.in);
		int k= keyboard.nextInt();
		
		
		for (int i=0;i<k;i++)
		{
			for (int j =0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		for (int i=0;i<k;i++)
		{
			for (int j =0;j<=i;j++) {
				
				System.out.print(x);
				x++;
			}
			System.out.println();
		}
		
		
	}

}

