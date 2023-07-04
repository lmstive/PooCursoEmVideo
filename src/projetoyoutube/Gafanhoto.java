package projetoyoutube;

public class Gafanhoto extends Pessoa {

	

	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistindo = 0;
	}

	private String login;
	private int totAssistindo;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistindo() {
		return totAssistindo;
	}

	public void setTotAssistindo(int totAssistindo) {
		this.totAssistindo = totAssistindo;
	}

	@Override
	public String toString() {
		return "Gafanhoto [login=" + login + ", totAssistindo=" + totAssistindo + ", nome=" + nome + ", idade=" + idade
				+ ", sexo=" + sexo + ", experiencia=" + experiencia + "]";
	}

	
	
}
