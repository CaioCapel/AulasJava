
public class Lampada {

private boolean ligado;
	
	public Lampada() {
		ligado = true;
		System.out.println("Interruptor Ligado");
	}
	//metodo para mudar o estado da lampada
	public void Ligar() {
		
		ligado = true;
		if(ligado == true) {
			System.out.println("Lampada acessa!");
		}
	}
	
	//metodo para desligar a lampada caso esteja ligada
	public void Desligar () {
		ligado = false;
		System.out.println("Interruptor Desligado");
		if(ligado == false) {
			System.out.println("Lampada apagada!");
		}
	}

}
	
		

