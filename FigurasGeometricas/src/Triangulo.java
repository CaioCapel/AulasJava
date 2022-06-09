// essa classe implementa AreaCalculavel porque os metodos dela se aplicam a essa
public class Triangulo implements AreaCalculavel {

	//variaveis
	int base;
	int altura;
	
	//getters e setters
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	@Override
	public void calcularArea() {
		
		System.out.println("O valor é " + base*altura);
		
	}

}
