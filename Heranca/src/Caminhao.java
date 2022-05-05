
public class Caminhao extends Veiculo {

	private boolean carroceria;
	
	
	@Override
	public void buzinar() {
		System.out.println("FOOOMM");
	}


	public boolean isCarroceria() {
		return carroceria;
	}


	public void setCarroceria(boolean carroceria) {
		this.carroceria = carroceria;
	}
	
	
	
	
	

}
