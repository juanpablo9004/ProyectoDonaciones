package Entidades;
import java.util.Date;

/**
 * Clase en donde se encuentran todas la variables o datos que pertenecen a
 * un donante, al igual que los obtener y asignar de cada una de las variables.
 * 
 * @author Daniel Rúa Madrid
 * @author Juan Pablo Tabares Sánchez
 * @version 1.0
 * 
 */

public class Donante {
    
    String tipodoc;
    String identif;
    String nombres;
    String apell1;
    String apell2;
    String telef;
    String direcc;
    String genero;
    String correo;
    String fechanacim;
    String fechaultimdon;
    String enferm;
    String habito;
    String estado;

    public Donante() {
    }
       
    public Donante(String tipodoc, String identif, String nombres, String apell1, String apell2, String telef, String direcc, String genero, String correo, String fechanacim, String fechaultimdon, String enferm, String habito, String estado) {
        this.tipodoc = tipodoc;
        this.identif = identif;
        this.nombres = nombres;
        this.apell1 = apell1;
        this.apell2 = apell2;
        this.telef = telef;
        this.direcc = direcc;
        this.genero = genero;
        this.correo = correo;
        this.fechanacim = fechanacim;
        this.fechaultimdon = fechaultimdon;
        this.enferm = enferm;
        this.habito = habito;
        this.estado = estado;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getIdentif() {
        return identif;
    }

    public void setIdentif(String identif) {
        this.identif = identif;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApell1() {
        return apell1;
    }

    public void setApell1(String apell1) {
        this.apell1 = apell1;
    }

    public String getApell2() {
        return apell2;
    }

    public void setApell2(String apell2) {
        this.apell2 = apell2;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechanacim() {
        return fechanacim;
    }

    public void setFechanacim(String fechanacim) {
        this.fechanacim = fechanacim;
    }

    public String getFechaultimdon() {
        return fechaultimdon;
    }

    public void setFechaultimdon(String fechaultimdon) {
        this.fechaultimdon = fechaultimdon;
    }

    public String getEnferm() {
        return enferm;
    }

    public void setEnferm(String enferm) {
        this.enferm = enferm;
    }

    public String getHabito() {
        return habito;
    }

    public void setHabito(String habito) {
        this.habito = habito;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
