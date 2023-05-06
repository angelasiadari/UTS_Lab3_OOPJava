package No1;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    // Constructor >> brand, model, and year
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Constructor >> brand, model, year, and price
    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Getter & Setter untuk brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter & Setter untuk model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter & Setter untuk Tahun
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter & Setter untuk Harga
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method overloading
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public void displayInfo(boolean includePrice) {
        displayInfo();
        if (includePrice) {
            System.out.println("Price: $" + price);
        }
    }

}

