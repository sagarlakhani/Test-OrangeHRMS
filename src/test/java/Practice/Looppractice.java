package Practice;

public class Looppractice {

	public static void main(String[] args) {
		String[] compname = { "IBM", "Apple", "infosys", "Wipro" };

		for (String copyname : compname) {
			System.out.println(copyname);
		}

		for (int i = 0; i < compname.length; i++) {
			System.out.println(compname[i]);
		}

		String search = "Apple";
		// search.toUpperCase();
		int i;
		for (i = 0; i < compname.length; i++) {
			if (compname[i] == search) {
				System.out.println("searched value found at" + (i + 1) + " postion");
				break;
			} else {
				System.out.println("item not found");
			}
		}

		String test = "This is testing character string";
		int sum=0;
		test = test.toUpperCase();

		for (int j = 0; j < test.length(); j++) {
			char c=test.charAt(j);
			if (c != 'T') {
				continue;
			}
			sum++;
		}
		System.out.println(sum);

	}

}
