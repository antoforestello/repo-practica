package isi.died.parcial01.ejercicio02.dominio;

public class YaEstaInscriptoException extends Exception {
	public YaEstaInscriptoException(Alumno a, Materia m) {
		super("El alumno: "+ a.getNombre()+" ya se encuentra inscripto a la materia: "+ m.getNombre());
	}
}
