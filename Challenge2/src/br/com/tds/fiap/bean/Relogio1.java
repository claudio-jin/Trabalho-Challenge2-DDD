package br.com.tds.fiap.bean;

public class Relogio1 {
	private int armazenarVezes;	//armazenar horario
	private String mandarExpirar;
	private String mandarSegurar;
	private String mandarInspirar;
	
	public String nome;
	
	public Relogio1() {}
	
	//getter/setters
	
	public String getMandarInspirar() {
		return mandarInspirar;
	}
	public void setMandarInspirar(String mandarInspirar) {
		this.mandarInspirar = mandarInspirar;
	}
	
	public int getArmazenarVezes() {
		return armazenarVezes;
	}
	
	public void setArmazenarVezes(int armazenarVezes) {
		this.armazenarVezes = armazenarVezes;
	}
	
	public String getMandarExpirar() {
		return mandarExpirar;
	}
	public void setMandarExpirar(String mandarExpirar) {
		this.mandarExpirar = mandarExpirar;
	}
	public String getMandarSegurar() {
		return mandarSegurar;
	}
	public void setMandarSegurar(String mandarSegurar) {
		this.mandarSegurar = mandarSegurar;
	}
	
	//métodos
	public String inspirar(String nome) {
		String ordem1 = "Puxe o ar lentamente " + nome ;
		return ordem1;
	}

	public String segurar() {
		String ordem2 = "Segure o ar durante 3 segundos";
		return ordem2;
	}
	
	public String expirar() {
		String ordem3 = "Solte o ar lentamente";
		return ordem3;
	}
}
