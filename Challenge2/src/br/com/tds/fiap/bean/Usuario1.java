package br.com.tds.fiap.bean;

public class Usuario1 {
	private String nome;
	private String email;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
	private GuardarDados guardarDados;
	
	//construtor
	public Usuario1() {} 
	
	public Usuario1(String nome, String email, int diaNascimento, 
			int mesNascimento, int anoNascimento,
			GuardarDados guardarDados) {
		super();
		this.nome = nome;
		this.email = email;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
		this.guardarDados = guardarDados;
	}
	
	//getters/setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDiaNascimento() {
		return diaNascimento;
	}

	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}

	public int getMesNascimento() {
		return mesNascimento;
	}

	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public GuardarDados getGuardarDados() {
		return guardarDados;
	}

	public void setGuardarDados(GuardarDados guardarDados) {
		this.guardarDados = guardarDados;
	}
	
	
	//metodos
		public String exibirDados() {
			return "O usuário(a) : " + nome + "\n" + "Portador do email: " + email + 
					"\n" + "Nascido no dia: " + diaNascimento + "/" + mesNascimento + "/"
					+ anoNascimento +
					"\n\n" + guardarDados.getAprovacao() + " o armazenamento de dados.";

			
		}
}
