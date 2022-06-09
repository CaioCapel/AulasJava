
public class Main {

	public static void main(String[] args) {
		
//		Animal animal= new Cachorro();
//	    animal.Falar();
//		
//		
//		Gato cat = new Gato();
//		cat.Falar();

		//instanciando objetos
		Gato gato=new Gato();
		Cachorro cachorro = new Cachorro();
		falar(gato);//usa o falar de gato
		falar(cachorro);//usa o falar de cachorro
	}
	public static void falar(Animal a) {
		a.Falar();//usa falar de animal 
		
		if(a instanceof Cachorro) {//com a variavel a alem de falar ele irá morder tambem
			Cachorro c = (Cachorro) a;
			c.Morder();
		}	
	}

}
