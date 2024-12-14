package ec.edu.espe.grupo2.funcionalidad.model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "SEG_FUNCIONALIDAD")
public class SegFuncionalidadPK implements Serializable{

    @NotNull
    @Column (name = "COD_FUNCIONALIDAD", nullable = false)
    private String codFuncionalidad;

    @NotNull
    @Column (name = "CODIGO_MODULO", nullable = false, length = 16)
    private String codigoModulo;

    public SegFuncionalidadPK() {
    }

    public SegFuncionalidadPK(@NotNull String codFuncionalidad, @NotNull String codigoModulo) {
        this.codFuncionalidad = codFuncionalidad;
        this.codigoModulo = codigoModulo;
    }

    public String getCodFuncionalidad() {
        return codFuncionalidad;
    }

    public void setCodFuncionalidad(String codFuncionalidad) {
        this.codFuncionalidad = codFuncionalidad;
    }

    public String getCodigoModulo() {
        return codigoModulo;
    }

    public void setCodigoModulo(String codigoModulo) {
        this.codigoModulo = codigoModulo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codFuncionalidad == null) ? 0 : codFuncionalidad.hashCode());
        result = prime * result + ((codigoModulo == null) ? 0 : codigoModulo.hashCode());
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
        SegFuncionalidadPK other = (SegFuncionalidadPK) obj;
        if (codFuncionalidad == null) {
            if (other.codFuncionalidad != null)
                return false;
        } else if (!codFuncionalidad.equals(other.codFuncionalidad))
            return false;
        if (codigoModulo == null) {
            if (other.codigoModulo != null)
                return false;
        } else if (!codigoModulo.equals(other.codigoModulo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegFuncionalidadPK [codFuncionalidad=" + codFuncionalidad + ", codigoModulo=" + codigoModulo + "]";
    }
}
