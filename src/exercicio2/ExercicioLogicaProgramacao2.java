package exercicio2;
import java.util.Scanner;

public class ExercicioLogicaProgramacao2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double salario;
		double reajuste;
		double resul;

		System.out.println("Informe o sal�rio: ");
		salario = ler.nextDouble();
		System.out.println("Informe o reajuste: ");
		reajuste = ler.nextDouble();

		reajuste = salario * reajuste / 100;
		resul= salario + reajuste;
		
		System.out.println("O sal�rio atualizado com o reajuste �: " + resul);

	}

}
