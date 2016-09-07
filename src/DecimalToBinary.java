import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal number: ");
		String str = sc.nextLine();
		double j = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				j = j + Math.pow(2, str.length() - 1 - i);
			}

		}
		System.out.println("The Decimal number is: ");
		System.out.println((int)j);
		sc.close();
	}
}
