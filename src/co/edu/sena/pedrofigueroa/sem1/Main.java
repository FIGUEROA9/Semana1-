package co.edu.sena.pedrofigueroa.sem1;
public class Main {
    public static void main(String[] args) {
        LegalCase caso1 = new LegalCase("Civil", "C-001", "Carlos Pérez");
        LegalCase caso2 = new LegalCase("Penal", "P-155", "Laura Gómez");
        LegalCase caso3 = new LegalCase("Laboral", "L-320", "Andrés Torres");


        caso1.showinfo();
        caso2.showinfo();
        caso3.showinfo();

        Dominio case1 = new Dominio("CASE-001", "Derecho Laboral", "Dr. Martinez", "Bufete Justicia & Asociados");

        Dominio case2 = new Dominio("CASE-002", "Derecho Civil", "Dra. Lopez", "Legal Trust Group");

        Dominio case3 = new Dominio("CASE-003", "Derecho Penal", "Dr. Gomez", "Defensa Penal Elite");

        Dominio case4 = new Dominio("CASE-004", "Derecho Comercial", "Dra. Torres", "Corporativo Legal Global");


        Dominio case5 = new Dominio("CASE-005", "Derecho de Familia", "Dr. Rodriguez", "Familia & Ley Consultores");

        case1.showInfo();
        case2.showInfo();
        case3.showInfo();
        case4.showInfo();
        case5.showInfo();

    }
}
