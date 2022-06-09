
public class Preparador {
	
	public void prepararBebida(Bebida bebida) {
		
		//método para preparar bebida
		System.out.println("Preparando a Bebida " + bebida.getNome());
		
		bebida.preparar();
		
		//para ver se a bebida é quente ou fria, não será aplicado para todas as bebidas igual o preparar
		if(bebida.isAquecer()) {
				System.out.println("Aquecendo a bebida " + bebida.getNome());
		}
		
		//mensagem que mostra na tela 
		System.out.println("Bebida preparada com sucesso!! \n");
		
	}
}
