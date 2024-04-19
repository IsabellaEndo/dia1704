package dia1704;
import java.util.Scanner;
public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		System.out.print("Qual a quantidade de funcionários da empresa: ");
		int quantidadeFuncionarios = ler.nextInt();
		double totalSalarios = 0;


		for (int i = 1; i <= quantidadeFuncionarios; i++) {
			System.out.print("informe salário do funcionário " + i + ": ");
			double salario = ler.nextDouble();
			totalSalarios += salario;
		}

		double mediaSalarial = totalSalarios / quantidadeFuncionarios;

		System.out.println("A média salarial da empresa é: " + mediaSalarial);

		ler.close();
	}

}
