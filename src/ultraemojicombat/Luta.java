package ultraemojicombat;

import java.util.Random;

public class Luta {
	//Atributos
	
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	// Métodos publicos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() 
			&& (l1 != l2)) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}

	public void lutar() {
		if (this.aprovada) {
			System.out.println("### Desafiado ###");
			this.desafiado.apresentar();
			System.out.println("### Desafiante ###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0 1 2
			System.out.println("=== RESULTADO ===");
			switch(vencedor) {
				
				case 0: 
					System.out.println("A luta empatou!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
				break;
				case 1:
					System.out.println("O " + this.getDesafiado().getNome() + " ganhou a luta!");
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
				break;	
				case 2:	
					System.out.println("O " + this.getDesafiante().getNome() + " ganhou a luta!");
					this.desafiado.perderLuta();
					this.desafiante.ganharLuta();
				break;	
				
			}
			System.out.println("=== ===");
			
		} else {
			System.out.println("A Luta não pode acontecer!");
		}
		
	}
	
	//Métodos especiais
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
		
}



