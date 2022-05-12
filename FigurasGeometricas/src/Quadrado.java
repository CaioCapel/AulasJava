
public class Quadrado implements AreaCalculavel{

	  int lado;
	
	public int getLado() {
		return lado;
	}


	public void setLado(int lado) {
		this.lado = lado;
	}
	
	
	@Override
	public void calcularArea() {
		
		System.out.println("O valor é " + Math.pow(lado, 2));
		
	}

}
