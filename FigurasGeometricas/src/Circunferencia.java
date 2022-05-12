
public class Circunferencia implements AreaCalculavel {

	int raio;
	
	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		
		System.out.println("O valor é " + Math.PI*Math.pow(raio, 2));
		
		
		
		
		
	}

}
