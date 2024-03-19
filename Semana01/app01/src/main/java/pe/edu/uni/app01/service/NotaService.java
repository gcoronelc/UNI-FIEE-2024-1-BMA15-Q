package pe.edu.uni.app01.service;

public class NotaService {

    /**
     * Calcula el promedio de un estudiante.
     * @param nota1 Nota 1, en el rango de 0 a 20.
     * @param nota2 Nota 2, en el rango de 0 a 20.
     * @param nota3 Nota 3, en el rango de 0 a 20.
     * @return Retorna el promedio de las 3 notas, solo considera la parte entera.
     */
    public int promedio(int nota1, int nota2, int nota3) {
        // Variables
        int pr;
        // Proceso
        pr = (nota1 + nota2 + nota3) / 3;
        // Reporte
        return pr;
    }

    public String condicion(int nota) {
        // Variables
        String cond;
        // Proceso
        cond = "Error, nota incorrecta";
        cond = (nota >= 0 && nota < 10) ? "Desaprobado" : cond;
        cond = (nota >= 10 && nota < 14) ? "En proceso" : cond;
        cond = (nota >= 14 && nota < 18) ? "Bueno" : cond;
        cond = (nota >= 18 && nota <= 20) ? "Excelente" : cond;
        // Reporte
        return cond;
    }
}
