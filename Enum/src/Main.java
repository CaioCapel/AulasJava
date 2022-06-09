
public class Main {
	//criacao da constante 
	public static final double PI = 3.14;
	
	private enum Sexo{
		MASCULINO, FEMININO;
	}

	public static void main(String[] args) {
	//cada constante que criar fora do enum tem que guardar em algum lugar 
		double pi = Main.PI;

		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;

		//pega o numero da semana e o dia
		int num = DiaDaSemana.SEGUNDA.getNum();

		//variavel num que mostra o numero do dia da semana 
		System.out.println(num);

		//guardando o nome "TERCA" na variavel s 
		String s = "TERCA";
		
		hoje =DiaDaSemana.valueOf(s);
		
		//mostra o dia de hoje, no caso terca
		System.out.println(hoje.getNum());
		
		//sexo do tipo feminino e masculino 
		Sexo sexo = Sexo.FEMININO;
		sexo = Sexo.MASCULINO; 

	}

}
