package pe.edu.uni.app01.prueba;

import pe.edu.uni.app01.service.NotaService;

public class Prueba02 {

    public static void main(String[] args) {
        // Datos
        int pr = 11;
        // Proceso
        NotaService service = new NotaService();
        String cond = service.condicion(pr);
        // Reporte
        System.out.println("Condicion esperada: En proceso");
        System.out.println("Condicion obtenid: " + cond);
    }

}
