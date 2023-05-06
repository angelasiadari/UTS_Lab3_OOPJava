package No2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repeat;

        do {
            System.out.print("Masukkan teks: ");
            String input = scanner.nextLine();

            System.out.println("Pilih opsi:");
            System.out.println("1. Reverse perhuruf");
            System.out.println("2. Reverse perkata");
            int choice = scanner.nextInt();
            scanner.nextLine();

            String reversedText = "";
            switch (choice) {
                case 1:
                    reversedText = reverseByCharacter(input);
                    break;
                case 2:
                    reversedText = reverseByWord(input);
                    break;
                default:
                    System.out.println("Opsi yang dimasukkan tidak valid");
                    return;
            }

            System.out.println("Hasil: " + reversedText);
            System.out.print("Apakah ingin mengulang program? (y/n): ");
            repeat = scanner.nextLine();
        } while (repeat.equalsIgnoreCase("y"));

        scanner.close();
    }

    public static String reverseByWord(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        return reversedSentence.toString().trim();
    }

    public static String reverseByCharacter(String text) {
        StringBuilder reversedText = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText.append(text.charAt(i));
        }
        return reversedText.toString();
    }
}

