import java.util.Scanner;//importando scanner
public class Area {

static Scanner scn = new Scanner(System.in);//instanciando scanner
    
    public static void main(String[] args)
    {
        
       //variaveis
        double base;
        double altura;
        
      //digitando o valor e mostrando na tela
        System.out.println("Digite o valor da base do triângulo: ");
        base = scn.nextDouble();
        System.out.println("");
        System.out.println("Digite o valor da altura do triângulo: ");
        altura = scn.nextDouble();
        System.out.println("");
        
       //calculando a area e mostrando na tela
         double area = (base * altura) / 2;
         System.out.println("A área do triângulo é " + area);
    }
}

