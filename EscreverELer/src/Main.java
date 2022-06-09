import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner teclado = new Scanner(System.in);//instanciando scanner
		
		System.out.println("Arquivo pro TXT!");
		String txt= (teclado.nextLine());
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("txt escrito por programa.txt"))){//escrevendo arquivo pto txt
			escrever.write(txt);
		}
		
		try(BufferedReader reader = new BufferedReader(new FileReader("txt escrito por programa.txt"))){//lendo arquivo txt
			String line;
			String string = "";
			
			while((line = reader.readLine())!= null) {
				string += line + "\n";
			}
			System.out.println(string);
			
			
		}
	}

	}


