package org.example;

public class Pencil {
    private String color;
    private String size;
    private String brand;
    private int load;

    private boolean cap;

    public Pencil(String color, String size, String brand) {
        this.color = color;
        this.size = size;
        this.brand = brand;
    }

    public void RefillChange(String color) {
        load = 100;
        this.color = color;
    }
    public String Write(String text) {
        if (this.load > 1) {
            this.load -= 1;
            return text;
        }
        return "";
    }
    public void Cover() {
        this.cap = true;
    }
    public void Uncover() {
        this.cap = false;
    }



}
