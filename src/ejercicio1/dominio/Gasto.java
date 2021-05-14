package ejercicio1.dominio;

public class Gasto {
	//variables
	private Integer nroComprobante;
	private String desc;
	private Double total;
	
	//Constructor
	public Gasto(Integer nro, String desc, Double tot) {
		this.nroComprobante=nro;
		this.desc=desc;
		this.total=tot;
	}

	//Getters y setters
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Integer getNroComprobante() {
		return nroComprobante;
	}
	
	
}
