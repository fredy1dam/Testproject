package prueba;

import java.time.LocalDate;

public class Empleado {

	private String nombre;
	private String apellido;
	private LocalDate fechaNac;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public Empleado(String nombre, String apellido, LocalDate fechaNac) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
	}
	public Empleado() {
		super();
	}
	
	
	
}
