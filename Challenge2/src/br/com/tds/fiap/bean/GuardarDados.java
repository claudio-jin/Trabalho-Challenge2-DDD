package br.com.tds.fiap.bean;

public class GuardarDados {
	private String aprovacao;
	//construtor
	public GuardarDados () {}
	
	public GuardarDados(String aprovacao) {
		super();
		this.aprovacao = aprovacao;
		
	}

	//getters/setters
	public String getAprovacao() {
		return aprovacao;
	}


	public void setAprovacao(String aprovacao) {
		this.aprovacao = aprovacao;
	}
}//class
