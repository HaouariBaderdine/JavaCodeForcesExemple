package testExemple;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int nb = 0;
		
		System.out.println("Entrer une valeur :");

		int x = scanner.nextInt();
		
		
		while(x!=1) {
			System.out.println("X : " + x);
			if(x % 2 == 0) {
				x = x / 2; 
			}else {
				x = ((x * 3)+1);
			}
			nb++;
		}
		
		System.out.println("NB étapes : " + nb);
		
		scanner.close();
	}

}
