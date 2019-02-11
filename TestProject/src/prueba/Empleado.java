package prueba;

import java.time.LocalDate;

public class Empleado {

	private String mombre;
	private String apellido;
	private LocalDate fechaNac;
	public String getMombre() {
		return mombre;
	}
	public void setMombre(String mombre) {
		this.mombre = mombre;
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
	public Empleado(String mombre, String apellido, LocalDate fechaNac) {
		super();
		this.mombre = mombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
	}
	public Empleado() {
		super();
	}
	
	
	
}
