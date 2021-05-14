package ejercicio1.dominio;

import java.util.ArrayList;
import java.util.List;

/*La empresa BioAgroJava comercializa productos agrícolas y veterinarios en el
 *  país y también los exporta a países limítrofes. Para realizar su tarea 
 *  posee 3 plantas de producción en distintos puntos del país. Además tiene 
 *  una red de comercialización que incluye más de 120 locales con atención 
 *  al público, una fuerza de venta de venta de 50 viajantes que visitan
 *   a los clientes en los establecimientos agrícolas y ganaderos, y un centro
 *    de datos donde se gestionan todas las ventas online y telefónicas.*/

public class AppRRHH {

	//Metodos
	public List<ReciboDeSueldo> totalSueldos(List<Empleado> emp) {
		List<ReciboDeSueldo> retorno= new ArrayList<ReciboDeSueldo>();
		for(Empleado e: emp) {
			retorno.add(new ReciboDeSueldo( e.totalPago(), e));
		}
		return retorno;
	}
}
