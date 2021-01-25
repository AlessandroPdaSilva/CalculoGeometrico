
package projeto.geomed;
//import


public class Geo1TriEqui extends Geo1Figuras {
    //head
    private double altura;
    
    
        //construtor
        public Geo1TriEqui(double lado,double perimetro,double altura){
            super(lado,perimetro);
            this.altura=altura;
            
        }
        
        
        
        
        
        
        
        
    //body triangulo**************************
    @Override
    public void receberDados() {
        super.receberDados();
        
        System.out.println("digite a altura ");
        altura=scan.nextDouble();
        
    }
      
      
    @Override
    public double calcArea(){
        
        return (super.getLado()*altura)/2;
    }
    @Override
    
    public double calcPerimetro(float perimetro) {
        
        return 4*super.getLado();
    }
    
    public void mostrar() {
        System.out.println("resultado :");
        
    }
    
    
    
    //get e set
    
    public double getAltura() {
        return altura;
    }

    
    public void setDiagonal(double Diagonal) {
        this.altura = altura;
    }
    
    
    
    
    
        //toString
    
    public String toString(){
        return "RESULTADO AREA : "+this.calcArea()+"\n RESULTADO PERIMETRO: "+this.calcPerimetro(0);
    }

    
    
}
