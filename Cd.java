package lista3;
import java.util.Scanner;

public class Cd extends Midia{

	private int nMusicas;


	public Cd(){ 
		this(0,0.0,"Vazio",0); 
	}

	public Cd(int codigo, double preco, String name, int nMusicas){
		super(codigo, preco, name);
		setMusica(nMusicas);
	}

	public String getTipo(){ 
		return "CD: "; }

	public String getDetalhes(){ 
		return super.getDetalhes() + "\n" +
				"Numero de musicas no CD: " + nMusicas;
	}

	public void setMusica(int nmusica){ 
		nMusicas = (nmusica>0) ? nmusica:0; }


	public void inserirDados(){ 
		super.inserirDados();

		Scanner in = new Scanner(System.in);
		System.out.printf("Digite o numero de musicas: \n");
		int nmusica = in.nextInt();

		setMusica(nmusica); 
	}

}
