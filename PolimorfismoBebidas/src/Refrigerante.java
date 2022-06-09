//refrigerante extende de bebida
public class Refrigerante extends Bebida {

	public Refrigerante() {
		//puxando método de outra classe
		super("Refrigerante", false);	
	}

	//usando o método preparar e adicionando um código específico dessa classe
	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Colocando gelo no copo");
		System.out.println("Colocando o refrigerante no copo");
	}
}
