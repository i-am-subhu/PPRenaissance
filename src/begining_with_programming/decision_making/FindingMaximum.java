package begining_with_programming.decision_making;

import java.util.Scanner;

public class FindingMaximum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (a >= b) {
			if (a >= c)
				System.out.println(a);
			else
				System.out.println(c);
		} else {
			if (b >= c)
				System.out.println(b);
			else
				System.out.println(c);
		}

	}
}
