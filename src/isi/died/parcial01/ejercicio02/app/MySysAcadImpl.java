package isi.died.parcial01.ejercicio02.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import isi.died.parcial01.ejercicio02.db.BaseDeDatos;
import isi.died.parcial01.ejercicio02.db.BaseDeDatosExcepcion;
import isi.died.parcial01.ejercicio02.db.MyBaseDeDatosException;
import isi.died.parcial01.ejercicio02.dominio.*;


public class MySysAcadImpl implements MySysAcad {
	private static final BaseDeDatos DB = new BaseDeDatos();


	private List<Materia> materia = new ArrayList<Materia>();
	
	@Override
	public void registrarMateria(Materia d) {
		this.materia.add(d);
	}
	
	private List<Docente> docentes = new ArrayList<Docente>();
	
	@Override
	public void registrarDocente(Docente d) {
		this.docentes.add(d);
	}
	
	private List<Alumno> alumnos = new ArrayList<Alumno>();
	
	@Override
	public void registrarAlumnos(Alumno d) {
		this.alumnos.add(d);
	}
	

	@Override
	public void inscribirAlumnoCursada(Docente d, Alumno a, Materia m, Integer cicloLectivo) throws MyBaseDeDatosException, YaEstaInscriptoException {
		Inscripcion insc = new Inscripcion(cicloLectivo,Inscripcion.Estado.CURSANDO);
		d.agregarInscripcion(insc);
		a.addCursada(insc);
		m.addInscripcion(insc);
		// DESCOMENTAR Y gestionar excepcion
		try {
		DB.guardar(insc);
		}catch(BaseDeDatosExcepcion e) {
			throw new MyBaseDeDatosException();
		}
	}

	@Override
	public void inscribirAlumnoExamen(Docente d, Alumno a, Materia m) {
		Examen e = new Examen();
		a.addExamen(e);
		d.agregarExamen(e);
		m.addExamen(e);
		// DESCOMENTAR Y gestionar excepcion
		// DB.guardar(e);
	}
	
	public void registrarNota(Integer nota, Alumno a, Examen e, Materia m, Docente d) {
		//public Examen(Alumno alumno, Materia materia, Docente docente, Integer nota, LocalDate fecha)
		Examen nuevoExamen = new Examen(a,m,d,nota,LocalDate.now());
		if(nota>=6) {
			a.promocionar(m);
		}
		
	}


	@Override
	public List<Examen> topNExamenes(Materia m, Integer n) {
		return m.getExamenes()
			.stream()
			.filter(e -> e.getMateria().equals(m))
			.sorted((e1, e2) -> e2.getNota()-e1.getNota())
			.limit(n)
			.collect(Collectors.toList());
	}
	
	public Integer cantidadAplazos(Alumno a) {
		return a.cantidadAplazos();
	}

}
