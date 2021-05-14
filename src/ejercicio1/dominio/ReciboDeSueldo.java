package ejercicio1.dominio;

import java.time.Instant;

public class ReciboDeSueldo {
	//Variables
	private Integer numero;
	private Instant mes;
	private Double totalPago;
	private Empleado emp;
	private static Integer ultimoNum;
	
	//Constructor
	public ReciboDeSueldo(Double totalPago, Empleado emp) {
		this.numero= ultimoNum;
		ultimoNum++;
		this.mes=Instant.now();
		this.totalPago=totalPago;
		this.emp=emp;
	}
}
