package ec.edu.espe.grupo2.funcionalidad.model;
import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "SEG_PERFIL_FUNCIONALIDAD")
public class SegPerfilFuncionalidad implements Serializable{

    @EmbeddedId 
    @ManyToOne
    @JoinColumn (name = "COD_PERFIL", nullable = false, referencedColumnName = "COD_PERFIL", insertable = false, updatable = false)
    private SegFuncionalidadPK codPerfil;

    @EmbeddedId
    @ManyToOne
    @JoinColumn (name = "COD_FUNCIONALIDAD", nullable = false, referencedColumnName = "COD_FUNCIONALIDAD", insertable = false, updatable = false)
    private SegFuncionalidadPK codFuncionalidad;

    @EmbeddedId 
    @ManyToOne
    @JoinColumn (name = "COD_MODULO", nullable = false, referencedColumnName = "COD_MODULO", insertable = false, updatable = false)
    private SegFuncionalidadPK codModulo;

    @NotNull
    @Column (name = "ORDEN", nullable = false)
    private Integer orden;

    @NotNull
    @Column (name = "ESTADO", nullable = false, length = 3)
    private Integer estado;

    @NotNull
    @Column (name = "ADMITE_CREACION", nullable = false)
    private Boolean admiteCreacion;

    @NotNull
    @Column (name = "ADMITE_MODIFICACION", nullable = false)
    private Boolean admiteModificacion;
}
