package projetocv;

public class Poo {

	public static void main(String[] args) {
		Caneta c1 = new Caneta("Faber Castell", "VERDE", 0.4f);
		c1.status();
		System.out.println("---------------");
		Caneta c2 = new Caneta("Acrilex", "Preto", 0.7f);
		c2.status();
		
	//	c1.setModelo("Bic");
	//	c1.modelo = "Bic";
		
	//	c1.setPonta(0.5f);
	//	c1.ponta = 0.5f;
	//	c1.status();
	
	//	System.out.println("Eu tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
		
	}

}
