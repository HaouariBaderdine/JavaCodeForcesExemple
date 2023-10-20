package testExemple;

import java.util.Random;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int money = rand.nextInt(100);
		int nbrFils = rand.nextInt(10);
		
		System.out.println("Money: "+ money);

		System.out.println("Nb Fils: "+ nbrFils);
		
		int nb = verify(money, nbrFils);

		System.out.println("Resultat final: "+ nb);
	}

	public static int verify(int money, int nbrFils) {

		int x = 0;

		if (money < 8 || nbrFils<=0) {
            throw new IllegalArgumentException("Money ou nbrFils en dessous des limites minimales.");
		}
		
		if (money > 1000 || nbrFils>10) {
            throw new IllegalArgumentException("Money ou nbrFils au-dessus des limites maximales.");
		}
		
		if (money <= nbrFils) {
            throw new IllegalArgumentException("Money ne peut pas être inférieur ou égal à nbrFils.");
		}
		
		if (money % nbrFils == 0) {
			return nbrFils;
		} else {
            int sonsSurvived = money / 8;
            if (sonsSurvived == 4) {
                throw new IllegalArgumentException("Mort");
            } else {
                return sonsSurvived;
            }
        }
	}

}
