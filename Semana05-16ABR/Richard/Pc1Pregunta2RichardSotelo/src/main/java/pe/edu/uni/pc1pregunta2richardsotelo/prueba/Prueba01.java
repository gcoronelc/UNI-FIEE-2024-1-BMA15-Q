package pe.edu.uni.pc1pregunta2richardsotelo.prueba;

import pe.edu.uni.pc1pregunta2richardsotelo.dto.SumaDto;
import pe.edu.uni.pc1pregunta2richardsotelo.service.SumaService;

public class Prueba01 {
    public static void main(String[] args) {
        //variables
        SumaDto dto = new SumaDto();
        dto.setX(2);
        dto.setN(2);
        //proceso
        SumaService service=new SumaService();
        dto = service.sumatoria(dto);
        //retorno
        System.out.println("la sumatoria esperada es: 0.86666667");
        System.out.println("La sumatoria total es: "+dto.getSuma());;
        
        
    }
}
