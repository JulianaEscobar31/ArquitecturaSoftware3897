package ec.edu.espe.grupo2.funcionalidad.model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "SEG_FUNCIONALIDAD")
public class SegFuncionalidad implements Serializable{

    @EmbeddedId
    private SegPerfilFuncionalidadPK codModulo;
    
    @Id
    @NotNull
    @Column (name = "COD_FUNCIONALIDAD", nullable = false, length = 16)
    private String codFuncionalidad;

    @NotNull
    @Column (name = "URL_PRINCIPAL", nullable = false, length = 200)
    private String urlPrincipal;

    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 200)
    private String nombre;

    @NotNull
    @Column(name = "DESCRIPCION", nullable = false, length = 500)
    private String descripcion;

    @NotNull
    @Column(name = "ESTADO", nullable = false, length = 3)
    private String estado;

    public SegFuncionalidad() {
    }

    public SegFuncionalidad(SegPerfilFuncionalidadPK codModulo, @NotNull String codFuncionalidad,
            @NotNull String urlPrincipal, @NotNull String nombre, @NotNull String descripcion, @NotNull String estado) {
        this.codModulo = codModulo;
        this.codFuncionalidad = codFuncionalidad;
        this.urlPrincipal = urlPrincipal;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public SegPerfilFuncionalidadPK getCodModulo() {
        return codModulo;
    }

    public void setCodModulo(SegPerfilFuncionalidadPK codModulo) {
        this.codModulo = codModulo;
    }

    public String getCodFuncionalidad() {
        return codFuncionalidad;
    }

    public void setCodFuncionalidad(String codFuncionalidad) {
        this.codFuncionalidad = codFuncionalidad;
    }

    public String getUrlPrincipal() {
        return urlPrincipal;
    }

    public void setUrlPrincipal(String urlPrincipal) {
        this.urlPrincipal = urlPrincipal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codModulo == null) ? 0 : codModulo.hashCode());
        result = prime * result + ((codFuncionalidad == null) ? 0 : codFuncionalidad.hashCode());
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
        SegFuncionalidad other = (SegFuncionalidad) obj;
        if (codModulo == null) {
            if (other.codModulo != null)
                return false;
        } else if (!codModulo.equals(other.codModulo))
            return false;
        if (codFuncionalidad == null) {
            if (other.codFuncionalidad != null)
                return false;
        } else if (!codFuncionalidad.equals(other.codFuncionalidad))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegFuncionalidad [codModulo=" + codModulo + ", codFuncionalidad=" + codFuncionalidad + ", urlPrincipal="
                + urlPrincipal + ", nombre=" + nombre + ", descripcion=" + descripcion + ", estado=" + estado + "]";
    }
 
}
