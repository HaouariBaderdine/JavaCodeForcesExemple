package testExemple;

import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] entiers = new int[5];
		
        System.out.println("Veuillez entrer 5 entiers :");
        
        for(int i = 0; i<5; i++) {
        	System.out.print("Entier " + (i + 1) + ": ");
        	if(scanner.hasNextInt()) {
        		entiers[i] = scanner.nextInt();
        	}else {
                System.out.println("Ce n'est pas un entier valide. Réessayez.");
        	}
        	scanner.nextLine();
        }
		
        int somme = 0;
        for(int x : entiers) {
        	somme+=x;
        }
        
        double moyenne = (double) somme/entiers.length;
        
        System.out.println("La moyenne des entiers saisis est : " + moyenne);
        
        scanner.close();

        
	}

}
