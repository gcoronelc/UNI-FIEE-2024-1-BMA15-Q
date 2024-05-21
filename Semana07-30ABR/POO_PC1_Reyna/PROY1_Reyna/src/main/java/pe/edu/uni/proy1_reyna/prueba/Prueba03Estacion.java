/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.proy1_reyna.prueba;

import pe.edu.uni.proy1_reyna.Fecha.Fecha;
import pe.edu.uni.proy1_reyna.service.FechaService;

/**
 *
 * @author PROFESOR
 */
public class Prueba03Estacion {
    public static void main(String[] args) {
        //variables
        Fecha fecha = new Fecha(29, 2, 2024); 
        String estacion;
        
        //proceso
        FechaService service = new FechaService(); 
        estacion = service.estacion(fecha); 
         
        //salida
        System.out.println("La estacion es: " + estacion);
        
    }
}
