package Entidades;

/**
 * Clase en donde se encuentran todas la variables o datos que pertenecen a
 * una jornada, al igual que los obtener y asignar de cada una de las variables.
 * 
 * @author Lubian Cardona
 * @author Daniel Rúa Madrid
 * @author Juan Pablo Tabares Sánchez
 * @version 1.0
 * 
 */

public class Jornada {
    
    String codigo;
    String fechaprogra;
    String horas;
    String minutos;
    String direcc;
    long cantdonan;
    long cantapos;
    long cantaneg;
    long cantbpos;
    long cantbneg;
    long cantopos;
    long cantoneg;
    long cantabpos;
    long cantabneg;
    String observ;
    String estado;

    public Jornada() {
    }

    public Jornada(String codigo, String fechaprogra, String horas, String minutos, String direcc, long cantdonan, long cantapos, long cantaneg, long cantbpos, long cantbneg, long cantopos, long cantoneg, long cantabpos, long cantabneg, String observ, String estado) {
        this.codigo = codigo;
        this.fechaprogra = fechaprogra;
        this.horas = horas;
        this.minutos = minutos;
        this.direcc = direcc;
        this.cantdonan = cantdonan;
        this.cantapos = cantapos;
        this.cantaneg = cantaneg;
        this.cantbpos = cantbpos;
        this.cantbneg = cantbneg;
        this.cantopos = cantopos;
        this.cantoneg = cantoneg;
        this.cantabpos = cantabpos;
        this.cantabneg = cantabneg;
        this.observ = observ;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaprogra() {
        return fechaprogra;
    }

    public void setFechaprogra(String fechaprogra) {
        this.fechaprogra = fechaprogra;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getMinutos() {
        return minutos;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    public long getCantdonan() {
        return cantdonan;
    }

    public void setCantdonan(long cantdonan) {
        this.cantdonan = cantdonan;
    }

    public long getCantapos() {
        return cantapos;
    }

    public void setCantapos(long cantapos) {
        this.cantapos = cantapos;
    }

    public long getCantaneg() {
        return cantaneg;
    }

    public void setCantaneg(long cantaneg) {
        this.cantaneg = cantaneg;
    }

    public long getCantbpos() {
        return cantbpos;
    }

    public void setCantbpos(long cantbpos) {
        this.cantbpos = cantbpos;
    }

    public long getCantbneg() {
        return cantbneg;
    }

    public void setCantbneg(long cantbneg) {
        this.cantbneg = cantbneg;
    }

    public long getCantopos() {
        return cantopos;
    }

    public void setCantopos(long cantopos) {
        this.cantopos = cantopos;
    }

    public long getCantoneg() {
        return cantoneg;
    }

    public void setCantoneg(long cantoneg) {
        this.cantoneg = cantoneg;
    }

    public long getCantabpos() {
        return cantabpos;
    }

    public void setCantabpos(long cantabpos) {
        this.cantabpos = cantabpos;
    }

    public long getCantabneg() {
        return cantabneg;
    }

    public void setCantabneg(long cantabneg) {
        this.cantabneg = cantabneg;
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
