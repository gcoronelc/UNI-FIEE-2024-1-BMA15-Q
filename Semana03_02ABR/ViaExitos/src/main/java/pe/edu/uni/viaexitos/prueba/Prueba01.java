
package pe.edu.uni.viaexitos.prueba;

import pe.edu.uni.viaexitos.dto.PagoDto;
import pe.edu.uni.viaexitos.services.PagoService;


public class Prueba01 {
	public static void main(String[] args) {
		//datos
		PagoDto dto = new PagoDto(26, 8, 2);
		//proceso
		PagoService service = new PagoService();
		dto = service.procesar(dto);
		//reporte
		System.out.println("Ingresos: "+dto.getIngresos());
		System.out.println("Renta: "+dto.getRenta());
		System.out.println("Neto: "+dto.getNeto());
	}
}
