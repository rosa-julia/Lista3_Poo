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
		double precoBase = super.getPreco();
		if(km > 100000) {
			return precoBase - precoBase * 0.08;
		} else {
			return precoBase; 
		}
	}

	public void reduzirPreco() {
		setPreco(getPreco() - getPreco() * 0.08);
	}

	public double getKm() {
		return km;
	}
}
