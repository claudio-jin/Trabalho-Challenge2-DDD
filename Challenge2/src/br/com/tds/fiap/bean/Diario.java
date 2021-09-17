package br.com.tds.fiap.bean;

public class Diario {
	
	//Como atributos teremos
	
	private String nome; //ok
	
	private String escrever; //ok
	
	private int quantidadeDeLetras;
	
	private String registroAcontecimentos; //ok
	
	public String mes; //ok
	
	public int dia; //ok
	
	public int ano; //ok
	
	//vamos definir o construtor
	public Diario () {}

	
	
	//métodos Getters/Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEscrever() {
		return escrever;
	}

	public void setEscrever(String escrever) {
		this.escrever = escrever;
	}

	public int getQuantidadeDePalavras() {
		return quantidadeDeLetras;
	}

	public void setQuantidadeDePalavras(int quantidadeDeLetras) {
		this.quantidadeDeLetras = quantidadeDeLetras;
	}

	public String getRegistroAcontecimentos() {
		return registroAcontecimentos;
	}

	public void setRegistroAcontecimentos(String registroAcontecimentos) {
		this.registroAcontecimentos = registroAcontecimentos;
	}
	
	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//métodos
	//mostra a quantidade de caracteres
	public String qtdPalavras(int quantidadeDeLetras) {
		String mostrarCaractere = "A quantidade de caracteres digitadas por você é: "
				+ quantidadeDeLetras;
		return mostrarCaractere;
		
	}
	
	//Exibe os dados
	public String exibirDados(String escrever, String nome, int dia, String mes, int ano
			) {
		String dados = "O usuário \n" + nome + " no dia " + dia + "/ " + mes +
				" /" + ano + ".\n" + "Escreveu: \n" + escrever;
		return dados;
	}
	
	
	
	

}
