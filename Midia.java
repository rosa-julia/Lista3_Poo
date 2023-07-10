package lojamidia;
import java.util.Scanner;

public class Midia {

	private int codigo;
	private double preco;
	private String nome;

	public void setCodigo(int codigo){ 
		this.codigo = codigo; 
	}

	public void setPreco(double preco){ 
		this.preco = preco; 
	}

	public void setNome(String nome){ 
		this.nome = nome; 
	}

	public int getCodigo(){ 
		return codigo; 
	}

	public double getPreco(){ 
		return preco; 
	}

	public String getNome(){ 
		return nome; 
	}


	public Midia(){
		this(0,0.0,"Vazio"); 
	}

	public Midia(int codigo, double preco, String nome){
		setCodigo(codigo);
		setPreco(preco);
		setNome(nome);
	}

	public String getTipo(){
		return "Midia: ";
	}

	public String getDetalhes(){
		return "Codigo: " + getCodigo() + "\n" +
				"Preco: " + getPreco() + "\n" +
				"Nome: " + getNome();
	}

	public void printDados(){
		System.out.println(getTipo());
		System.out.println(getDetalhes());
		System.out.println();
	}

	public void inserirDados(){
		Scanner in = new Scanner(System.in);

		System.out.printf("Digite o codigo: ");
		int codigo1 = in.nextInt();

		System.out.printf("Digite o preco: ");
		double preco1 = in.nextDouble();
		in.nextLine();

		System.out.printf("Digite o nome: ");
		String nome1 = in.nextLine();

		setCodigo(codigo1);
		setPreco(preco1);
		setNome(nome1);
	}

} 

