package medical_declaration.model;

public class MedicalDeclaration {
    private String name;
    private String yearOfDate;
    private String gender;
    private String nationality;
    private String identityCard;
    private String vehicle;
    private String departureDay;
    private String endDate;
    private String city;
    private String district;
    private String wards;
    private String phone;
    private String email;

    public MedicalDeclaration() {
    }

    public MedicalDeclaration(String name, String yearOfDate, String gender, String nationality, String identityCard, String vehicle, String departureDay, String endDate, String city, String district, String wards, String phone, String email) {
        this.name = name;
        this.yearOfDate = yearOfDate;
        this.gender = gender;
        this.nationality = nationality;
        this.identityCard = identityCard;
        this.vehicle = vehicle;
        this.departureDay = departureDay;
        this.endDate = endDate;
        this.city = city;
        this.district = district;
        this.wards = wards;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfDate() {
        return yearOfDate;
    }

    public void setYearOfDate(String yearOfDate) {
        this.yearOfDate = yearOfDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getDepartureDay() {
        return departureDay;
    }

    public void setDepartureDay(String departureDay) {
        this.departureDay = departureDay;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWards() {
        return wards;
    }

    public void setWards(String wards) {
        this.wards = wards;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
