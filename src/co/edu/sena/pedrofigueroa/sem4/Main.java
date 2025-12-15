package co.edu.sena.pedrofigueroa.sem4;
public class Main {
    public static void main (String[] args){
        
        Abogado per1 = new Abogado();
        
        per1.setNombre("pedro");
        per1.getNombre();
        
        System.out.println(per1.getNombre());
        
        
        CorporateLawyer num1 = new CorporateLawyer();
        num1.HojaDeVida();
        num1.setNombre("laura");
        System.out.println(num1.getNombre());
    }
}
