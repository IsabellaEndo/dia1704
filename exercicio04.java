package dia1704;
import java.util.Scanner;
public class exercicio04 {

	public static void main(String[] args) {
		
			Scanner ler = new Scanner(System.in);

			System.out.print("Digite um número: ");
			int numero = ler.nextInt();

			int fat = 1;


			for (int i = 1; i <= numero; i++) {
				fat *= i;
			}

			System.out.println("O fatorial de " + numero + " é: " + fat);

			ler.close();

	}

}
