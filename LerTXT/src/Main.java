import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))){//arquivo txt
			String line;
			String string = "";
			
			while((line = reader.readLine())!= null) {
				string += line + "\n";
			}
			System.out.println(string);
			
		}
	
		String teste = "Mouse: funciona = sim, qtdBotoes = 2, tamanho = pequeno \n";//fazendo um teste para o txt
		
		Mouse mouse = new Mouse (teste);//instanciando mouse
		
		System.out.println(mouse);
		
	}

}
