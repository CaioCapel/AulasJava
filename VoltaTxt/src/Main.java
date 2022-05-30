import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
List <Mouse> lista =  new ArrayList <Mouse> ();
		
		Mouse mouse1 = new Mouse("sim", "2", "pequeno");
		lista.add(mouse1);
		
		Mouse mouse2 = new Mouse("sim", "4", "medio");
		lista.add(mouse2);
		
		Mouse mouse3 = new Mouse("sim", "6", "grande");
		lista.add(mouse3);
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){
			for(Mouse mouse : lista)
			escrever.write(mouse.toString());
		}
		
		List <Mouse> lista1 =  new ArrayList <Mouse> ();
		
		try(BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))){
			String line;
			String string = "";
			
			while((line = reader.readLine())!= null) {
				string += line + "\n";
			}
			System.out.println(string);
			
		}
		
	}

}
