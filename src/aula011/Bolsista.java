package aula011;

public class Bolsista extends Aluno {

	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println(this.nome + " é bolsista! Pagamento facilitado.");
	}


	

	@Override
	public void pagarMensalidade() {
		System.out.println(this.nome + " é bolsista! Pagamento diferenciado.");
		//super.pagarMensalidade();
	}




	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
		
}
