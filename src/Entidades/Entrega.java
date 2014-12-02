package Entidades;

/**
 * Clase en donde se encuentran todas la variables o datos que pertenecen a
 * una entrega, al igual que los obtener y asignar de cada una de las variables.
 * 
 * @author Lubian Cardona
 * @author Daniel Rúa Madrid
 * @author Juan Pablo Tabares Sánchez
 * @version 1.0
 * 
 */

public class Entrega {
    
    String codigo;
    String grupo;
    String rh;
    String fechvenc;
    String fechrecol;
    String nit;
    String razon;
    long cantentre;
    String observ;
    String estado;

    public Entrega() {
    }

    public Entrega(String codigo, String grupo, String rh, String fechvenc, String fechrecol, String nit, String razon, long cantentre, String observ, String estado) {
        this.codigo = codigo;
        this.grupo = grupo;
        this.rh = rh;
        this.fechvenc = fechvenc;
        this.fechrecol = fechrecol;
        this.nit = nit;
        this.razon = razon;
        this.cantentre = cantentre;
        this.observ = observ;
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

    public String getFechvenc() {
        return fechvenc;
    }

    public void setFechvenc(String fechvenc) {
        this.fechvenc = fechvenc;
    }

    public String getFechrecol() {
        return fechrecol;
    }

    public void setFechrecol(String fechrecol) {
        this.fechrecol = fechrecol;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public long getCantentre() {
        return cantentre;
    }

    public void setCantentre(long cantentre) {
        this.cantentre = cantentre;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
