//essa classe implementa AreaCalculavel porque os metodos dela se aplicam a essa
public class Circunferencia implements AreaCalculavel {
	//variavel
	int raio;
	
	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	//calcular area da circunferencia
	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		
		System.out.println("O valor é " + Math.PI*Math.pow(raio, 2));
		
		
		
		
		
	}

}
