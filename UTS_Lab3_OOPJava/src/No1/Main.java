package No1;
//Class: Class adalah sebuah blueprint atau cetak biru yang mendefinisikan atribut dan metode objek-objek dalam pemrograman berorientasi objek.
//
//Object: Objek adalah instance konkret yang dibuat dari sebuah class. Objek memiliki atribut dan metode yang sesuai dengan definisi class.
//
//Constructor: Constructor adalah metode khusus dalam class yang digunakan untuk menginisialisasi objek baru yang dibuat. Constructor dieksekusi saat objek dibuat.
//
//Method Overloading: Method overloading terjadi saat sebuah class memiliki beberapa metode dengan nama yang sama, tetapi memiliki parameter yang berbeda.
// Metode yang dieksekusi tergantung pada argumen yang diberikan saat pemanggilan.
//
//Method Setter dan Getter: Setter dan getter digunakan untuk mengubah dan mengambil nilai atribut objek. Setter mengubah nilai atribut, sedangkan getter mengambil nilai atribut.


//CONTOH CLASS >> Main
public class Main {
    public static void main(String[] args) {       
        Car car1 = new Car("Toyota", "Camry", 2021);
        Car car2 = new Car("Honda", "Civic", 2022, 25000);

        car1.setYear(2020);
        car1.setYear(1899); // Invalid year, will display error message
        car1.setYear(2025); // Invalid year, will display error message
        car2.setPrice(-5000); // Invalid price, will display error message

        String brand = car1.getBrand();
        double price = car2.getPrice();

        car1.displayInfo();
        car2.displayInfo(true);
    }
}
