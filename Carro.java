package lista3;

public class Carro extends Veiculos{
	
	private double km;
	
	public Carro(String modelo,double preco, double km){
		super(preco, modelo);
		this.km = km;
	}
	
	public Carro(){ 
		this("Vazio",0.00,0.00); 
	}
	public void setKm(double km) {
		this.km = km;
	}
	
	public double getPreco(){ 
		if(km > 100000) {
			return super.getPreco() - super.getPreco() * 0.08;
		} else {
			return getPreco(); 
		}
	}
	
	
	

}
