import java.util.Objects;

public class College {
    Integer id;
    String scienceCollege;
    String medicineCollege;
    String engineeringCollege;
    String economicCollege;
    String ITCollege;
    String literatureCollege;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScienceCollege() {
        return scienceCollege;
    }

    public void setScienceCollege(String scienceCollege) {
        this.scienceCollege = scienceCollege;
    }

    public String getMedicineCollege() {
        return medicineCollege;
    }

    public void setMedicineCollege(String medicineCollege) {
        this.medicineCollege = medicineCollege;
    }

    public String getEngineeringCollege() {
        return engineeringCollege;
    }

    public void setEngineeringCollege(String engineeringCollege) {
        this.engineeringCollege = engineeringCollege;
    }

    public String getEconomicCollege() {
        return economicCollege;
    }

    public void setEconomicCollege(String economicCollege) {
        this.economicCollege = economicCollege;
    }

    public String getITCollege() {
        return ITCollege;
    }

    public void setITCollege(String ITCollege) {
        this.ITCollege = ITCollege;
    }

    public String getLiteratureCollege() {
        return literatureCollege;
    }

    public void setLiteratureCollege(String literatureCollege) {
        this.literatureCollege = literatureCollege;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        College college = (College) o;
        return Objects.equals(scienceCollege, college.scienceCollege) && Objects.equals(medicineCollege, college.medicineCollege) && Objects.equals(engineeringCollege, college.engineeringCollege) && Objects.equals(economicCollege, college.economicCollege) && Objects.equals(ITCollege, college.ITCollege) && Objects.equals(literatureCollege, college.literatureCollege);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scienceCollege, medicineCollege, engineeringCollege, economicCollege, ITCollege, literatureCollege);
    }

    @Override
    public String toString() {
        return "College{" +
                "scienceCollege='" + scienceCollege + '\'' +
                ", medicineCollege='" + medicineCollege + '\'' +
                ", engineeringCollege='" + engineeringCollege + '\'' +
                ", economicCollege='" + economicCollege + '\'' +
                ", ITCollege='" + ITCollege + '\'' +
                ", literatureCollege='" + literatureCollege + '\'' +
                '}';
    }
}
