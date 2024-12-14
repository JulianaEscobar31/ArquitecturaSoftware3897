package ec.edu.espe.grupo2.funcionalidad.model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "SEG_FUNCIONALIDAD")
public class SegFuncionalidad implements Serializable{

    @EmbeddedId
    private SegFuncionalidadPK pk;
    
    @Id
    @NotNull
    @Column (name = "COD_FUNCIONALIDAD", nullable = false, length = 16)
    private String codFuncionalidad;

    @Id
    @Column (name = "COD_MODULO", nullable = false)
    private String codModulo;

   
    @NotNull
    @Column(name = "COD_FUNCIONALIDAD", nullable = false)
    private String codFuncionalidad;
    @NotNull
    @Column(name = "COD_FUNCIONALIDAD", nullable = false)
    private String codFuncionalidad;
    @NotNull
    @Column(name = "COD_FUNCIONALIDAD", nullable = false)
    private String codFuncionalidad;

}
