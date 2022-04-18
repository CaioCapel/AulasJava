import java.util.Scanner;
public class Area {

static Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        
       
        double base;
        double altura;
        
      
        System.out.println("Digite o valor da base do triângulo: ");
        base = scn.nextDouble();
        System.out.println("");
        System.out.println("Digite o valor da altura do triângulo: ");
        altura = scn.nextDouble();
        System.out.println("");
        
       
         double area = (base * altura) / 2;
         System.out.println("A área do triângulo é " + area);
    }
}

