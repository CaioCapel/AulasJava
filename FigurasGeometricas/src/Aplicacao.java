
public class Aplicacao {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		 quadrado.setLado(10);
		 
		 quadrado.calcularArea();
		 
		 Triangulo triangulo = new Triangulo();
		 triangulo.setAltura(15);
		 triangulo.setBase(15);
		 
		 triangulo.calcularArea();
		 
		 Circunferencia circunferencia = new Circunferencia();
		 circunferencia.setRaio(13);
		 
		 circunferencia.calcularArea();
		 
		 
	}

}
