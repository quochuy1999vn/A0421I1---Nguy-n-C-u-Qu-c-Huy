package caseStudy.models;

public class House extends Facility{
    private String standardHouse;
    private int floor;

    public House() {
    }

    public House(String idFacilily, String nameServices, double areaUse, int rentalPrice, int rentalPeopleMax,
                 String styleRental, String standardHouse, int floor) {
        super(idFacilily, nameServices, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardHouse = standardHouse;
        this.floor = floor;
    }

    public House(String standardHouse, int floor) {
        this.standardHouse = standardHouse;
        this.floor = floor;
    }

    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(String standardHouse) {
        this.standardHouse = standardHouse;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "standardHouse='" + standardHouse + '\'' +
                ", floor=" + floor +
                '}';
    }
}
