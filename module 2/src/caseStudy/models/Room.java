package caseStudy.models;

public class Room extends Facility{
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String idFacilily, String nameServices, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String freeServiceIncluded) {
        super(idFacilily, nameServices, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}
