
public class main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Caio";
		pessoa1.numFigurinhas = 1;
		
		pessoa1.receber(3);
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFigurinhas);
		
       Pessoa pessoa2 = new Pessoa();
    	
    	pessoa2.nome = "Camila";
    	pessoa2.numFigurinhas = 3;
    	
    	System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numFigurinhas);
		
		pessoa1.dar(5, pessoa2);
		
		System.out.println("Depois");
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFigurinhas);
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numFigurinhas);
		
		
	}
	

	}



