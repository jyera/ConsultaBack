package com.dunebook.webclipse.example;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Time;
import java.util.Date;

/**
 * Person entity. @author jyera
 */
@XmlRootElement
@Entity
@Table(name = "CITAS", schema = "CONSULTADB")
public class Citas implements java.io.Serializable {
    // Fields
    private static final long serialVersionUID = 1L;
    private Integer idCita;
    private Integer idCliente;
    private Date fechaCita;
    private Time horaCita;
    private String observacion;

    // Constructors
    /** default constructor */
    public Citas() {
    }
    /** minimal constructor */
    public Citas(Integer idCita, Integer idCliente,
                    Date fechaCita, Time horaCita) {
        this.idCita = idCita;
        this.idCliente = idCliente;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
    }
    /** full constructor */
    public Citas(Integer idCita, Integer idCliente,
                 Date fechaCita, Time horaCita, String observacion) {
        this.idCita = idCita;
        this.idCliente = idCliente;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.observacion = observacion;
    }
    // Property accessors
    @Id
    @Column(name = "IDCITA")
    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    @Column(name = "IDCLIENTE")
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Column(name = "FECHACITA")
    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    @Column(name = "HORACITA")
    public Time getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(Time horaCita) {
        this.horaCita = horaCita;
    }

    @Column(name = "OBSERVACION", length = 150)
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }


}