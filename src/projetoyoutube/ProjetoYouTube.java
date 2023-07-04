package projetoyoutube;

public class ProjetoYouTube {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML5");
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Luis", 36, "Masculino", "lmstive");
		g[1] = new Gafanhoto("Dudinha", 2, "Feminino", "Duda");
		
		
		System.out.println(g[0].toString());
	}

}
