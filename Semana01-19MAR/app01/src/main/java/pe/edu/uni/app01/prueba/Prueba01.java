package pe.edu.uni.app01.prueba;

import pe.edu.uni.app01.service.NotaService;

public class Prueba01 {

    public static void main(String[] args) {
        // Datos
        int nota1 = 14;
        int nota2 = 15;
        int nota3 = 17;
        // Proceso
        NotaService service = new NotaService();
        int pr = service.promedio(nota1, nota2, nota3);
        // Reporte
        System.out.println("Promedio esperado: 15");
        System.out.println("Promedio obtenido: " + pr);
    }

    
}
