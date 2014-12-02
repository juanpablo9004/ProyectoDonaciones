package Entidades;
import java.util.Date;

/**
 * Clase en donde se encuentran todas la variables o datos que pertenecen a
 * una bolsa, al igual que los obtener y asignar de cada una de las variables.
 * 
 * @author Lubian Cardona
 * @author Daniel Rúa Madrid
 * @author Juan Pablo Tabares Sánchez
 * @version 1.0
 * 
 */

public class Bolsa {
    
    String codigo;
    String grupo;
    String rh;
    String fechrecol;
    String fechvenc;
    long cant;
    String obser;
    String estado;

    public Bolsa() {
    }

    public Bolsa(String codigo, String grupo, String rh, String fechrecol, String fechvenc, long cant, String obser, String estado) {
        this.codigo = codigo;
        this.grupo = grupo;
        this.rh = rh;
        this.fechrecol = fechrecol;
        this.fechvenc = fechvenc;
        this.cant = cant;
        this.obser = obser;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getFechrecol() {
        return fechrecol;
    }

    public void setFechrecol(String fechrecol) {
        this.fechrecol = fechrecol;
    }

    public String getFechvenc() {
        return fechvenc;
    }

    public void setFechvenc(String fechvenc) {
        this.fechvenc = fechvenc;
    }

    public long getCant() {
        return cant;
    }

    public void setCant(long cant) {
        this.cant = cant;
    }

    public String getObser() {
        return obser;
    }

    public void setObser(String obser) {
        this.obser = obser;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
