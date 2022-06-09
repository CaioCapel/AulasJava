//LeiteQuente se extende de bebida
public class LeiteQuente extends Bebida{

	public LeiteQuente() {
		//super indica que esta sendo puxado método de outra classe
		super("Leite Quente", true);
		
	}

	//usando o método preparar e adicionando um código específico dessa classe
	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Colocando o leite no copo");
	}
	
	

}
