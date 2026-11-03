import java.util.Scanner;

public class penilaiankelompoko1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahKelompok;
        int jumlahPenilai;

        System.out.print("Masukkan jumlah kelompok: ");
        jumlahKelompok = input.nextInt();
        System.out.print("Masukkan jumlah penilai: ");
        jumlahPenilai = input.nextInt();

        double rataRata;
        double totalNilai;
        double nilai;
        double rataTertinggi = -1;
        int kelompokTerbaik = 0;

        int kelompok = 1;

        while (kelompok <= jumlahKelompok) {
        System.out.println("\n=== KELOMPOK " + kelompok + " ===");

            totalNilai = 0;
            for (int penilai = 1; penilai <= jumlahPenilai; penilai++) {
                do {
                    System.out.print("Masukkan nilai penilai ke-" + penilai + " (0-100): ");
                    nilai = input.nextDouble();

                    if (nilai < 0 || nilai > 100) {
                        System.out.println("Nilai tidak valid! Masukkan nilai 0-100." );
                    }

                } while (nilai < 0 || nilai > 100);
                totalNilai += nilai;

            }

            rataRata = totalNilai / jumlahPenilai;
            System.out.println("Rata-rata Kelompok "  + kelompok + " = " + rataRata);
            if (rataRata > rataTertinggi) {
                rataTertinggi = rataRata;
                kelompokTerbaik = kelompok;
            }

            kelompok++;
        }

        System.out.println("\n===== HASIL PENILAIAN =====");
        System.out.println("Kelompok dengan rata-rata tertinggi: " + kelompokTerbaik);
        System.out.println("Nilai rata-rata tertinggi: " + rataTertinggi);
        input.close();
    }
}
