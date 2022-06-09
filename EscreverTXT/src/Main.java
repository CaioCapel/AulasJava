import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		
//		String s = "texto para ser gravado no arquivo";
//		
//		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){
//			escrever.write(s);
//		}
		
		List <Mouse> lista =  new ArrayList <Mouse> ();//criando uma lista
		
		Mouse mouse1 = new Mouse (true, 2, "Pequeno");//instanciando objeto mouse e dando parâmetros
		Mouse mouse2 = new Mouse (true, 4, "Medio");
		Mouse mouse3 = new Mouse (true, 6, "Grande");
		
		lista.add(mouse1);//adicionando mouse a lista 
		lista.add(mouse2);
		lista.add(mouse3);
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){//arquivo txt
			for(Mouse mouse : lista)
			escrever.write(mouse.toString());
		}
		
		

	} 

}
