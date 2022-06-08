
public class Aplicacao {

	public static void main(String[] args) {
		
		//instanciando a classe preparador
		Preparador preparador = new Preparador();
		
		//instanciando o método leiteQuente
		LeiteQuente leiteQuente = new LeiteQuente();
		//chamando o método prepararBebida e passando os parâmetros de LeiteQuente
		preparador.prepararBebida(leiteQuente);
		
		//instanciando o método refrigerante
		Refrigerante refrigerante = new Refrigerante();
		//chamando o método prepararBebida e passando os parâmetros de Refrigerante
		preparador.prepararBebida(refrigerante);
		
	}

}
