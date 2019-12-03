package com.company;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String town;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public void firstSearch(String s) {
        StringTokenizer st = new StringTokenizer(s, " .,;-");
        while(st.hasMoreTokens()) {
            country = st.nextToken();
            region = st.nextToken();
            town = st.nextToken();
            street = st.nextToken();
            house = st.nextToken();
            building = st.nextToken();
            apartment = st.nextToken();
        }
    }

    public void secondSearch(String str) {
        String[] array = str.split(", ", 7);

        country = array[0];
        region = array[1];
        town = array[2];
        street = array[3];
        house = array[4];
        building = array[5];
        apartment = array[6];
    }

    @Override
    public String toString() {
        return "Страна: " +country + "\nРегион: " + region +
                "\nГород: " + town + "\nУлица: " + street + "\nДом: " + house +
                "\nКорпус: " + building + "\nКвартира: " + apartment + "\n";
    }

}