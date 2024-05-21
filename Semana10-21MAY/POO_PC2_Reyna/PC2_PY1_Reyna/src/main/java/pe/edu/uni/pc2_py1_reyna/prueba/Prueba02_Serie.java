package pe.edu.uni.pc2_py1_reyna.prueba;

import pe.edu.uni.pc2_py1_reyna.service.MatematicaService;

public class Prueba02_Serie {
    public static void main(String[] args) {
        //variables
        int n = 3; 
        double serie = 0; 
        //proceso
        MatematicaService service = new MatematicaService();
        serie = service.evaluarSerie(n); 
        //salida
        System.out.println("El valor de la serie es: " + serie);
    }
}
