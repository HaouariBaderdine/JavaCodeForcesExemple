package testExemple;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int somme = 0;
		
		for(int i = 1 ; i<=100; i++) {
			if(i % 2 == 0) {
				somme += i;
			}
		}
		
		System.out.println(somme);

	}

}
