/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.proy1_reyna.Fecha;

/**
 *
 * @author PROFESOR
 */
public class Fecha {
    //variables
    private int dia; 
    private int mes; 
    private int año; 
    private boolean fecha; 
    private int trimestre; 
    private String estación; 
    
    //getters and setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isFecha() {
        return fecha;
    }

    public void setFecha(boolean fecha) {
        this.fecha = fecha;
    }

    public int getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(int trimestre) {
        this.trimestre = trimestre;
    }

    public String getEstación() {
        return estación;
    }

    public void setEstación(String estación) {
        this.estación = estación;
    }
    
    //constructores

    public Fecha() {
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
}
