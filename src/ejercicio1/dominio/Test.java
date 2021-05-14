package ejercicio1.dominio;

import java.util.ArrayList;
import java.util.List;

public class Test {

	AppRRHH rrhh= new AppRRHH();
	//public Operario(Integer cuit, String nombre, String apellido, Double sueldo)
	Operario o1 = new Operario(111,"Pedro", "Gomez", 40000.0);
	Operario o2 = new Operario(222,"Lucas", "Perez", 30000.0);
	
	//public Viajante(Integer cuit, String nombre, String apellido, Double sueldo)
	Viajante v1 = new Viajante(333, "Antonella", "Forestello", 50000.0);
	Viajante v2 = new Viajante(444, "Clarisa", "Espertino", 10000.0);
	Viajante v3 = new Viajante(555, "Lucila", "Milanesio", 50000.0);
	
	List<Empleado> emps= new ArrayList();
	

	
	
}
