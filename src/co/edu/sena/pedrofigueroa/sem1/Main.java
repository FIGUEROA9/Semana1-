package co.edu.sena.pedrofigueroa.sem1;


public class Main {
    public static void main(String[] args) {
        LegalCase caso1 = new LegalCase("Civil", "C-001", "Carlos Pérez");
        LegalCase caso2 = new LegalCase("Penal", "P-155", "Laura Gómez");
        LegalCase caso3 = new LegalCase("Laboral", "L-320", "Andrés Torres");


        caso1.showinfo();
        caso2.showinfo();
        caso3.showinfo();


    }
}
