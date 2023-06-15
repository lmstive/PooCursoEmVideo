package projetopessoas;

public class ProjetoPessoas {

	public static void main(String[] args) {
		// Programa principal 

		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Cláudio");
		p4.setNome("Fabiana");
		
		p1.setSexo("M");
		p2.setSexo("F");
		p3.setSexo("M");
		p4.setSexo("M");
		
		p1.setIdade(20);
		p2.setIdade(18);
		p3.setIdade(38);
		p4.setIdade(21);
		
		p2.setCurso("Informatica");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		
		p3.receberAum(550.20f);
		p4.mudarTrabalho();
		p2.cancelarMatr();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		
	
	}

}
