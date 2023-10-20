package testExemple;

public class Test {
    public static void main(String[] args) {
        int[] tableau = {1, 1, 3, 4, 5, 0};
        int intervalleMinimum = MinIntervale(tableau);
        System.out.println("L'intervalle minimum est : " + intervalleMinimum);
    }

    public static int MinIntervale(int[] tableau) {
        if (tableau.length < 2) {
            throw new IllegalArgumentException("Le tableau doit avoir au moins 2 éléments.");
        }
        
        if (tableau.length > 100) {
            throw new IllegalArgumentException("Le tableau doit avoir au maximum 100 éléments.");
        }

        int min1 = Integer.MAX_VALUE; // Initialisez min1 avec une valeur maximale.
        int min2 = Integer.MAX_VALUE; // Initialisez min2 avec une valeur maximale.

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] < min1) {
                min2 = min1; // Déplacez la valeur précédemment la plus petite vers min2.
                min1 = tableau[i]; // Mettez la nouvelle plus petite dans min1.
            } else if (tableau[i] < min2 && tableau[i] != min1) {
                min2 = tableau[i];
            }
        }

        int intervalleMinimum = min2 - min1;
        return intervalleMinimum;
    }
}
