package calculo.idade;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Pessoa {
	//Atributos:
	private String nome;
	private String altura;
	private String anoNasc;
	private String mesNasc;
	private String diaNasc;
	private Duration idade;
	    
	 //Construtores:
	
	public Pessoa() {
		
	}
	        
	 public Pessoa(String nome, String altura, String anoNasc, String mesNasc, String diaNasc) {
		this.nome = nome;
		this.altura = altura;
		this.anoNasc = anoNasc;
		this.mesNasc = mesNasc;
		this.diaNasc = diaNasc;
	}

	//Métodos acessores:
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}
	
	public String getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(String anoNasc) {
		this.anoNasc = anoNasc;
	}

	public String getMesNasc() {
		return mesNasc;
	}

	public void setMesNasc(String mesNasc) {
		this.mesNasc = mesNasc;
	}

	public String getDiaNasc() {
		return diaNasc;
	}

	public void setDiaNasc(String diaNasc) {
		this.diaNasc = diaNasc;
	}
	
	public Duration getIdade() {
	     return idade;
	}

	public void setIdade(Duration idade) {
		this.idade = idade;
	}
	
	 //Métodos especiais:

	public void cadastroPessoa() {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		System.out.println("===== CADASTRO =====");
		System.out.println("Digite o seu nome: ");
		System.out.print("->");
		setNome(sc.nextLine());
		System.out.println("Digite sua altura: ");
		System.out.print("->");
		setAltura(sc.nextLine());
	}

	public void calculoIdade() {
		Scanner sc = new Scanner (System.in);
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("======= DATA DE NASCIMENTO =======");
		System.out.println("Entre com o ano de nascimento: ");
		System.out.print("->");
		setAnoNasc(sc.next());
		System.out.println("Entre com o mês de nascimento: ");
		System.out.print("->");
		setMesNasc(sc.next());
		System.out.println("Entre com o dia de nascimento: ");
		System.out.print("->");
		setDiaNasc(sc.next());
		
		LocalDate dataNascimento = LocalDate.parse(getAnoNasc() + "-" + getMesNasc()  + "-" + getDiaNasc());
	
		
		setIdade(Duration.between(dataNascimento.atStartOfDay(), dataAtual.atStartOfDay()));
		
	}
	
	public void relatório() {
		System.out.println("======= RELATÓRIO =======");
		System.out.println("Nome: " + getNome());
		System.out.println("Altura: " + getAltura() + " metros");
		System.out.println("idade: " + ((getIdade().toDays())/365) + " anos"); 
	}
}
