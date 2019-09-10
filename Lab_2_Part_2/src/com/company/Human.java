package com.company;

public class Human {
    private double weight;
    private double height;

    public  class Head {
        private String hairColor;

        Head(){
            hairColor = "NoColor";
        }

        public void setHairColor(String hairColor) {
            this.hairColor = hairColor;
        }

        public String getHairColor() {
            return hairColor;
        }
    }
    public  class Leg {
        private double size;

        Leg(){
            size = 0;
        }

        public void setSize(double size) {
            this.size = size;
        }

        public double getSize() {
            return size;
        }
    }

    public  class Hand {
        private double armLength;

        Hand(){
            armLength = 0;
        }

        public void setArmLength(double armLength) {
            this.armLength = armLength;
        }

        public double getArmLength() {
            return armLength;
        }
    }

    Human(){
        weight = 0;
        height = 0;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }

}
