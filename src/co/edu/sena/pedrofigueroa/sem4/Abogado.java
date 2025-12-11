package co.edu.sena.pedrofigueroa.sem4;

public class Abogado {
    
    protected String nombre;
    protected String email;
    protected int numeroCedula;
    protected int numeroLicencia;
    protected int añosExperiencia;
    
    public Abogado (){
    }
    public Abogado(String nombre, String email, int numeroCedula, int numeroLicencia, int añosExperiencia){
        this.nombre = nombre;
        this.email = email;
        this.numeroCedula = numeroCedula;
        this.numeroLicencia = numeroLicencia;
        this.añosExperiencia = añosExperiencia;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getNumeroCedula(){
        return numeroCedula;
    }
    public void setNumeroCedula(int numeroCedula){
        this.numeroCedula = numeroCedula;
    }
    public int getNumeroLicencia(){
        return numeroLicencia;
    }
    public void setNumeroLicencia(int numeroLicencia){
        this.numeroLicencia = numeroLicencia;
    }
    public int getAñosExperiencia(){
        return añosExperiencia;
    }
    public void setAñosExperiencia(String añosExperiwncia){
        this.añosExperiencia = añosExperiencia;
    }
    
    public void HojaDeVida(){
        System.out.println(" PRESENTO MI HOJA DE VIDA PARA LABORAR EN ESTE BUFET");
    }
    
    
}
