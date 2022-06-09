
public class Aplicacao {

	public static void main(String[] args) {
		//instanciando rota
		Rota rota = new Rota();
		//isntanciando ferrari
		Ferrari ferrari = new Ferrari();
		//instanciando fusca
		Fusca fusca = new Fusca();
		//gerando rota para os automoveis
		rota.ir(ferrari);
		System.out.println();
		rota.ir(fusca);
		System.out.println();
		//colocando tipo automovel permite o polimorfismo
		Automovel automovel = new Ferrari();
		rota.ir(automovel);
		System.out.println();
		automovel = new Fusca();
		rota.ir(automovel);
		System.out.println();
		//instanciando vendedor 
		Vendedor vendedor = new Vendedor();
		//instanciando apartamento
		Apartamento apartamento = new Apartamento();
		
		//mostrando preco dos itens 
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(ferrari); 
		
	}

}
