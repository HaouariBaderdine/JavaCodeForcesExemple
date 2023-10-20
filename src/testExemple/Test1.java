package testExemple;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] tableau = {1, 1, 3, 4, 5, 0};
        int intervalleMinimum = MinIntervale(tableau);
        System.out.println("L'intervalle minimum est : " + intervalleMinimum);
    }
    
    public static boolean tousSontDesEntiers(Object[] tableau) {
        for (Object element : tableau) {
            if (!(element instanceof Integer)) {
                return false; // Si un élément n'est pas un entier, retourne false.
            }
        }
        return true; // Si tous les éléments sont des entiers, retourne true.
    }

    public static int MinIntervale(int[] tableau) {
        if (tableau.length < 2) {
            throw new IllegalArgumentException("Le tableau doit avoir au moins 2 éléments.");
        }
        
        if (tableau.length > 100) {
            throw new IllegalArgumentException("Le tableau doit avoir au maximum 100 éléments.");
        }
        
        for (Object element : tableau) {
            if (!(element instanceof Integer)) {
            	throw new IllegalArgumentException("Le tableau doit avoir des éléments entiers.");
            }
        }

        Arrays.sort(tableau);
        
        int intervalleMinimum = tableau[1] - tableau[0];
        
        return intervalleMinimum;
    }
}
