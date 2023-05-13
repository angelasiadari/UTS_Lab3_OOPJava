package No1;

    import java.util.Scanner;

    public class Car {
        private String brand;
        private String model;
        private int year;
        private double price;
        private Scanner scanner;

        // Constructor>> brand, model, and year
        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            scanner = new Scanner(System.in);
        }

        // Constructor>> brand, model, year, and price
        public Car(String brand, String model, int year, double price) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.price = price;
            scanner = new Scanner(System.in);
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

        // Getter & Setter untuk year
        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            if (year >= 1900 && year <= getCurrentYear()) {
                this.year = year;
            } else {
                System.out.println("Tahun tidak valid.");
            }
        }

        // Getter & Setter untuk price
        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            if (price > 0) {
                this.price = price;
            } else {
                System.out.println("Harga harus positif.");
            }
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

        private int getCurrentYear() {
            return 2023;
        }
    }
