package lista3;
import java.util.Scanner;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		Veiculos[] lista = new Veiculos[50];

		int tipo;

		for (int i=0; i < 2; i++){

			System.out.printf("Digite o numero 1 para Moto e o 2 para Carro");
			Scanner in = new Scanner(System.in);
			tipo = in.nextInt();

			if (1 == tipo) 
				lista[i] = new Moto();

			else 
				lista[i] = new Carro();
			lista[i].inserirDados(); 
		}

		for (int i=0; i < 2; i++)
			lista[i].printDados();
	}

} 