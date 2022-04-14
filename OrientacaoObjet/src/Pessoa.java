
public class Pessoa {
	String nome;
	int numFigurinhas;

	void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
	}

	boolean dar(int numFigurinhas, Pessoa pessoa) {

	   // boolean retorno;

		if(this.numFigurinhas<numFigurinhas) {
			System.out.println("A quatidade de figurinhas não é suficiente para trocar");
			//retorno = false;
			return false;
		}
		else {
			this.numFigurinhas -= numFigurinhas;
			pessoa.receber(numFigurinhas);
			//retorno = true;
			return true;
		}
		//return retorno;
		}
}
