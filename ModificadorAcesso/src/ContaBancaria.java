
public class ContaBancaria {

	//atributos
	private int numConta;
	private boolean ativo;
	private double saldo;

//	public ContaBancaria() {
//		ativo = true;
//		saldo = 1.0;
//	}

	//construtor que recebe o saldo e ve se a conta está ativa 
	public ContaBancaria(boolean ativo, double saldo) {
		this.ativo = ativo;
		this.saldo = saldo;
	}
	
	//mostra o valor recebido e soma com o saldo que já tinha
	public void receber(double valor) {
		saldo += valor;

	}

	public double saldo() {
		return saldo;
	}
	
	//mostra o valor que esta saindo da conta
	public void dar(double valor) {
		if (saldo >= valor)
			saldo -= valor;
	}
}
