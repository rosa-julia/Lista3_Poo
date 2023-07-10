package lista3;
import java.util.Scanner;

public class Moto extends Veiculos{
	private int ano;

	public Moto(String modelo, double preco, int ano){
		super(preco, modelo);
		this.ano = ano;
	}

	public Moto(){ 
		this("Vazio",0.00,0); 
	}


	public double getPreco(){ 
		double precoBase = super.getPreco();
		if(ano >= 2008) {
			return precoBase + precoBase * 0.1;
		} else {
			return precoBase; 
		}
	}

	public void setAno(int ano){
		this.ano = ano;
	}

	public void reajustarPreco() {
		setPreco(getPreco() + getPreco() * 0.1); 
	}

	public int getAno() {
		return ano;
	}

	public void inserirDados(){
		Scanner in = new Scanner(System.in);
		System.out.printf("Digite o ano: ");
		ano = in.nextInt();
		super.inserirDados();
	}

}
