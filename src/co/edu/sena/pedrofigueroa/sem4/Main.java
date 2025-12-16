package co.edu.sena.pedrofigueroa.sem4;

public class Main {
    public static void main(String[] args) {

        
        Abogado per1 = new Abogado();
        per1.setNombre("Pedro");
        System.out.println(per1.getNombre());

        
        CorporateLawyer corp = new CorporateLawyer();
        corp.setNombre("Laura");
        corp.setEmpresasClientes(5);
        corp.setDepartamentoAsignado("Área Corporativa");
        corp.hojaDeVida();
        System.out.println(corp.getNombre());

        
        CorporateLawyer corp2 = new CorporateLawyer(
            "Pedro",
            "pedro@email.com",
            123456,
            78910,
            6,
            3, 
            "Departamento Legal Corporativo"
        );

        corp.showInfo();  
        
        PenalLawyer pen1 = new PenalLawyer(
        "laurence",
        "laurence22_@gmail.com",
        223365,
        7689,
        7,
        5,
        "intermedio"
        
        );
        pen1.showInfo();
        System.out.println(pen1.getExperiencia());


    }
    
}