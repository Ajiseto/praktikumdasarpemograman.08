import java.util.Scanner;

public class tugas01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        do {
            System.out.print("Masukkan nilai n = ");
            n = input.nextInt();
            if (n < 1) {
                System.out.println("n minimal harus 1!");
            }
        } while (n < 1);
        int total = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                total++;
            }

            System.out.println();
        }
        System.out.println("Total angka tercetak: " + total);

        input.close();
    }
}

