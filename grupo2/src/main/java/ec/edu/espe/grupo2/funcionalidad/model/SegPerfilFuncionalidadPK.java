package ec.edu.espe.grupo2.funcionalidad.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Table
public class SegPerfilFuncionalidadPK implements Serializable{

    @NotNull
    @Column (name = "COD_PERFIL", nullable = false, length = 8)
    private String codPerfil;

    @NotNull
    @Column (name = "COD_FUNCIONALIDAD", nullable = false)
    private Integer codigoFuncionalidad;

    @NotNull
    @Column (name = "COD_MODULO", nullable = false)
    private Integer codigoModulo;

    public SegPerfilFuncionalidadPK() {
    }

    public SegPerfilFuncionalidadPK(@NotNull String codPerfil, @NotNull Integer codigoFuncionalidad,
            @NotNull Integer codigoModulo) {
        this.codPerfil = codPerfil;
        this.codigoFuncionalidad = codigoFuncionalidad;
        this.codigoModulo = codigoModulo;
    }

    public String getCodPerfil() {
        return codPerfil;
    }

    public void setCodPerfil(String codPerfil) {
        this.codPerfil = codPerfil;
    }

    public Integer getCodigoFuncionalidad() {
        return codigoFuncionalidad;
    }

    public void setCodigoFuncionalidad(Integer codigoFuncionalidad) {
        this.codigoFuncionalidad = codigoFuncionalidad;
    }

    public Integer getCodigoModulo() {
        return codigoModulo;
    }

    public void setCodigoModulo(Integer codigoModulo) {
        this.codigoModulo = codigoModulo;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codPerfil == null) ? 0 : codPerfil.hashCode());
        result = prime * result + ((codigoFuncionalidad == null) ? 0 : codigoFuncionalidad.hashCode());
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
        SegPerfilFuncionalidadPK other = (SegPerfilFuncionalidadPK) obj;
        if (codPerfil == null) {
            if (other.codPerfil != null)
                return false;
        } else if (!codPerfil.equals(other.codPerfil))
            return false;
        if (codigoFuncionalidad == null) {
            if (other.codigoFuncionalidad != null)
                return false;
        } else if (!codigoFuncionalidad.equals(other.codigoFuncionalidad))
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
        return "SegPerfilFuncionalidadPK [codPerfil=" + codPerfil + ", codigoFuncionalidad=" + codigoFuncionalidad
                + ", codigoModulo=" + codigoModulo + "]";
    }

    

}
