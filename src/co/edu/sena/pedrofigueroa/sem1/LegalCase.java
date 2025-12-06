package co.edu.sena.pedrofigueroa.sem1;
public class LegalCase {
    private String typocaso;
    private String numerocaso;
    private String abogado;


    public LegalCase(){

    }
    public LegalCase(String typocaso, String numerocaso, String abogado) {
        this.typocaso = typocaso;
        this.numerocaso = numerocaso;
        this.abogado = abogado;
    }

    public String getTypocaso() {
        return typocaso;
    }

    public void setTypocaso(String typocaso) {
        if (typocaso != null && !typocaso.isEmpty()) {
            this.typocaso = typocaso;
        } else {
            System.out.println("Error: El tipo de caso no puede estar vacío");
        }
    }

    public String getNumerocaso() {
        return numerocaso;
    }

    public void setNumerocaso(String numerocaso) {
        if (numerocaso != null && !numerocaso.isEmpty()) {
            this.numerocaso = numerocaso;
        } else {
            System.out.println("Error: El número de caso no puede estar vacío");
        }
    }

    public String getAbogado() {
        return abogado;
    }

    public void setAbogado(String abogado) {
        this.abogado = abogado;
    }

    public void showinfo() {
        System.out.println("EL TIPO DE CASO QUE SE ESTA EJECUTANDO ES: " + typocaso);
        System.out.println("CON EL NUMERO DE CASO: " + numerocaso);
        System.out.println("EL NOMBRE DEL ABOGADO ES: " + abogado);
        System.out.println("--------------------------------------------");
    }
}