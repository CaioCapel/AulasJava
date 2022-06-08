
public class Aplicacao {

	public static void main(String[] args) {
		
		//foi criada uma variável do tipo inteiro
		int resultado = matematica.somar(2, 3);
		//o método da classe matemática é estático e por isso não teve a necessidade de instanciar um objeto
		
		System.out.println(resultado);
		
		//a variável chamou o método subtrair da classe matemática
		resultado = matematica.subtrair(10, 4);
		System.out.println(resultado);
	
		//a variável chamou o método somar
		int resultado = Matematica.somar(2, 4);
		//aqui foi mostrado o resultado
		System.out.println(resultado);
		resultado = Matematica.subtrair(10, 11);
		System.out.println(resultado);
	
		//3 objetos foram instanciados
	Contador contador1 = new Contador();
	Contador contador2 = new Contador();
	Contador contador3 = new Contador();
		//o objeto contador1 chamou o método incrementar
	contador1.incrementar();
		
	//foi chamado 3 vezes o método getValor por conta dos objetos criados
	System.out.println(contador1.getValor());
	System.out.println(contador2.getValor());
	System.out.println(contador3.getValor());
		
		//o método incrementar foi chamado direto sem a necessidade de instanciar um  objeto
		Contador.incrementar();
		Contador.incrementar();
 		Contador.incrementar();
	    System.out.println(Contador.getValor());
	//foi printado e mostrado na tela
	System.out.println(Constantes.MEDIA_DA_PROVA);
		
	}

}
