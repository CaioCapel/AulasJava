public class ContaInvestimento extends ContaBancaria{
	
	
	private double saldo = 0;
	

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	//overrides
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo +=valor;
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo -=valor;
	}


	@Override
	public double CalcularSaldo() {
		// TODO Auto-generated method stub
		return saldo+(saldo*0.05);
	}

	
}
