//arquivo que contem alguns conceitos de java 
import java.util.Scanner;//importando scanner

public class main {

	public static void main(String[] args) {
		//variaveis
//		 int x = 100;
//		 double y = 200.3;
//		 int a = 0;
//		 double b = 0;
//		 short z = (short) 100000;
//		 System.out.println(z);
//
//		 a = (int)y;
//		 b = x;
//
//		 System.out.println(a);
//		 System.out.println(b);

//		int idadePessoa = 18;
//		if (idadePessoa < 18) {
//			System.out.println("Você não pode beber");
//		} else if (idadePessoa < 60) {
//			System.out.println("Bora Tomar uma");
//		} else {
//			System.out.println("Volta para o asilo");
//		}
//
//		System.out.println("Você tem " + idadePessoa + " anos");

//		int num = 6;
//
//		switch (num) {//switch serve para realizar um teste condicional
//		case 1:
//			System.out.println("Domingo");
//			break;
//		case 2:
//			System.out.println("Segunda-Feira");
//			break;
//		case 3:
//			System.out.println("Terça-Feira");
//			break;
//		case 4:
//			System.out.println("Quarta-Feira");
//			break;
//		case 5:
//			System.out.println("Quinta-Feira");
//			break;
//		case 6:
//			System.out.println("Sexta-Feira");
//			break;
//		case 7:
//			System.out.println("Sábado");
//			break;
//		default:
//			System.out.println("Esse número não representa um dia da semana");
//		}
		//switchs podem conter variavel do tipo char
		
//		char caractere = 'c';
//		
//		switch(caractere) {
//		case 'a':
//			System.out.println("seu caractere é a");
//			break;
//		case 'b':
//			System.out.println("seu caractere é b");
//			break;
//			default:
//				System.out.println("valor inválido");
//				
//		}
//		//string farol valida os valores do switch
//		String farol = "vermelho";
//		
//		switch(farol) {
//		case "vermelho":
//			System.out.println("Pare !!");
//			break;
//		case "amarelo":
//			System.out.println("Atençao !!");
//			break;
//		case "verde":
//			System.out.println("Siga !!");
//			break;
//			default:
//				System.out.println("Valor inválido");
//		}
		
//		int x=0;
//		while(x<10) {
//			System.out.println(x);
//			x=x+1;
//			
//		}
//		
//		x=0;
//		do {
//			System.out.println(x);
//			x=x+1;
//			
//		}while(x<10);
////				
//	int tabuada = 2;
//	for(int x=0; x<11; x++) {
//		System.out.println(tabuada + " x " + x + " = " + x * tabuada);
//	
//	}
		
//		int valorUsuario;
//		int multiplicador = 0;
//		int total = 0;
//		
		//usando scanner
//		Scanner ler = new Scanner(System.in);
//		System.out.println("Informe um número: ");
//		valorUsuario = ler.nextInt();
//		
//		for (int x = 0; x < 10; x++) {
//			total = valorUsuario * ++multiplicador;
//			System.out.println(valorUsuario + " x " + multiplicador + " = " + total);
//		}
//	
//	
//	}
	
//
//		int x1 = 3;
//		int y1 = 5;
//		int z1 = 7;
//		
//		System.out.println(x1);
//		System.out.println(y1);
//		System.out.println(z1);
//		System.out.println();
		
//	double x[] = { 3, 5, 3, 5};
//	
//	for (int aux = 0; aux < x.length; aux++) {
//		System.out.println("Valor do indice " + aux + " = " + x[aux]);
//	}
//	String nome[] = {"Fulano", "Ciclano", "Beltrano" };
//	
//	for (int aux1 = 0; aux1 < nome.length; aux1++) {
//		System.out.println(nome[aux1]);
//		if(nome[aux1] == "Ciclano") {
//			System.out.println("O indice de Ciclano é = " + aux1);
//		}
//	}
//	
//	
//	int[] arrayInt = new int[5];
//	String[] ArrayString = new String[4];
//	double[] ArrayDouble = new double[3];
//	
//	arrayInt[3] = 4;
//	
//	int[] numero = new int[6];
//	Scanner teclado = new Scanner(System.in);
//	
//	for(int aux2 = 0; aux2 < numero.length; aux2++) {
//		System.out.println("Digite um número qualquer");
//		numero[aux2] = teclado.nextInt();
//	}
//	
//	for(int aux2 = 0; aux2 < numero.length; aux2++) {
//		System.out.println("Indice " + aux2 + " = " + numero[aux2]);
//	}
		
		int[][] arrayBidirecional = new int[4][3]; //Cria uma matriz com 4 linhas e 3 colunas

		arrayBidirecional[0][0] = 8; //Coloca o valor 8 na linha 0 coluna 0

		arrayBidirecional[2][1] = 7;

		for (int linha = 0; linha < arrayBidirecional.length; linha++) {
			for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) {
				System.out.print("Indice [" + linha + "][" + coluna + "] = " + arrayBidirecional[linha][coluna] + " "); //Mostra na tela todas as linhas e colunas da matriz.
			}
			System.out.println();
	
		}
	}
}

