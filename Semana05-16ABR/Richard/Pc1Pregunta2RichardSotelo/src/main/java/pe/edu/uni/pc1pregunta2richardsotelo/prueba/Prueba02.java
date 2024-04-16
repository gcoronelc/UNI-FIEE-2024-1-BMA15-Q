/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.pc1pregunta2richardsotelo.prueba;

import pe.edu.uni.pc1pregunta2richardsotelo.dto.SumaDto;
import pe.edu.uni.pc1pregunta2richardsotelo.service.SumaService;

/**
 *
 * @author PROFESOR
 */
public class Prueba02 {
    public static void main(String[] args) {
        //variables
        SumaDto dto = new SumaDto();
        dto.setX(1);
        dto.setN(4);
        //proceso
        SumaService service=new SumaService();
        dto = service.sumatoria(dto);
        //retorno
        System.out.println("la sumatoria esperada es: 0.8349206349");
        System.out.println("La sumatoria total es: "+dto.getSuma());;
        
        
    }
}
