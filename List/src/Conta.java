
public class Conta {
	
	//atributos da conta
	String nome;
	double valor;
	
	public Conta(String nome, double valor) {
	
		this.nome = nome;
		this.valor = valor;
	}

	//override para garantir que quando aparecer na tela não apareça o endereço da conta
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", valor=" + valor + "]";
	}

}
