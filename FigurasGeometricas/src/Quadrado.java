//essa classe implementa AreaCalculavel porque os metodos dela se aplicam a essa
public class Quadrado implements AreaCalculavel{
	//variaveis
	  int lado;
	
	public int getLado() {
		return lado;
	}


	public void setLado(int lado) {
		this.lado = lado;
	}
	
	//calcula a area e mostra na tela
	@Override
	public void calcularArea() {
		
		System.out.println("O valor é " + Math.pow(lado, 2));
		
	}

}
