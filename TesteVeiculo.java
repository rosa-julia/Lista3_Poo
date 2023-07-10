package lista3;
import java.util.Scanner;

public class TesteVeiculo {

public static void main(String args[]){
               
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int numVeiculos;

        System.out.println("Digite o número de veículos a serem cadastrados:");
        numVeiculos = scanner.nextInt();
       
        scanner.nextLine(); 
        Veiculos[] veiculos = new Veiculos[numVeiculos];
       


        for (int i = 0; i < numVeiculos; i++) {
            System.out.println("Digite 1 para moto ou 2 para carro:");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            if (opcao == 1) {
                Moto moto = new Moto();
                moto.inserirDados();
                veiculos[i] = moto;
                
            } else if (opcao == 2) {
                Carro carro = new Carro();
                carro.inserirDados();
                veiculos[i] = carro;
            }
        }

        double totalPreco = 0.0;

        for (Veiculos veiculo : veiculos) {
            veiculo.printDados();
            totalPreco += veiculo.getPreco();
        }

        System.out.println("Total de preços antes dos ajustes: " + totalPreco);

        for (Veiculos veiculo : veiculos) {
      
            if (veiculo instanceof Moto) {
                Moto moto = (Moto) veiculo;
                if (moto.getAno() >= 2008) {
                    moto.reajustarPreco();
                }
                moto.printDados();
               
            } else if (veiculo instanceof Carro) {
                Carro carro = (Carro) veiculo;
                if (carro.getKm() > 100000) {
                    carro.reduzirPreco();
                }
                carro.printDados();
            }
        }

        double totalPrecoAjustado = 0.0;

        for (Veiculos veiculo : veiculos) {
            veiculo.printDados();
            totalPrecoAjustado += veiculo.getPreco();
        }

        System.out.println("Total de preços após os ajustes: " + totalPrecoAjustado);
	}  
}
