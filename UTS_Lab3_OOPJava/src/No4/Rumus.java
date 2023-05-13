package No4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rumus {
    private Scanner scanner;

    public Rumus() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Pilih jenis rumus:");
            System.out.println("1. [Matematika] Rumus Deret Geometri");
            System.out.println("2. [Fisika] Rumus Tekanan");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda (1/2/3): ");

            try {
                int pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        runGeometricSeriesFormula();
                        break;
                    case 2:
                        runPressureFormula();
                        break;
                    case 3:
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan angka.");
                scanner.nextLine(); // Membersihkan buffer
            }

            System.out.println();
        }

        scanner.close();
    }

    public void runGeometricSeriesFormula() {
        boolean repeat = true;

        while (repeat) {
            System.out.println("Rumus Deret Geometri");

            double sukuPertama = getValidDoubleInput("Masukkan suku pertama: ");
            double rasio = getValidDoubleInput("Masukkan rasio: ");
            int jumlahSuku = getValidIntInput("Masukkan jumlah suku: ");

            double hasilDeretGeometri = hitungDeretGeometri(sukuPertama, rasio, jumlahSuku);
            System.out.println("Hasil jumlah " + jumlahSuku + " suku Deret Geometri: " + hasilDeretGeometri);

            repeat = askForRepeat();
            System.out.println();
        }
    }

    public void runPressureFormula() {
        boolean repeat = true;

        while (repeat) {
            System.out.println("Rumus Tekanan");

            double gaya = getValidDoubleInput("Masukkan gaya (dalam Newton): ");
            double luasPermukaan = getValidDoubleInput("Masukkan luas permukaan (dalam meter pangkat dua): ");

            double tekanan = hitungTekanan(gaya, luasPermukaan);
            System.out.println("Tekanan: " + tekanan + " Pascal");

            repeat = askForRepeat();
            System.out.println();
        }
    }

    public double hitungDeretGeometri(double sukuPertama, double rasio, int jumlahSuku) {
        double hasil = sukuPertama * (1 - Math.pow(rasio, jumlahSuku)) / (1 - rasio);
        return hasil;
    }

    public double hitungTekanan(double gaya, double luasPermukaan) {
        double tekanan = gaya / luasPermukaan;
        return tekanan;
    }

    public boolean askForRepeat() {
        boolean valid = false;
        boolean repeat = false;

        while (!valid) {
            System.out.print("Apakah Anda ingin mengulang program? (y/n): ");
            String jawaban = scanner.next();

            if (jawaban.equalsIgnoreCase("y")) {
                valid = true;
                repeat = true;
            } else if (jawaban.equalsIgnoreCase("n")) {
                valid = true;
                repeat = false;
            } else {
                System.out.println("Input tidak valid. Masukkan 'y' untuk mengulang atau 'n' untuk keluar.");
            }
        }

        return repeat;
    }


    public double getValidDoubleInput(String message) {
        double input = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(message);

            try {
                input = scanner.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan angka.");
                scanner.nextLine();
            }
        }

        return input;
    }

    public int getValidIntInput(String message) {
        int input = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(message);

            try {
                input = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan angka.");
                scanner.nextLine();
            }
        }

        return input;
    }
}
