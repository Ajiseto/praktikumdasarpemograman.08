import java.util.Scanner;
public class Star3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jumlah baris:");
        int n = input.nextInt();
        System.out.println("Masukan jumlah kolom:");
        int m = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
