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

		try (Scanner teclado = new Scanner(System.in)) {
			List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

			for (int x = 0; x < 4; x++) {
				Pessoa pessoa = new Pessoa();
				pessoa.setEndereco(new Endereco());

				System.out.println("Digite seu nome: ");
				pessoa.setNome(teclado.next());

				System.out.println("Digite sua idade: ");
				pessoa.setIdade(teclado.nextInt());

				System.out.println("Digite 1 para o sexo Masculino e Digite 2 para o sexo feminino");
				int opcao = 0;
				while (opcao != 1 && opcao != 2) {
					opcao = teclado.nextInt();
					if (opcao == 1)
						pessoa.setSexo(Sexo.MASCULINO);

					else if (opcao == 2)
						pessoa.setSexo(Sexo.FEMININO);
					else {
						System.out.println("Sexo inválido");
						System.out.println("Digite 1 para o sexo Masculino e Digite 2 para o sexo feminino");
					}
				}

				System.out.println("Digite a rua do seu endereço");
				pessoa.getEndereco().setRua(teclado.next());

				System.out.println("Digite o numero do seu endereço");
				pessoa.getEndereco().setNumero(teclado.nextInt());

				System.out.println("Digite o bairro do seu endereço");
				pessoa.getEndereco().setBairro(teclado.next());

				listaPessoas.add(pessoa);
			}

			try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Pessoas.txt"))) {
				for (Pessoa pessoa2 : listaPessoas)
					escrever.write(pessoa2.toString());
			}

			List<Pessoa> ListaPessoas2 = new ArrayList<Pessoa>();

			try (BufferedReader reader = new BufferedReader(new FileReader("Pessoas.txt"))) {
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