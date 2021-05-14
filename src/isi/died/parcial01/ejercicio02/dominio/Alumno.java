package isi.died.parcial01.ejercicio02.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import isi.died.parcial01.ejercicio02.dominio.Inscripcion.Estado;

public class Alumno {
	
	private static Integer ID_GENERATOR=0;
	
	private Integer id;
	private String nombre;

	private List<Inscripcion> materiasCursadas;
	private List<Examen> examenes;
	
	public Alumno() {
		this.id = ID_GENERATOR++;
		this.materiasCursadas = new ArrayList<Inscripcion>();
		this.examenes = new ArrayList<Examen>();
	}
	
	
	public Alumno(String nombre) {
		this();
		this.nombre = nombre;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void addExamen(Examen e) {
		this.examenes.add(e);
		e.setAlumno(this);
	}
	
	public void addCursada(Inscripcion e) throws YaEstaInscriptoException {
		if(this.estaInscripto(e.getMateria())) {
			throw new YaEstaInscriptoException(this, e.getMateria());
		}
		this.materiasCursadas.add(e);
		e.setInscripto(this);
	}
	public Boolean estaInscripto(Materia m) {
		for(Inscripcion i: this.materiasCursadas) {
			if(i.getMateria()==m && i.getEstado()!= Estado.LIBRE) return true;
		}
		return false;
	}
	
	public void promocionar(Materia m) {
		Optional<Inscripcion> algo=this.materiasCursadas
						.stream()
						.filter(i -> i.getMateria().equals(m)) //inscripciones de esa materia
						.sorted((o1,o2) -> o2.getCicloLectivo()-o1.getCicloLectivo())
						.findFirst();
		if(algo.isPresent()) {
			algo.get().promocionar();
		}
	
	}
	
	
	public Integer cantidadAplazos() {
		return (int)this.examenes.stream()
					.filter(e -> e.getNota()<6)
					.count();
	}
}
