package pe.edu.uni.pc2_py1_reyna.prueba;

import pe.edu.uni.pc2_py1_reyna.service.MatematicaService;

public class Prueba01_Fibonacci {
    public static void main(String[] args) {
        //variables
        int n = 4; 
        String fibonacciS; 
        //proceso
        MatematicaService service = new MatematicaService();
        fibonacciS = service.fibonacci(n); 
        //salida
        System.out.println(fibonacciS);
    }
}
