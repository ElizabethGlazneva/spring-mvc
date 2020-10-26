package model;

public class Car {
    private String colorCar;
    private int numberCar;
    private int yearCar;

    public Car(String colorCar, int numberCar, int yearCar) {
        this.colorCar = colorCar;
        this.numberCar = numberCar;
        this.yearCar = yearCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public int getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(int numberCar) {
        this.numberCar = numberCar;
    }

    public int getYearCar() {
        return yearCar;
    }

    public void setYearCar(int yearCar) {
        this.yearCar = yearCar;
    }
}
