package ec.edu.espe.grupo2.modulo.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "SEG_MODULO")

public class SegModulo implements Serializable{
    
    @Id
    @Column (name = "COD_MODULO", nullable = false, length = 16)
    private String codModulo;

    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String nombre;

    @NotNull
    @Column(name = "ESTADO", nullable = false, length = 3)
    private String estado;

    @NotNull
    @Column(name = "VERSION", nullable = false)
    private Integer version;

    public SegModulo() {
    }

    public SegModulo(String codModulo, @NotNull String nombre, @NotNull String estado, @NotNull Integer version) {
        this.codModulo = codModulo;
        this.nombre = nombre;
        this.estado = estado;
        this.version = version;
    }

    public String getCodModulo() {
        return codModulo;
    }

    public void setCodModulo(String codModulo) {
        this.codModulo = codModulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codModulo == null) ? 0 : codModulo.hashCode());
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
        SegModulo other = (SegModulo) obj;
        if (codModulo == null) {
            if (other.codModulo != null)
                return false;
        } else if (!codModulo.equals(other.codModulo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegModulo [codModulo=" + codModulo + ", nombre=" + nombre + ", estado=" + estado + ", version="
                + version + "]";
    }

}
