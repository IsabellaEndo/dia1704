package dia1704;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double valor, soma=0, media;

		for(double i =0; i<=4; i++) {
			System.out.println ("digite o valor:");
			valor = ler.nextDouble();
			soma += valor;
		}
		media = soma/5;
		System.out.println("a media foi "+ media );
		ler.close();


	}


}


