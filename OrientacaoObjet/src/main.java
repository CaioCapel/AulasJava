
public class main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Caio";
		pessoa1.numFigurinhas = 1;//inicia com uma figurinha
		
		pessoa1.receber(3);
		
		System.out.println(pessoa1.nome);//usa o metodo receber figurinhas
		System.out.println(pessoa1.numFigurinhas);//usa o metodo dar figurinhas
		
       Pessoa pessoa2 = new Pessoa();
    	
    	pessoa2.nome = "Camila";
    	pessoa2.numFigurinhas = 3;
    	
    	System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numFigurinhas);
		
		boolean retorno = pessoa1.dar(4, pessoa2);
		
		if(retorno == true) {
		
		System.out.println("Depois");
		
		//mostra o nome e a quantidade de figurinhas
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFigurinhas);
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numFigurinhas);
		
		
	}
	

	}
}



