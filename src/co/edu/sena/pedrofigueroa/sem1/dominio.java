class LegalCase {
    private String caseId;
    private String caseType;
    private String lawyerName;
    private String lawFirm;

    public LegalCase(String caseId, String caseType, String lawyerName, String lawFirm){

        this.caseId = caseId;
        this.caseType = caseType;
        this.lawyerName = lawyerName;
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

public class dominio {
    public static void main(String[] args) {

        LegalCase case1 = new LegalCase("CASE-001", "Derecho Laboral", "Dr. Martinez", "Bufete Justicia & Asociados");

        LegalCase case2 = new LegalCase("CASE-002", "Derecho Civil", "Dra. Lopez", "Legal Trust Group");

        LegalCase case3 = new LegalCase("CASE-003", "Derecho Penal", "Dr. Gomez", "Defensa Penal Elite");

        LegalCase case4 = new LegalCase("CASE-004", "Derecho Comercial", "Dra. Torres", "Corporativo Legal Global");


        LegalCase case5 = new LegalCase("CASE-005", "Derecho de Familia", "Dr. Rodriguez", "Familia & Ley Consultores");

        case1.showInfo();
        case2.showInfo();
        case3.showInfo();
        case4.showInfo();
        case5.showInfo();
    }

}