
public class Rota {
	
	//metodo que gera a rota do automovel
	public void ir(Automovel automovel) {
		
		automovel.virarDireita();
		automovel.virarEsquerda();
		automovel.acelerar();
		automovel.virarDireita();
	}

}
