import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	
		List <Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		Scanner teclado =  new Scanner (System.in);
		Pessoa pessoa = new Pessoa();
		
		Sexo sexo = Sexo.INDEFINIDO;

		
		pessoa.setEndereco(new Endereco());
		
		for(int  x=0;  x <4 ; x++ ) {
		
		System.out.println("Digite seu nome: ");
		pessoa.setNome(teclado.next());
		
		System.out.println("Digite sua idade: ");
		pessoa.setIdade(teclado.nextInt());
		
		System.out.println("Digite a rua do seu endere�o");
		pessoa.getEndereco().setRua(teclado.next());
		
		
		System.out.println("Digite o numero do seu endere�o");
		pessoa.getEndereco().setNumero(teclado.nextInt());
		
		System.out.println("Digite o bairro do seu endere�o");
		pessoa.getEndereco().setBairro(teclado.next());
		
		System.out.println("Digite Masculino para sexo masculino e Feminino para sexo feminino");
		}
	}
}