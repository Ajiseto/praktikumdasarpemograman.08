import java.util.Scanner;

public class Tugas03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahToko;

        
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = input.nextInt();

            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1!");
            }
        } while (jumlahToko < 1);

        int totalPelanggan = 0;
        int totalBarangSemua = 0;
        int tokoTerbanyak = 1;
        int barangTerbanyak = -1;
        int toko = 1;

        while (toko <= jumlahToko) {
            System.out.println("\n=== TOKO " + toko + " ===");
            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan: ");
                jumlahPelanggan = input.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah tidak boleh negatif!");
                }
            } while (jumlahPelanggan < 0);
            int totalBarangToko = 0;
            
            for (int p = 1; p <= jumlahPelanggan; p++) {

                int jumlahBarang;

                do {
                    System.out.print(
                        "Jumlah barang pelanggan ke-" + p + ": "
                    );
                    jumlahBarang = input.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println(
                            "Jumlah barang tidak boleh negatif!"
                        );
                    }
                } while (jumlahBarang < 0);

                totalBarangToko += jumlahBarang;
            }

            totalPelanggan += jumlahPelanggan;
            totalBarangSemua += totalBarangToko;
            System.out.println("Total pelanggan toko " 
                + toko + ": " + jumlahPelanggan);

            System.out.println("Total barang toko " 
                + toko + ": " + totalBarangToko);

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }

            toko++;
        }
        System.out.println("\n===== RINGKASAN PENJUALAN =====");
        System.out.println("Total pelanggan seluruh toko: "+ totalPelanggan);
        System.out.println("Total barang seluruh toko: " + totalBarangSemua);
        System.out.println("Toko dengan barang terbanyak: Toko "+ tokoTerbanyak);
        System.out.println("Jumlah barang terbanyak: " + barangTerbanyak);
        input.close();
    }

 {
    
 }
}