
public class Aplicacao {

	public static void main(String[] args) {
		
		//foi instanciado um objeto veiculo, e com esse objeto consigo settar os atributos da classe veiculo 
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Range Rover");
		veiculo.setModelo("Velar");
		veiculo.setAno(2021);
		
		veiculo.imprimir();
		veiculo.buzinar();
		
		//instanciado um novo objeto carro
		Carro carro = new Carro();
		//carro tambem é um veiculo então não tem necessidade de instanciar outro objeto do tipo veiculo pois como ele herda de veiculo seus métodos e atributos
		carro.setMarca("Porsche");
		carro.setModelo("Cayenne");
		carro.setAno(2019);
		carro.setQuatroPortas(true);
		System.out.println();
		carro.imprimir();
		carro.buzinar();
		
		///instanciado um novo objeto caminhão
		Caminhao caminhao = new Caminhao();
		//caminhão tambem é um veiculo então não tem necessidade de instanciar outro objeto do tipo veiculo pois como ele herda de veiculo seus métodos e atributos
		caminhao.setMarca("Scania");
		caminhao.setModelo("Scania R-500");
		caminhao.setAno(2020);
		System.out.println();
		caminhao.imprimir();
		caminhao.buzinar();
		
		//instanciado um novo objeto moto
		Moto moto = new Moto();
		//moto tambem é um veiculo então não tem necessidade de instanciar outro objeto do tipo veiculo pois como ele herda de veiculo seus métodos e atributos
		moto.setMarca("Honda");
		moto.setModelo("Hornet");
		moto.setAno(2013);
		System.out.println();
		moto.imprimir();
		moto.empinar();
;
		
	}

}
