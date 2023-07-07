package lista3;
import java.util.Scanner;

public class Dvd extends Midia{

	private int nFaixas;

	public Dvd(){ 
		this(0,0.0,"Vazio",0); 
	}

	public Dvd(int codigo, double preco, String name, int nFaixas){ 
		super(codigo, preco, name);  setFaixas(nFaixas); 
	}

	public String getTipo(){ 
		return "Dvd: "; 
	}

	public String getDetalhes(){ 
		return super.getDetalhes() + "\n" +
				"Numero de faixas no Dvd: " + nFaixas; 
	}

	public void setFaixas(int nfaixa){ 
		nFaixas = (nfaixa > 0) ? nfaixa:0; }


	public void inserirDados(){
		super.inserirDados();

		Scanner in = new Scanner(System.in);


		System.out.printf("Digite o numero de faixas: \n");
		int nfaixa = in.nextInt();

		setFaixas(nfaixa);
	}

} 
