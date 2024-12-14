package ec.edu.espe.grupo2.usuario.model;

import java.io.Serializable;
import java.time.LocalDate;

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
    @Column (name = "PAGOS_ACEPTADOS", nullable = false, length = 3)
    private String codigosAceptados;
    @NotNull
    @Column (name = "PAGOS_ACEPTADOS", nullable = false, length = 3)
    private String codigosAceptados;
    @NotNull
    @Column (name = "PAGOS_ACEPTADOS", nullable = false, length = 3)
    private String codigosAceptados;
    

}
