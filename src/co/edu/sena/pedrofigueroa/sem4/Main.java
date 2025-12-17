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

        Abogado[] Abogados = new Abogado[3];
        Abogados[0] = new Abogado ("Alberto","Dueñas@hotmail.com",67532890,4358,11);
        Abogados[1] = new CorporateLawyer ("Gilberto","lemus@hotmail.com",19926789,4322,11,10,"Departamento legal petrolifico");
        Abogados[2] = new PenalLawyer("Hernan","zuñiga@hotmail.com",39486219,4377,8,5,"Dificil");
        
        
        for(Abogado MisAbogados: Abogados){
               MisAbogados.showInfo();
               
        }
        
        
        
        
    }
    
}