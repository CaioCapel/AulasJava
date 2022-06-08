//a classe caminhão extende/herda de veiculo
public class Caminhao extends Veiculo {
	
	//foi sobrescrito o método buzinar pois é diferente do padrão definido
	@Override
	public void buzinar() {
		//mostra a mensagem na tela
		System.out.println("FOOOMM");
	}
}
