package ec.edu.espe.grupo2.registro.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SEG_REGISTRO_SESION")
public class SegRegistroSesion implements Serializable{
    
    @Id
    
    public SegRegistroSesion() {
    }

    public SegRegistroSesion(String codRegistroSesion, String codUsuario, String codSesion, String fechaInicio, String fechaFin, String estado) {
        this.codRegistroSesion = codRegistroSesion;
        this.codUsuario = codUsuario;
        this.codSesion = codSesion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    public String getCodRegistroSesion() {
        return codRegistroSesion;
    }

    public void setCodRegistroSesion(String codRegistroSesion) {
        this.codRegistroSesion = codRegistroSesion;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getCodSesion() {
        return codSesion;
    }

    public void setCodSesion(String codSesion) {
        this.codSesion = codSesion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}