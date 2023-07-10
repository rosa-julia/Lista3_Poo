package lista3;

import java.util.Scanner;

public class Veiculos {

	private String modelo;
	private double preco;

	public void setPreco(double preco){ 
		this.preco = preco; 
	}

	public void setModelo(String modelo){ 
		this.modelo = modelo; 
	}

	public double getPreco(){ 
		return preco; 
	}

	public String getModelo(){ 
		return modelo; 
	}

	public Veiculos(double preco, String modelo){
		this.preco = preco;
		this.modelo = modelo;
	}

	public void printDados(){

		System.out.println("Preço: " + preco);
		System.out.println("Modelo: " + modelo);
	}


	public void inserirDados(){
		Scanner in = new Scanner(System.in);

		System.out.printf("Digite o modelo: ");
		String modelo1 = in.nextLine();

		System.out.printf("Digite o preco: ");
		double preco1 = in.nextDouble();


		setModelo(modelo1);
		setPreco(preco1);

	}


}
