package No4;

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
            System.out.println();
        }

        scanner.close();
    }

    public void runGeometricSeriesFormula() {
        boolean repeat = true;

        while (repeat) {
            System.out.println("Rumus Deret Geometri");
            System.out.print("Masukkan suku pertama: ");
            double sukuPertama = scanner.nextDouble();
            System.out.print("Masukkan rasio: ");
            double rasio = scanner.nextDouble();
            System.out.print("Masukkan jumlah suku: ");
            int jumlahSuku = scanner.nextInt();

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
            System.out.print("Masukkan gaya (dalam Newton): ");
            double gaya = scanner.nextDouble();
            System.out.print("Masukkan luas permukaan (dalam meter pangkat dua): ");
            double luasPermukaan = scanner.nextDouble();

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
        System.out.print("Apakah Anda ingin mengulang program? (y/n): ");
        String jawaban = scanner.next();
        return jawaban.equalsIgnoreCase("y");
    }
}
