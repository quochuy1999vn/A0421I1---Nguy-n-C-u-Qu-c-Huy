package caseStudy.models;

public abstract class Facility {
    private String idFacilily;
    private String nameServices;
    private double areaUse;
    private int rentalPrice;
    private int rentalPeopleMax;
    private String styleRental;

    public Facility() {
    }

    public Facility(String idFacilily, String nameServices, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental) {
        this.idFacilily = idFacilily;
        this.nameServices = nameServices;
        this.areaUse = areaUse;
        this.rentalPrice = rentalPrice;
        this.rentalPeopleMax = rentalPeopleMax;
        this.styleRental = styleRental;
    }

    public String getIdFacilily() {
        return idFacilily;
    }

    public void setIdFacilily(String idFacilily) {
        this.idFacilily = idFacilily;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getRentalPeopleMax() {
        return rentalPeopleMax;
    }

    public void setRentalPeopleMax(int rentalPeopleMax) {
        this.rentalPeopleMax = rentalPeopleMax;
    }

    public String getStyleRental() {
        return styleRental;
    }

    public void setStyleRental(String styleRental) {
        this.styleRental = styleRental;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idFacilily='" + idFacilily + '\'' +
                ", nameServices='" + nameServices + '\'' +
                ", areaUse=" + areaUse +
                ", rentalPrice=" + rentalPrice +
                ", rentalPeopleMax=" + rentalPeopleMax +
                ", styleRental='" + styleRental + '\'' +
                '}';
    }
}
