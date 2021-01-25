
package projeto.geomed;
//import
import java.util.Scanner;


public class GeoTeste{

    public static void main(String[] args) {
        //head
        
        Scanner scan=new Scanner(System.in);
        boolean loop=true;
        int e;
        
        
        //body
        
        while(loop){
            System.out.println("*************************\n Escolha qual figura abaixo deseja calcular:\n(1)Quadrado\n(2)Triangulo Equilatero\n(3)Encerrar\n");
            e=scan.nextInt();
            
            switch(e){
                case 1:
                    Geo1Quadrado quadrado=new Geo1Quadrado(0,0,0);
                    quadrado.receberDados();
                    quadrado.calcArea();
                    quadrado.calcPerimetro(0);
                    quadrado.toString();
                    System.out.println(quadrado.toString());
                    
                    System.out.println("\n\n\n");
                 break;
                case 2:
                    Geo1TriEqui triangulo=new Geo1TriEqui(0,0,0);
                    triangulo.receberDados();
                    triangulo.calcArea();
                    triangulo.calcPerimetro(0);
                    triangulo.toString();
                    System.out.println(triangulo.toString());
                    System.out.println("\n\n\n");
                 break;
                case 3:
                    System.exit(0);
                 break;
                default:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println(" OPÇÃO INVALIDA , TENTE NOVAMENTE \n\n\n\n\n\n");
            }
            
            
        }
        
    }
    
}
