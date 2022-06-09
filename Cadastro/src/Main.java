import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try (Scanner teclado = new Scanner(System.in)) { //instanciando um scanner
			List<Pessoa> listaPessoas = new ArrayList<Pessoa>();//instanciando uma lista

			for (int x = 0; x < 4; x++) {//cada vez que fizer o processo adiciona mais uma variável
				
				Pessoa pessoa = new Pessoa();//instanciando pessoa 
				pessoa.setEndereco(new Endereco());//instanciando um endereco dentro do setter

				System.out.println("Digite seu nome: ");
				pessoa.setNome(teclado.next());

				System.out.println("Digite sua idade: ");
				pessoa.setIdade(teclado.nextInt());

				System.out.println("Digite 1 para o sexo Masculino e Digite 2 para o sexo feminino");
				int opcao = 0;
				while (opcao != 1 && opcao != 2) {//enquanto for diferente de 1 ou 2 ele executa as acoes
					opcao = teclado.nextInt();
					if (opcao == 1)
						pessoa.setSexo(Sexo.MASCULINO);//escolhe o sexo masculino

					else if (opcao == 2)
						pessoa.setSexo(Sexo.FEMININO);//escolhe o sexo feminino 
					else {//caso nao digite nem 1 ou 2 faca 
						System.out.println("Sexo inválido");
						System.out.println("Digite 1 para o sexo Masculino e Digite 2 para o sexo feminino");
					}
				}

				System.out.println("Digite a rua do seu endereço");
				pessoa.getEndereco().setRua(teclado.next()); //pega o endereco e seta a rua com a instancia teclado

				System.out.println("Digite o numero do seu endereço");
				pessoa.getEndereco().setNumero(teclado.nextInt());//pega o endereco e seta o numero com a instancia teclado

				System.out.println("Digite o bairro do seu endereço");
				pessoa.getEndereco().setBairro(teclado.next());//pega o endereco e seta o bairro com a instancia teclado

				listaPessoas.add(pessoa);//adiciona pessoa a lista
			}

			try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Pessoas.txt"))) {//transcreve o arquivo para txt
				for (Pessoa pessoa2 : listaPessoas)
					escrever.write(pessoa2.toString());// to string para mostrar a lista de pessoas que contem as informacoes delas
			}

			List<Pessoa> ListaPessoas2 = new ArrayList<Pessoa>();//cria uma nova lista

			try (BufferedReader reader = new BufferedReader(new FileReader("Pessoas.txt"))) {//le o arquivo txt
				String line;
				String string = "";

				while ((line = reader.readLine()) != null) {
					string += line + "\n";
				}

			}
			for (Pessoa pessoa2 : ListaPessoas2) {
				System.out.println(pessoa2);
			}

			System.out.println(listaPessoas);
		}
	}
}
