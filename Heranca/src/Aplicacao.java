
public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Range Rover");
		veiculo.setModelo("Velar");
		veiculo.setAno(2021);
		
		veiculo.imprimir();
		veiculo.buzinar();
		
		Carro carro = new Carro();
		carro.setMarca("Porsche");
		carro.setModelo("Cayenne");
		carro.setAno(2019);
		carro.setQuatroPortas(true);
		System.out.println();
		carro.imprimir();
		carro.buzinar();
		
		Caminhao caminhao = new Caminhao();
		caminhao.setMarca("Scania");
		caminhao.setModelo("Scania R-500");
		caminhao.setAno(2020);
		System.out.println();
		caminhao.imprimir();
		caminhao.buzinar();
		
		Moto moto = new Moto();
		moto.setMarca("Honda");
		moto.setModelo("Hornet");
		moto.setAno(2013);
		System.out.println();
		moto.imprimir();
		moto.empinar();
;
		
	}

}
