package ec.edu.espe.grupo2.perfil.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "SEG_PERFIL")
public class SegPerfil implements Serializable{

    @Id
    @Column (name = "COD_PERFIL", nullable = false, length = 8)
    private String codPerfil;

    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @NotNull
    @Column(name = "ESTADO", nullable = false, length = 3)
    private String estado;

    public SegPerfil() {
    }

    public SegPerfil(String codPerfil, @NotNull String nombre, @NotNull String estado) {
        this.codPerfil = codPerfil;
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getCodPerfil() {
        return codPerfil;
    }

    public void setCodPerfil(String codPerfil) {
        this.codPerfil = codPerfil;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codPerfil == null) ? 0 : codPerfil.hashCode());
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
        SegPerfil other = (SegPerfil) obj;
        if (codPerfil == null) {
            if (other.codPerfil != null)
                return false;
        } else if (!codPerfil.equals(other.codPerfil))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegPerfil [codPerfil=" + codPerfil + ", nombre=" + nombre + ", estado=" + estado + "]";
    }

}
