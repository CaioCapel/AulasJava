import java.util.Scanner;
public class main {

	public static void main(String[] args) {

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
//			System.out.println("Voc� n�o pode beber");
//		} else if (idadePessoa < 60) {
//			System.out.println("Bora Tomar uma");
//		} else {
//			System.out.println("Volta para o asilo");
//		}
//
//		System.out.println("Voc� tem " + idadePessoa + " anos");

//		int num = 6;
//
//		switch (num) {
//		case 1:
//			System.out.println("Domingo");
//			break;
//		case 2:
//			System.out.println("Segunda-Feira");
//			break;
//		case 3:
//			System.out.println("Ter�a-Feira");
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
//			System.out.println("S�bado");
//			break;
//		default:
//			System.out.println("Esse n�mero n�o representa um dia da semana");
//		}

		
//		char caractere = 'c';
//		
//		switch(caractere) {
//		case 'a':
//			System.out.println("seu caractere � a");
//			break;
//		case 'b':
//			System.out.println("seu caractere � b");
//			break;
//			default:
//				System.out.println("valor inv�lido");
//				
//		}
//		
//		String farol = "vermelho";
//		
//		switch(farol) {
//		case "vermelho":
//			System.out.println("Pare !!");
//			break;
//		case "amarelo":
//			System.out.println("Aten�ao !!");
//			break;
//		case "verde":
//			System.out.println("Siga !!");
//			break;
//			default:
//				System.out.println("Valor inv�lido");
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
		
		int valorUsuario;
		int multiplicador = 0;
		int total = 0;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		valorUsuario = ler.nextInt();
		
		for (int x = 0; x < 10; x++) {
			total = valorUsuario * ++multiplicador;
			System.out.println(valorUsuario + " x " + multiplicador + " = " + total);
		}
	
	
	}

}