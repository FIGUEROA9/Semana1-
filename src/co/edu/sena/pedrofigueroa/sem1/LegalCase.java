package co.edu.sena.pedrofigueroa.sem1;
class LegalCase {
    private String typocaso;
    private String numerocaso;
    private String abogado;

    public LegalCase(String typocaso, String numerocaso, String abogado) {
        this.typocaso = typocaso;
        this.numerocaso = numerocaso;
        this.abogado = abogado;
    }

    public void showinfo() {
        System.out.println("EL TIPO DE CASO QUE SE ESTA EJECUTANDO ES: " + typocaso);
        System.out.println("CON EL NUMERO DE CASO: " + numerocaso);
        System.out.println("EL NOMBRE DEL ABOGADO ES: " + abogado);
        System.out.println("--------------------------------------------");
    }
}