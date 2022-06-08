
public class Contador {

	private static int valor;
	
//	public Contador() {
//		this.valor = 1;
//	}

	//aqui foi definido que a variável possui o valor 1
	static {
		valor = 1;
	}
	
	//foi definida uma variavel estatica que vai sempre somar 1 ao valor
	public static void incrementar() {
		valor ++;
	}
	public static int getValor() {
		return valor;
	}

	//get vai pegar o valor da variável
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
