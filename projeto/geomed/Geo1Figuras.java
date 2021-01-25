
package projeto.geomed;
//import
import java.util.Scanner;



public abstract class  Geo1Figuras {
    //head
    private double lado,perimetro;;
    Scanner scan=new Scanner(System.in);   
    
    
    
    
    
        //construtor
    
    public Geo1Figuras(double lado,double perimetro){
        this.lado=lado;
        this.perimetro=perimetro;
    }
    
    
    
    
    

    //body figuras************************
    public void receberDados(){
        System.out.println(" Digite o lado : ");
        lado=scan.nextDouble();
    }
     public abstract double calcArea();
     
    public double figuras(){
        return getLado();
    }
    public abstract double calcPerimetro(float perimetro);
    
    
    
    
    
    
    
    //get e set
    
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    

    
    
    
    
    
    
    
    
        //toString
    //nao soube imprimir por aqui
    @Override
    public String toString(){
        return "";
    }

    
    
}
