package com.dunebook.webclipse.example;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Consultas entity. @author jyera
 */
@XmlRootElement
@Entity
@Table(name = "CONSULTAS", schema = "CONSULTADB")
public class Consultas implements java.io.Serializable {
    // Fields
    private static final long serialVersionUID = 1L;
    private Integer idConsulta;
    private Integer idCliente;
    private Integer idCita;
    private String tratamiento;

    // Constructors
    /** default constructor */
    public Consultas() {
    }
    /** minimal constructor */
    public Consultas(Integer idConsulta, Integer idCliente) {
        this.idConsulta = idConsulta;
        this.idCliente = idCliente;
    }
    /** full constructor */
    public Consultas(Integer idConsulta, Integer idCliente, Integer idCita) {
        this.idConsulta = idConsulta;
        this.idCliente = idCliente;
        this.idCita = idCita;
    }
    // Property accessors
    @Id
    @Column(name = "IDCONSULTA")
    public Integer getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Integer idConsulta) {
        this.idConsulta = idConsulta;
    }

    @Column(name = "IDCLIENTE")
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Column(name = "IDCITA")
    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    @Column(name = "TRATAMIENTO", length = 150)
    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }


}