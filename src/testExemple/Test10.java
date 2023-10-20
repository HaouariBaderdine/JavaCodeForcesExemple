package testExemple;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ch = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrer une chaine de caractere : ");
		ch = scanner.nextLine();
		
		ch = ch.replaceAll("\\s+", "").toLowerCase(); // Supprimer les espaces et convertir en minuscules

		StringBuilder reversed = new StringBuilder(ch);

		String reversedStr = reversed.reverse().toString();
		
		System.out.println("Chaîne d'origine : " + ch);
        System.out.println("Chaîne inversée : " + reversedStr);
        
        if (ch.equals(reversedStr)) {
            System.out.println("C'est un palindrome.");
        } else {
            System.out.println("Ce n'est pas un palindrome.");
        }

		scanner.close();
	}

}

/*for (int i = 0; i < ch.length(); i++) {
char c = ch.charAt(i);
if (Character.isLetter(c)) {
    cleanStr.append(Character.toLowerCase(c));
}
}*/