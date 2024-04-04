import java.util.Objects;

public class Department {
    Integer id;
    String registrationDepartment;
    String financeDepartment;
    String HumanResourceDepartment;
    String ITDepartment;
    String studentAffairsDepartment;
    String businessDepartment;
    String medicineDepartment;
    String scienceDepartment;
    String engineeringDepartment;
    String LiteratureDepartment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegistrationDepartment() {
        return registrationDepartment;
    }

    public void setRegistrationDepartment(String registrationDepartment) {
        this.registrationDepartment = registrationDepartment;
    }

    public String getFinanceDepartment() {
        return financeDepartment;
    }

    public void setFinanceDepartment(String financeDepartment) {
        this.financeDepartment = financeDepartment;
    }

    public String getHumanResourceDepartment() {
        return HumanResourceDepartment;
    }

    public void setHumanResourceDepartment(String humanResourceDepartment) {
        HumanResourceDepartment = humanResourceDepartment;
    }

    public String getITDepartment() {
        return ITDepartment;
    }

    public void setITDepartment(String ITDepartment) {
        this.ITDepartment = ITDepartment;
    }

    public String getStudentAffairsDepartment() {
        return studentAffairsDepartment;
    }

    public void setStudentAffairsDepartment(String studentAffairsDepartment) {
        this.studentAffairsDepartment = studentAffairsDepartment;
    }

    public String getBusinessDepartment() {
        return businessDepartment;
    }

    public void setBusinessDepartment(String businessDepartment) {
        this.businessDepartment = businessDepartment;
    }

    public String getMedicineDepartment() {
        return medicineDepartment;
    }

    public void setMedicineDepartment(String medicineDepartment) {
        this.medicineDepartment = medicineDepartment;
    }

    public String getScienceDepartment() {
        return scienceDepartment;
    }

    public void setScienceDepartment(String scienceDepartment) {
        this.scienceDepartment = scienceDepartment;
    }

    public String getEngineeringDepartment() {
        return engineeringDepartment;
    }

    public void setEngineeringDepartment(String engineeringDepartment) {
        this.engineeringDepartment = engineeringDepartment;
    }

    public String getLiteratureDepartment() {
        return LiteratureDepartment;
    }

    public void setLiteratureDepartment(String literatureDepartment) {
        LiteratureDepartment = literatureDepartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(registrationDepartment, that.registrationDepartment) && Objects.equals(financeDepartment, that.financeDepartment) && Objects.equals(HumanResourceDepartment, that.HumanResourceDepartment) && Objects.equals(ITDepartment, that.ITDepartment) && Objects.equals(studentAffairsDepartment, that.studentAffairsDepartment) && Objects.equals(businessDepartment, that.businessDepartment) && Objects.equals(medicineDepartment, that.medicineDepartment) && Objects.equals(scienceDepartment, that.scienceDepartment) && Objects.equals(engineeringDepartment, that.engineeringDepartment) && Objects.equals(LiteratureDepartment, that.LiteratureDepartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationDepartment, financeDepartment, HumanResourceDepartment, ITDepartment, studentAffairsDepartment, businessDepartment, medicineDepartment, scienceDepartment, engineeringDepartment, LiteratureDepartment);
    }

    @Override
    public String toString() {
        return "Department{" +
                "registrationDepartment='" + registrationDepartment + '\'' +
                ", financeDepartment='" + financeDepartment + '\'' +
                ", HumanResourceDepartment='" + HumanResourceDepartment + '\'' +
                ", ITDepartment='" + ITDepartment + '\'' +
                ", studentAffairsDepartment='" + studentAffairsDepartment + '\'' +
                ", businessDepartment='" + businessDepartment + '\'' +
                ", medicineDepartment='" + medicineDepartment + '\'' +
                ", scienceDepartment='" + scienceDepartment + '\'' +
                ", engineeringDepartment='" + engineeringDepartment + '\'' +
                ", LiteratureDepartment='" + LiteratureDepartment + '\'' +
                '}';
    }
}
