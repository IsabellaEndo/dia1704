package dia1704;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int numero, numero2;

		System.out.println("digite o primeiro numero:");
		numero = ler.nextInt();

		System.out.println("digite o segundo numero:");
		numero2 = ler.nextInt();

		for(int i =numero; i <=numero2; i++) {



			if ( i % 2==1)	{ 
				System.out.println(numero +" o numero é impar");	
			}

			ler.close();
		}
	}
}