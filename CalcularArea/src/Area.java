import java.util.Scanner;
public class Area {

static Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        
       
        double base;
        double altura;
        
      
        System.out.println("Digite o valor da base do tri�ngulo: ");
        base = scn.nextDouble();
        System.out.println("");
        System.out.println("Digite o valor da altura do tri�ngulo: ");
        altura = scn.nextDouble();
        System.out.println("");
        
       
         double area = (base * altura) / 2;
         System.out.println("A �rea do tri�ngulo � " + area);
    }
}

