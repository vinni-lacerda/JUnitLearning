package org.example;

public class LocalizationData {
    private String state;
    private String city;
    private String publicPlace;
    private String complement;
    private String neighborhood;

    public LocalizationData(String state, String city, String publicPlace, String complement, String neighborhood) {
        this.state = state;
        this.city = city;
        this.publicPlace = publicPlace;
        this.complement = complement;
        this.neighborhood = neighborhood;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public String getComplement() {
        return complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }
}
