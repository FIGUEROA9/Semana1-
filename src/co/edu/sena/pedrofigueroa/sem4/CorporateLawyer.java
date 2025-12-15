package co.edu.sena.pedrofigueroa.sem4;
public class CorporateLawyer extends Abogado {

    
    private int empresasClientes;
    private String departamentoAsignado;
    
    public CorporateLawyer(){
    }

    public CorporateLawyer(String nombre, String email, int numeroCedula, int numeroLicencia, int experiencia,int empresasClientes,String departamentoAsignado){
        super(nombre,email,numeroCedula,numeroLicencia,experiencia);
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
            return departamentoAsignado;
    }

    public void setDepartamentoAsignado(int empresasClientes) {
            this.departamentoAsignado = departamentoAsignado;
    }

    

    public void hojaDeVida (){
            System.out.println("ENVIO MI HOJA DE VIDA PARA SER ESTUDIADA POR LOS EXPERTOS DE LA FIRMA DE ABOGADOS");

    }


}
