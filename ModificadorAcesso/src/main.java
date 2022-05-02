
public class main {

	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria();

//		conta1.ativo = true;
//		conta1.numConta = 1234;
//		conta1.saldo = 100.50;
//		
//		
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println(conta1.saldo);
//

//		conta1.receber(100.8);
//		conta1.dar(50);
//		System.out.println(conta1.saldo());
//		ContaBancaria conta2 = new ContaBancaria();
//		System.out.println(conta2.saldo());
//		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Caio");
		cliente1.setCpf(123456);
		cliente1.setNumConta(8745);
		
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getNumConta());
		
		System.out.println(cliente1);
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("Caio");
		cliente2.setCpf(789456);
		cliente2.setNumConta(4851);
		
//		cliente1 = cliente2;
		
		System.out.println(cliente2);
		
		if(cliente1.getNome() == cliente2.getNome()) {
			System.out.println("Os nomes são iguais");
		}else {
			System.out.println("Os nomes são diferentes");
		}
		
		if(cliente1 == cliente2) {
			System.out.println("os objetos são iguais");
		}else {
			System.out.println("os objetos são diferentes");
		}
		
		if(cliente1.equals(cliente2)) {
			System.out.println("os atributos dos objetos são iguais");
		}else {
			System.out.println("os atributos dos objetos são diferentes");
		}
		
	}

}
