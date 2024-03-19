package pe.edu.uni.app01.service;

import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class NotaServiceTest {

    private NotaService notaService;

    @Before
    public void setUp() {
        notaService = new NotaService();
    }

    @Test
    public void testPromedio() {
        // Prueba con notas válidas
        assertEquals(15, notaService.promedio(10, 15, 20));
        assertEquals(12, notaService.promedio(8, 12, 16));
        assertEquals(18, notaService.promedio(18, 18, 18));
    }

    @Test
    public void testCondicion() {
        // Prueba con notas en el rango correcto
        assertEquals("Desaprobado", notaService.condicion(5));
        assertEquals("En proceso", notaService.condicion(12));
        assertEquals("Bueno", notaService.condicion(16));
        assertEquals("Excelente", notaService.condicion(20));

        // Prueba con notas fuera del rango
        assertEquals("Error, nota incorrecta", notaService.condicion(-5));
        assertEquals("Error, nota incorrecta", notaService.condicion(25));
    }
}
