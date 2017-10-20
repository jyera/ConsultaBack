package com.dunebook.webclipse.example;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Person entity. @author jyera
 */
@XmlRootElement
@Entity
@Table(name = "CLIENTES", schema = "CONSULTADB")
public class Clientes implements java.io.Serializable {
	// Fields
	private static final long serialVersionUID = 1L;
	private Integer idCliente;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String direccion;
	private String correo;
	private Date fechaNacimiento;
	private String telefonoFijo;
	private String telefonoMovil;
	// Constructors
	/** default constructor */
	public Clientes() {
	}
	/** minimal constructor */
	public Clientes(Integer idCliente, String nombre,
					String apellido1, String apellido2) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}
	/** full constructor */
	public Clientes(Integer idCliente, String nombre,
			String apellido1, String apellido2, String direccion, String correo, Date fechaNacimiento) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
	}
	// Property accessors
	@Id
	@Column(name = "IDCLIENTE")
	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	@Column(name = "NOMBRE", length = 20)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "APELLIDO1", length = 20)
	public String getApellido1() {
		return this.apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	@Column(name = "APELLIDO2", length = 20)
	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	@Column(name = "DIRECCION", length = 100)
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "CORREO", length = 30)
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Column(name = "FECHANACIMIENTO")
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Column(name = "TELEFONOFIJO", length = 20)
	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	@Column(name = "TELEFONOMOVIL", length = 20)
	public String getTelefonoMovil() {
		return telefonoMovil;
	}

	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}
	

}