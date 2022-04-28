package udb.modulo2.springmvc.entidades;

import java.util.ArrayList;
import java.util.List;


//@Entity
public class Estudiante {
//	@Id
	private Integer codigo;
	private String nombre;
	private String apellido;
	private Double cum;
//	@Column(name = "cuota")
	private Double cuotaMensual;
	private Boolean reingreso;
	private String genero;
	private List<Curso> lstCursos = new ArrayList<Curso>();
	
	public Estudiante() {
		super();
	}
	public Estudiante(Integer codigo) {
		super();
		this.codigo = codigo;
	}
	public Estudiante(Integer codigo, String nombre, String apellido, Double cum, Double cuotaMensual) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cum = cum;
		this.cuotaMensual = cuotaMensual;
	}
	
		
	public Estudiante(Integer codigo, String nombre, String apellido) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

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

	public Double getCum() {
		return cum;
	}

	public void setCum(Double cum) {
		this.cum = cum;
	}

	public Double getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(Double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public List<Curso> getLstCursos() {
		return lstCursos;
	}
	public void setLstCursos(List<Curso> lstCursos) {
		this.lstCursos = lstCursos;
	}
	public Boolean getReingreso() {
		return reingreso;
	}
	public void setReingreso(Boolean reingreso) {
		this.reingreso = reingreso;
	}
	
	
	
}
