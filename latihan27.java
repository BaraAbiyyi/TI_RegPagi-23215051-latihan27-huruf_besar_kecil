package pertemuan5;
import java.util.Scanner;
public class latihan27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("run:\nMasukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        String hurufBesar = kalimat.toUpperCase();
        String hurufKecil = kalimat.toLowerCase();

        System.out.println("\nrun:\nMasukkan Kalimat: " + kalimat);
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar: " + hurufBesar);
        System.out.println("Huruf Kecil: " + hurufKecil);
        System.out.println("BUILD SUCCESSFUL (total time: 2 minut");
    }
}

