package Entidades;

/**
 * Clase en donde se encuentran todas la variables o datos que pertenecen a
 * un usuario, al igual que los obtener y asignar de cada una de las variables.
 * 
 * @author Daniel Rúa Madrid
 * @author Juan Pablo Tabares Sánchez
 * @version 1.0
 * 
 */

public class Usuario {
    
    private String identif;
    private String nomb;
    private String apell1;
    private String apell2;
    private String correo;
    private String usuario;
    private String contra;
    private String concontra;
    private String perfil;
    private String estado;
    
    
    /**
     * Este es uno de los constructores de la clase.
     */
    
    public Usuario(){
        
    }
    
    /**
     * Este es uno de los constructores de la clase, aqui se inicializan las 
     * variables de la clase.
     * 
     * @param identif, variable que contiene el número de identificación del usuario.
     * @param nomb, variable que contiene los nombres del usuario.
     * @param apell1, variable que contiene el primer apellido del usuario.
     * @param apell2, variable que contiene el segundo apellido del usuario.
     * @param correo, variable que contiene el correo del usuario.
     * @param usuario, variable que contiene el nombre de usuario del usuario.
     * @param contra, variable que contiene la contraseña del usuario.
     * @param concontra, variable que contiene la confirmación de contraseña
     * del usuario.
     * @param perfil, variable que contiene el perfil del usuario.
     * @param estado, variable que contiene el estado del usuario.
     */
    
    public Usuario(String identif, String nomb, String apell1, String apell2, String correo, String usuario, String contra, String concontra, String perfil, String estado) {
        this.identif = identif;
        this.nomb = nomb;
        this.apell1 = apell1;
        this.apell2 = apell2;
        this.correo = correo;
        this.usuario = usuario;
        this.contra = contra;
        this.concontra = concontra;
        this.perfil = perfil;
        this.estado = estado;
    }

    public String getIdentif() {
        return identif;
    }

    public void setIdentif(String identif) {
        this.identif = identif;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getConcontra() {
        return concontra;
    }

    public void setConcontra(String concontra) {
        this.concontra = concontra;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }   
}
