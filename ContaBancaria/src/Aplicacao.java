public class Aplicacao {

	public static void main(String[] args) {
		//instanciando objetos
		ContaBancaria ContaCorrente = new ContaCorrente();
		ContaBancaria ContaInvestimento = new ContaInvestimento();
		
		//mostrando o saldo
		System.out.printf("O saldo na conta corrente � equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento � equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
			
		//mostrando o dinheiro que esta entrando na conta e somando com o saldo
		ContaCorrente.depositar(200);
		ContaInvestimento.depositar(200);
		System.out.printf("O saldo na conta corrente � equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento � equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
		
		//mostrando quanto dinheiro esta saindo da conta 
		ContaCorrente.sacar(100);
		ContaInvestimento.sacar(100);
		System.out.printf("O saldo na conta corrente � equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento � equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
		
		//transferindo dinheiro 
		ContaInvestimento.trasnferir(200, ContaCorrente);
		System.out.printf("O saldo na conta corrente � equivalente a: R$%.2f%n", ContaCorrente.CalcularSaldo());
		System.out.printf("O saldo na conta investimento � equivalente a: R$%.2f%n%n", ContaInvestimento.CalcularSaldo());
		
		
		
	}

}
