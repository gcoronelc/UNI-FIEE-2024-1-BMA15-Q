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
public class Prueba04Trimestre {
    public static void main(String[] args) {
        //variables
        Fecha fecha = new Fecha(24, 8, 2015); 
        int trimestre;
        
        //proceso
        FechaService service = new FechaService(); 
        trimestre = service.trimestre(fecha); 
         
        //salida
        System.out.println("El trimestre es: " + trimestre);
    }
}
