package dia1704;
import java.util.Scanner;
public class exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int somaimpar =0,somapar = 0, num = 0;

		for(int i=0; i<=10; i++) {
			System.out.println("informe o numero");
			num =ler.nextInt();

			if (num %2 ==0) {
				somapar++;
			}
			else {
				somaimpar++;
			}
		}
		System.out.println("a quantidades pares é " + somapar);
		System.out.println("a quantidades impares é" + somaimpar);

	}

}
