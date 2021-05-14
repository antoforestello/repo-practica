package ejercicio1.dominio;


import java.time.LocalDate;

public abstract class Empleado {
	//Variables
	protected Integer CUIT;
	protected String nombre;
	protected String apellido;
	protected LocalDate fechaIngreso;
	protected Double sueldoBasico;
	
	//Constructor
	public Empleado(Integer cuit, String nombre, String apellido, Double sueldo) {
		this.CUIT=cuit;
		this.nombre=nombre;
		this.apellido=apellido;
		this.fechaIngreso=LocalDate.now();
		this.sueldoBasico=sueldo;
	}
	
	//Metodos
	public abstract Double totalPago();
	
	public Double extraAniversario() {
		LocalDate ahora= LocalDate.now();
		Double retorno=0.0;
		if(ahora.getMonth()==this.fechaIngreso.getMonth()) {
			retorno= this.sueldoBasico*0.5;
		}
		return retorno;
	}
}
