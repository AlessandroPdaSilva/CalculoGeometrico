
package projeto.geomed;
//import


public class Geo1Quadrado extends Geo1Figuras {
    //head
    private double diagonal;
    
    
        //construtor
        public Geo1Quadrado(double lado, double perimetro, double diagonal){
            super(lado,perimetro);
            this.diagonal=diagonal;
            
        }


    
        
        
        
        
    //body quadrado**************************
    @Override
    public void receberDados() {
        super.receberDados();
    }
    
      @Override
    public double calcArea() {
        return super.getLado()*super.getLado();
    }
      

    @Override
    public double calcPerimetro(float perimetro) {
        double resultado;
        return resultado=4*super.getLado();
    }

    
    
    public double diagonal(){
        return diagonal=super.getLado()*Math.sqrt(2);
    }
    
    
    
   
    
    
    
    
    
    //get e set
    
    public double getDiagonal() {
        return diagonal;
    }

    
    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
    
    
    
    
    
        //toString
    
    public String toString(){
        return "RESULTADO AREA : "+this.calcArea()+"\n RESULTADO PERIMETRO: "+this.calcPerimetro(0);
        
    }

    
    
}
