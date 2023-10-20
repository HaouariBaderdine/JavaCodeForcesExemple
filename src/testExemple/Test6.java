package testExemple;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String test = "oui";

		while (test.equals("oui")) {

			System.out.println("Donnez le premier nombre : ");
			int x = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Donner le 2eme nombre : ");
			int y = scanner.nextInt();
			scanner.nextLine();

			if (x == y) {
				System.out.println("Égaux");
			} else {
				System.out.println("Non Égaux");
			}

		    System.out.println("Voulez-vous continuer ? (oui/non) : ");

		    test = scanner.next().toLowerCase(); 
		}

		scanner.close();
	}

}
