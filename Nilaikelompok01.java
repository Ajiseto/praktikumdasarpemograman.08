import java.util.Scanner;

public  class Nilaikelompok01 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Masukkan jumlah kelompok: ");
         int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai: ");
        int jumlahPenilaian = sc.nextInt();

        if (jumlahKelompok <= 0  || jumlahPenilaian <= 0){
            System.out.println("Jumlah kelompok dan jumlah penilaian harus > 0.");
        } else {
           int nomorkelompok =1;
           double rataterting = -1;
           int kelompokterbaik = 0;

           while (nomorkelompok <= jumlahKelompok) {
               System.out.println("Kelompok " + nomorkelompok);
               double totalNilai = 0;
               
               nomorkelompok++;
               for (int j =1; j <= jumlahPenilaian; j++){
                int nilai;
                do {
                    System.out.print(" nilai dari penilaian " + j + ": ");
                     nilai = sc.nextInt();
                    if (nilai < 0 || nilai > 100) {
                        System.out.println("Nilai harus antara 0-100. ulangi input.");
                    }
                } while (nilai < 0 || nilai > 100);
                totalNilai += nilai;
            }
            double ratanilai = totalNilai / jumlahPenilaian;
            System.out.println("kelompok " + nomorkelompok  + ": nilai rata-rata  " + ratanilai);

            if (ratanilai > rataterting) {
                rataterting = ratanilai;
                kelompokterbaik = nomorkelompok;
            }

            System.out.println("=========================");
            System.out.println("Kelompok terbaik  " + kelompokterbaik );
            System.out.println("Dengan rata-rata nilai: " + rataterting);
        }
    }
    sc.close();   
  }
}
