
public class Lampada {

private boolean ligado;
	
	public Lampada() {
		ligado = true;
		System.out.println("Interruptor Ligado");
	}

	public void Ligar() {
		
		ligado = true;
		if(ligado == true) {
			System.out.println("Lampada acessa!");
		}
	}
	
	public void Desligar () {
		ligado = false;
		System.out.println("Interruptor Desligado");
		if(ligado == false) {
			System.out.println("Lampada apagada!");
		}
	}

}
	
		

