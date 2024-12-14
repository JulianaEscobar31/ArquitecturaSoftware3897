package ec.edu.espe.grupo2.registro.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "SEG_REGISTRO_SESION")
public class SegRegistroSesion implements Serializable{
    
    @Id
    @Column (name = "SECUENCIA", nullable = false)
    private String secuencia;

    @NotNull
    @Column(name = "COD_USUARIO", nullable = false, length = 32)
    private String nombre;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column (name = "FECHA_CONEXION", nullable = false)
    private LocalDate fechaConexion;

    @NotNull
    @Column (name = "IP_CONEXION", nullable = false, length = 24)
    private String ipConexion;

    @NotNull
    @Column (name = "RESULTADO", nullable = false, length=3)
    private String resultado;

    @NotNull
    @Column (name="COD_ERROR", nullable = false, length=5)
    private String codError;

    public SegRegistroSesion() {
    }

    public SegRegistroSesion(String secuencia, @NotNull String nombre, LocalDate fechaConexion,
            @NotNull String ipConexion, @NotNull String resultado, String codError) {
        this.secuencia = secuencia;
        this.nombre = nombre;
        this.fechaConexion = fechaConexion;
        this.ipConexion = ipConexion;
        this.resultado = resultado;
        this.codError = codError;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaConexion() {
        return fechaConexion;
    }

    public void setFechaConexion(LocalDate fechaConexion) {
        this.fechaConexion = fechaConexion;
    }

    public String getIpConexion() {
        return ipConexion;
    }

    public void setIpConexion(String ipConexion) {
        this.ipConexion = ipConexion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getCodError() {
        return codError;
    }

    public void setCodError(String codError) {
        this.codError = codError;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((secuencia == null) ? 0 : secuencia.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SegRegistroSesion other = (SegRegistroSesion) obj;
        if (secuencia == null) {
            if (other.secuencia != null)
                return false;
        } else if (!secuencia.equals(other.secuencia))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegRegistroSesion [secuencia=" + secuencia + ", nombre=" + nombre + ", fechaConexion=" + fechaConexion
                + ", ipConexion=" + ipConexion + ", resultado=" + resultado + ", codError=" + codError + "]";
    }
    
    
}