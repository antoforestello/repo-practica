package ejercicio1.dominio;

import java.time.Instant;

public class Venta {
	//Variables
	private Instant fecha;
	private Double total;
	
	//Constructor
	
	public Venta(Double total) {
		this.fecha=Instant.now();
		this.total=total;
	}
	
	//Getters and setters

	public Instant getFecha() {
		return fecha;
	}

	public void setFecha(Instant fecha) {
		this.fecha = fecha;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	
	
	
}
