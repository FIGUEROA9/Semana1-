package src.co.edu.sena.pedrofigueroa.sem4;

public class CorporateLawyer{

    private String email;
    private  int empresasClientes;
    private  int añosExperiencia;
    private  int numeroLicencia;
    private  String departamentoAsignado;


    public CorporateLawyer(){
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
            this.email = email;
    }

    public int getEmpresasClientes() {
            return empresasClientes;
    }

    public void setEmpresasClientes(int empresasClientes) {
            this.empresasClientes = empresasClientes;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;

    }
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public int getNumeroLicencia() {
            return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
            this.numeroLicencia = numeroLicencia;
    }

    public String getDepartamentoAsignado() {
            return departamentoAsignado;
    }
    public void setDepartamentoAsignado(String departamentoAsignado) {
            this.departamentoAsignado = departamentoAsignado;
    }


    public CorporateLawyer(String nombre, String especializacion, String honorario, String email , int empresasClientes, int añosExperiencia, int numeroLicencia, String departamentoAsignado){


        this.email = email;
        this.empresasClientes = empresasClientes;
        this.añosExperiencia = añosExperiencia;
        this.numeroLicencia = numeroLicencia;
        this.departamentoAsignado = departamentoAsignado;


    }

    public void hojaDeVida (){
            System.out.println("ENVIO MI HOJA DE VIDA PARA SER ESTUDIADA POR LOS EXPERTOS DE LA FIRMA DE ABOGADOS");

    }


}
