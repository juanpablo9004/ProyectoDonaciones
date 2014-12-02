package Entidades;

/**
 * Clase en donde se encuentran todas la variables o datos que pertenecen a
 * un hospital, al igual que los obtener y asignar de cada una de las variables.
 * 
 * @author Lubian Cardona
 * @author Daniel Rúa Madrid
 * @author Juan Pablo Tabares Sánchez
 * @version 1.0
 * 
 */

public class Hospital {
    
    String tipohosp;
    String nit;
    String razonsoc;
    String direcc;
    String telef;
    String represen;
    String telrepre;
    String correorepre;
    String nivelhosp;
    String estado;

    public Hospital() {
    }

    public Hospital(String tipohosp, String nit, String razonsoc, String direcc, String telef, String represen, String telrepre, String correorepre, String nivelhosp, String estado) {
        this.tipohosp = tipohosp;
        this.nit = nit;
        this.razonsoc = razonsoc;
        this.direcc = direcc;
        this.telef = telef;
        this.represen = represen;
        this.telrepre = telrepre;
        this.correorepre = correorepre;
        this.nivelhosp = nivelhosp;
        this.estado = estado;
    }

    public String getTipohosp() {
        return tipohosp;
    }

    public void setTipohosp(String tipohosp) {
        this.tipohosp = tipohosp;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazonsoc() {
        return razonsoc;
    }

    public void setRazonsoc(String razonsoc) {
        this.razonsoc = razonsoc;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public String getRepresen() {
        return represen;
    }

    public void setRepresen(String represen) {
        this.represen = represen;
    }

    public String getTelrepre() {
        return telrepre;
    }

    public void setTelrepre(String telrepre) {
        this.telrepre = telrepre;
    }

    public String getCorreorepre() {
        return correorepre;
    }

    public void setCorreorepre(String correorepre) {
        this.correorepre = correorepre;
    }

    public String getNivelhosp() {
        return nivelhosp;
    }

    public void setNivelhosp(String nivelhosp) {
        this.nivelhosp = nivelhosp;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
