package lista3;
import java.util.Scanner;

public class Teste {

	public static void main(String args[]){

		Midia[] lista = new Midia[50];

		int tipo;

		for (int i=0; i < 2; i++){

			System.out.printf("Digite o numero 1 para CD e o 2 para DVD");
			Scanner in = new Scanner(System.in);
			tipo = in.nextInt();

			if (1 == tipo) 
				lista[i] = new Cd();

			else 
				lista[i] = new Dvd();
			lista[i].inserirDados(); 
		}

		for (int i=0; i < 2; i++)
			lista[i].printDados();
	}

} 