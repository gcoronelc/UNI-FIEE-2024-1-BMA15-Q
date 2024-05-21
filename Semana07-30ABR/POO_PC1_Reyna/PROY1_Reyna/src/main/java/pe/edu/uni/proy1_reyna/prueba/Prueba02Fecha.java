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
public class Prueba02Fecha {
    public static void main(String[] args) {
        //variables
        Fecha fecha = new Fecha(32, 4, 2005); 
        boolean valido; 
        
        //proceso
        FechaService service = new FechaService(); 
        valido = service.verificarFecha(fecha); 
        
        //salida
        if(valido){
            System.out.println("La fecha es valida");
        }
        else{
            System.out.println("La fecha es invalida");
        }
        
    }
}
