
public class Aplicacao {

	public static void main(String[] args) {
	
			//isso deu erro pois não podemos instanciar um objeto abstrato
			Item item = new Cogumelo();
			item.pegar();
			
			item = new Moeda();
			item.pegar();
			
			item = new Diamante();
			item.pegar();
	

	}

}
