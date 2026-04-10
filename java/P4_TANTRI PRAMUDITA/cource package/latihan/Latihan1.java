import java.util.Scanner;

public class Latihan1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        float realisasi, kehadiran, tugas, uts, uas, total;
        float b_kehadiran, b_tugas, b_uts, b_uas;

        // S1 Statement perintah
        System.out.print("Masukan realisasi : ");
        realisasi = input.nextFloat();
        System.out.print("Masukan kehadiran : ");
        kehadiran = input.nextFloat();
        System.out.print("Masukan tugas : ");
        tugas = input.nextFloat();
        System.out.print("Masukan UTS : ");
        uts = input.nextFloat();
        System.out.print("Masukan UAS : ");
        uas = input.nextFloat();

        // P1 Proses1
        b_kehadiran = (kehadiran / realisasi) * 10;
        b_tugas = tugas * 20 / 100;
        b_uts = uts * 30 / 100;
        b_uas = uas * 40 / 100;
        total = b_kehadiran + b_tugas + b_uts + b_uas;

        // S2 Statement informasi
        System.out.print("\n=== Hasil Perhitungan ===");
        System.out.print("Realisasi : " + realisasi);
        System.out.print("Kehadiran : " + kehadiran + " (Bobot: " + b_kehadiran + ")");
        System.out.print("Tugas : " + tugas + " (Bobot: " + b_tugas + ")");
        System.out.print("UTS : " + uts + " (Bobot: " + b_uts + ")");
        System.out.print("UAS : " + uas + " (Bobot: " + b_uas + ")");
        System.out.print("Total Nilai : " + total);

    }
}