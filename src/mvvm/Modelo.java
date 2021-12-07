
package mvvm;

public class Modelo {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    public double sumar(){
        return this.a + this.b;
    }
    public double restar(){
        return this.a - this.b;
    }
    public double dividir(){
        return this.a / this.b;
    }
    public double multiplicar(){
        return this.a * this.b;
    }
}  
