package ejercicio1.dominio;

import java.util.ArrayList;
import java.util.List;

public class Operario extends Empleado {
	
	//Variables
	private List<Viajante> viajantesAsociados;
	
	//Constructor
	public Operario(Integer cuit, String nombre, String apellido, Double sueldo) {
		super(cuit, nombre, apellido, sueldo);
		this.viajantesAsociados= new ArrayList<Viajante>();
	}

	//Metodos
	@Override
	public Double totalPago() {
		Double retorno= this.sueldoBasico;
		for(Viajante v: this.viajantesAsociados) {
			retorno= retorno+v.totalVentas()*(Double)0.05;
		}
		retorno= retorno+this.extraAniversario();
		return retorno;
	}
}
