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
	
	public double getAno(){ 
		return ano; 
	}
	public double getPreco(){ 
		if(ano >= 2008) {
			return super.getPreco() + super.getPreco() * 0.1;
		} else {
			return getPreco(); 
		}
	}
	
	public void setAno(int ano){
		this.ano = ano;
	}
	

	
	

}
