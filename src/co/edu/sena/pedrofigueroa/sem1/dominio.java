package co.edu.sena.pedrofigueroa.sem1;

public class Dominio{
    private String caseId;
    private String caseType;
    private String lawyerName;
    private String lawFirm;

    public Dominio(){

    }
    public Dominio(String caseId, String caseType, String lawyerName, String lawFirm){

        this.caseId = caseId;
        this.caseType = caseType;
        this.lawyerName = lawyerName;
        this.lawFirm = lawFirm;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        if (caseId != null && !caseId.isEmpty()) { // validación
            this.caseId = caseId;
        } else {
            System.out.println("Error");
        }
    }


    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getLawyerName() {
        return lawyerName;
    }

    public void setLawyerName(String lawyerName) {
        this.lawyerName = lawyerName;
    }

    public String getLawFirm() {
        return lawFirm;
    }

    public void setLawFirm(String lawFirm) {
        this.lawFirm = lawFirm;
    }


    public void showInfo() {
        System.out.println("Caso: " + caseId);
        System.out.println("Tipo: " + caseType);
        System.out.println("Abogado: " + lawyerName);
        System.out.println("Firma: " + lawFirm);
        System.out.println("------------------------");
        System.out.println("------------------------");
    }

}

