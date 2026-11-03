import java.util.Scanner;

public class Star01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai n: ");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
             System.out.print("*");
            
        }
         System.out.println();
        input.close();
    }
}
