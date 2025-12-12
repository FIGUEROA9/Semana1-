package src.co.edu.sena.pedrofigueroa.sem4;
public class PenalLawyer extends Abogado {

    private int casosGanados;
    private String riesgoCasos;

    public PenalLawyer() {
        super();
    }

    public PenalLawyer(String nombre, String email, int numeroCedula, int numeroLicencia, int añosExperiencia,
                       int casosGanados, String riesgoCasos) {
        super(nombre, email, numeroCedula, numeroLicencia, añosExperiencia);
        this.casosGanados = casosGanados;
        this.riesgoCasos = riesgoCasos;
    }

    public int getCasosGanados() {
        return casosGanados;
    }

    public void setCasosGanados(int casosGanados) {
        this.casosGanados = casosGanados;
    }

    public String getRiesgoCasos() {
        return riesgoCasos;
    }

    public void setRiesgoCasos(String riesgoCasos) {
        this.riesgoCasos = riesgoCasos;
    }
}