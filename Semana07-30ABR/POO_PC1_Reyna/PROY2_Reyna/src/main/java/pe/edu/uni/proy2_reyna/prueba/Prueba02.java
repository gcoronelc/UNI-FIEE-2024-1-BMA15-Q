/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.proy2_reyna.prueba;

import pe.edu.uni.proy2_reyna.services.SerieService;

/**
 *
 * @author PROFESOR
 */
public class Prueba02 {
    public static void main(String[] args) {
        //variables
        double potencia;
        
        //proceso
        SerieService service = new SerieService(); 
        potencia = service.potencia(2.3, 9);         
        
        //salida
        System.out.println("Valor de potencia: " + potencia);
    }
}
