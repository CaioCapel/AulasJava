
public class Pessoa {
	String nome;
	int numFigurinhas;

	void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;//método que recebe numero de figurinhas
	}

	boolean dar(int numFigurinhas, Pessoa pessoa) { //metodo que da um numero de figurinhas

	   // boolean retorno;

		//caso a quantidade de troca seja menor do que possui, da erro
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
