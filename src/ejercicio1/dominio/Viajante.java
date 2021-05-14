package ejercicio1.dominio;

import java.util.ArrayList;
import java.util.List;

public class Viajante extends Empleado {
	
	//Variables
	private List<Gasto> gastos;
	private List<Venta> ventas;
	
	//Constructor
	public Viajante(Integer cuit, String nombre, String apellido, Double sueldo) {
		super(cuit, nombre, apellido, sueldo);
		this.gastos= new ArrayList<Gasto>();
		this.ventas= new ArrayList<Venta>();
	}

	//Metodos
	@Override
	public Double totalPago() {
		Double tot= this.sueldoBasico+this.totalVentas()*0.15+this.gastosTot()+this.extraAniversario();
		return null;
	}
	
	public Double totalVentas() {
		return ventas.stream()
					.mapToDouble(v -> v.getTotal())
					.sum();
	}
	
	public Double gastosTot() {
		return gastos.stream()
					.mapToDouble(g -> g.getTotal())
					.sum();
	}
	
	
}
