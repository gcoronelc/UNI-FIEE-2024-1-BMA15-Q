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
public class Prueba01 {
    public static void main(String[] args) {
        //variables
        double serie;
        
        //proceso
        SerieService service = new SerieService(); 
        serie = service.calcularSerie(0.5, 2);         
        
        //salida
        System.out.println("Valor de la serie: " + serie);
    }
}
