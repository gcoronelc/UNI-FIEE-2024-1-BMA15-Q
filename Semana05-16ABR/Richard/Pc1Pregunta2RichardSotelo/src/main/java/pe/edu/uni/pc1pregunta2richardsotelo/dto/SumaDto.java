
package pe.edu.uni.pc1pregunta2richardsotelo.dto;


public class SumaDto {
    //entrada
    public int x;
    public int n;
    //salida
    public double suma;
    
    //constructor bacio

    public SumaDto() {
    }

    public SumaDto(int x, int n) {
        this.x = x;
        this.n = n;
    }
    
    //getters and setters

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }
    
}
