package ejercicio1.dominio;

import java.util.ArrayList;
import java.util.List;

/*La empresa BioAgroJava comercializa productos agr�colas y veterinarios en el
 *  pa�s y tambi�n los exporta a pa�ses lim�trofes. Para realizar su tarea 
 *  posee 3 plantas de producci�n en distintos puntos del pa�s. Adem�s tiene 
 *  una red de comercializaci�n que incluye m�s de 120 locales con atenci�n 
 *  al p�blico, una fuerza de venta de venta de 50 viajantes que visitan
 *   a los clientes en los establecimientos agr�colas y ganaderos, y un centro
 *    de datos donde se gestionan todas las ventas online y telef�nicas.*/

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
