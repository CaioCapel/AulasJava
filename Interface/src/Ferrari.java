
public class Ferrari implements Automovel, ItemCaro{

	
	//override de todos os metodos
	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou a esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou a direita");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou");
		
	}

	@Override
	public double getPreco() {
		return 630000;
	}
	
	

}
