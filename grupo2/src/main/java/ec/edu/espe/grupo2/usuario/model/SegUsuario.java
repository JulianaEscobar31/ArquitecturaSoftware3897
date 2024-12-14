package ec.edu.espe.grupo2.usuario.model;

import java.io.Serializable;
import java.time.LocalDate;

import ec.edu.espe.grupo2.perfil.model.SegPerfil;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "SEG_USUARIO")
public class SegUsuario implements Serializable{

    @Id
    @Column (name = "COD_USUARIO", nullable = false)
    private Integer codigoUsuario;
    
    @NotNull
    @ManyToOne
    @JoinColumn (name = "COD_PERFIL", referencedColumnName = "COD_PERFIL", updatable = false, insertable = false)
    private SegPerfil codigoPerfil;

    @NotNull
    @Column (name = "MAIL", nullable = false, length = 128)
    private String mail;
    
    @NotNull
    @Column (name = "NOMBRE", nullable = false, length = 128)
    private String nombre;
    
    @NotNull
    @Column (name = "TELEFONO", nullable = false, length = 10)
    private String telefono;
    
    @NotNull
    @Column (name = "CLAVE", nullable = false, length = 64)
    private String clave;
    
    @NotNull
    @Column (name = "ESTADO", nullable = false, length = 3)
    private String estado;
    
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column (name = "FECHA_CREACION", nullable = false)
    private LocalDate fechaCreacion;
    
    @NotNull
    @Temporal(TemporalType.DATE)
    @Column (name = "FECHA_CAMBIO_CLAVE", nullable = false)
    private LocalDate fechaCambioClave;

    @NotNull
    @Column (name = "NRO_INTENTOS_FALLIDOS", nullable = false)
    private Integer nroIntentosFallidos;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column (name = "FECHA_ULTIMA_SESION", nullable = false)
    private LocalDate fechaUltimaSesion;
    
    @NotNull
    @Column (name = "SUELDO", nullable = false, length = 3)
    private Integer sueldo;

    public SegUsuario() {
    }

    public SegUsuario(Integer codigoUsuario, SegPerfil codigoPerfil, @NotNull String mail, @NotNull String nombre,
            @NotNull String telefono, @NotNull String clave, @NotNull String estado, @NotNull LocalDate fechaCreacion,
            @NotNull LocalDate fechaCambioClave, @NotNull Integer nroIntentosFallidos,
            @NotNull LocalDate fechaUltimaSesion, @NotNull Integer sueldo) {
        this.codigoUsuario = codigoUsuario;
        this.codigoPerfil = codigoPerfil;
        this.mail = mail;
        this.nombre = nombre;
        this.telefono = telefono;
        this.clave = clave;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.fechaCambioClave = fechaCambioClave;
        this.nroIntentosFallidos = nroIntentosFallidos;
        this.fechaUltimaSesion = fechaUltimaSesion;
        this.sueldo = sueldo;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public SegPerfil getCodigoPerfil() {
        return codigoPerfil;
    }

    public void setCodigoPerfil(SegPerfil codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaCambioClave() {
        return fechaCambioClave;
    }

    public void setFechaCambioClave(LocalDate fechaCambioClave) {
        this.fechaCambioClave = fechaCambioClave;
    }

    public Integer getNroIntentosFallidos() {
        return nroIntentosFallidos;
    }

    public void setNroIntentosFallidos(Integer nroIntentosFallidos) {
        this.nroIntentosFallidos = nroIntentosFallidos;
    }

    public LocalDate getFechaUltimaSesion() {
        return fechaUltimaSesion;
    }

    public void setFechaUltimaSesion(LocalDate fechaUltimaSesion) {
        this.fechaUltimaSesion = fechaUltimaSesion;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoUsuario == null) ? 0 : codigoUsuario.hashCode());
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
        SegUsuario other = (SegUsuario) obj;
        if (codigoUsuario == null) {
            if (other.codigoUsuario != null)
                return false;
        } else if (!codigoUsuario.equals(other.codigoUsuario))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegUsuario [codigoUsuario=" + codigoUsuario + ", codigoPerfil=" + codigoPerfil + ", mail=" + mail
                + ", nombre=" + nombre + ", telefono=" + telefono + ", clave=" + clave + ", estado=" + estado
                + ", fechaCreacion=" + fechaCreacion + ", fechaCambioClave=" + fechaCambioClave
                + ", nroIntentosFallidos=" + nroIntentosFallidos + ", fechaUltimaSesion=" + fechaUltimaSesion
                + ", sueldo=" + sueldo + "]";
    } 

}
