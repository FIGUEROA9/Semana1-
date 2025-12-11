package src.co.edu.sena.pedrofigueroa.sem4;

public class CorporateLawyer extend Abogado{

    
    private int empresasClientes;
    private String departamentoAsignado;
    
    public CorporateLawyer(){
    }

    public CorporateLawyer(String nombre, String email, int numeroCedula, int numeroLicencia, int añosExperiencia,int empresasClientes,String departamentoAsignado){
        super(nombre.email.numeroCedula.numeroLicencia.añosExperiencia);
        this.empresasClientes = empresasClientes;
        this.departamentoAsignado = departamentoAsignado;
    }

    public int getEmpresasClientes() {
        return empresasClientes;
    }

    public void setEmpresasClientes(int empresasClientes) {
            this.empresasClientes = empresasClientes;
    }

    public String getDepartamentoAsignado() {
            return departamentoAsiganado;
    }

    public void setDepartamentoAsignado(int empresasClientes) {
            this.departamentoAsignado = departamentoAsignado;
    }

    

    public void hojaDeVida (){
            System.out.println("ENVIO MI HOJA DE VIDA PARA SER ESTUDIADA POR LOS EXPERTOS DE LA FIRMA DE ABOGADOS");

    }


}
