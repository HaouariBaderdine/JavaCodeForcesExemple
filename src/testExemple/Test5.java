package testExemple;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String ch = "";
		StringBuilder reversed = new StringBuilder();
		
		System.out.println("Entre une chaine de caractére: ");
		
		ch = scanner.next();
				
		for(int i = ch.length()-1; i>=0;i--) {
			reversed.append(ch.charAt(i));
		}
		
		//reversed.reverse().toString();
		
		System.out.println(reversed.toString());

		
		scanner.close();

	}

}
