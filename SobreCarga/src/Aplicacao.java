import java.util.Scanner;
public class Aplicacao {
	//A sobrecarga utiliza o mesmo nome em um método mas possui funções diferentes.

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);//instanciando scanner
		
		Matematica matematica = new Matematica();//instanciando matematica
		
		System.out.println("Somar dois Números");
		
		System.out.println("Digite o primeiro número");
		int x = scanner.nextInt();
		
		System.out.println("Digite o segundo número");
		int y = scanner.nextInt();
		
		
		
		//soma dos numeros e mostrando na tela
		int soma = matematica.somar(x, y);
		System.out.println("O resultado é " + soma + " !!!");
		
		soma = matematica.somar(x, y, 0);
		System.out.println("O resultado é " + soma + " !!!");
		
		double soma2 = matematica.somar(x, y);
		System.out.println("O resultado é " + soma2 + " !!!");

	}

}
