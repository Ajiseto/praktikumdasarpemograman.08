Name : adjie seto hidayatullah
Nim  : 264107020225
Class: TI-1i

## 1: OBJECTIVE

• Understand the concept of nested loops in algorithms
• Understand the flow of nested loops
• Recognize the syntax of nested loops
• Be able to apply nested loops to solve a simple case study.

---

## 2: Practicum

### 2.1 Experiment 1: 
```java
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
```
#### 2.1.2 Execution Result / Screenshot Output
![Case study results](<Screenshot 2026-11-03 230212.png>)
#### 2.1.3 Answers to Questions / Reflection Questions

1. If the initialization i = 1 is changed to i = 0 without changing the condition, how many
* characters are printed when n = 5? Explain.
When the initialization is changed to int i = 0 while the condition remains i <= n where n = 5, the loop counter i takes the values 0, 1, 2, 3, 4, and 5. Because the counting starts from 0 instead of 1, the loop executes a total of 6 times, resulting in 6 printed asterisks.
2. If the condition i <= n is changed to i < n, how many times does the loop run when
n = 5? Why is the result different?
The < (less than) operator is exclusive, meaning the boundary value n (5) is not included in the execution. The loop will only run when i is 1, 2, 3, and 4. In contrast, the original code uses the <= (less than or equal to) operator, which includes the value of 5 and allows the loop to run a full 5 times.
3. Predict the output of the following code fragment when n = 9, then verify it by replacing
the FOR loop in your program and running it.
for (int i = 2; i <= n; i += 2) {
 System.out.print(i + " ");
}
The loop starts at i = 2 and increments by 2 in each iteration (i += 2). The successive values of i are 2, 4, 6, and 8. When i becomes 10, the condition 10 <= 9 becomes false, causing the loop to terminate.

for (int i = 1; i <= n; i += 2) {
    System.out.print(i + " ");
}
If (n = 9), this modified code will produce the output: 1 3 5 7 9

Modify this code so that it prints the odd positive numbers that do not exceed n.
4. Explain why changing the increment i++ to i-- (with the condition still i <= n) makes
the loop run endlessly, so that it does not stop in a reasonable time for positive n. Do not
run that version; if it has already started running, stop the program by pressing Ctrl + C
in the terminal.
 If the increment i++ is replaced with the decrement i--, the value of i (which starts at 1) will continually decrease at the end of each iteration (becoming 0, -1, -2, -3, and so on).

### 2.1 Experiment 2: 

#### 2.1.1 Program Code Java
```java
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

```
#### 2.1.2 Execution Result / Screenshot Output
![Case study results](<Screenshot 2026-11-03 230223.png>)

#### 2.1.3 Answers to Questions / Reflection Questions
1. Explain the function of the variables i and j in the program.
• Variable i: Acts as the loop control variable for the outer loop. It keeps track of the current row being processed.
• Variable j: Acts as the loop control variable for the inner loop. It keeps track of the current column (the number of asterisks printed) within each row.
2. How many times are the outer loop, the inner loop, and the statement print("*")
executed for rows = 4 and columns = 7?
• Outer loop body: Executes 4 times (once for each row).
• Inner loop entry: Executes 4 times (the inner loop starts fresh for every row).
• System.out.print("*") statement: Executes 28 times 4  rows times 7 textcolumn = 28.
3. What happens if the bounds of the outer and inner loops are swapped (the outer loop
uses columns and the inner loop uses rows)? Use rows = 3 and columns = 6 to explain.
rows = 3, columns = 6: Originally, the code prints 3 rows of 6 asterisks 3 x 6. If swapped, the outer loop runs 6 times and the inner loop runs 3 times. This results in 6 rows containing 3 asterisks each 6 x 3.
4. Explain the effect of removing System.out.println(); after the inner loop.
•  Every single asterisk will be printed sequentially side-by-side on one continuous line (e.g., for a 3 x 5input, it would print *************** instead of a block).
5. Modify the 
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}


### 2.2 Experiment 3:

#### 2.1.1 Program Code Java
```java
import java.util.Scanner;                                               
public class Star02 {
 public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 System.out.print("masukan nilai n = ");
 int n = sc.nextInt();
 
 
    int i = 0;
        while (i <= n) {
        int j = 0;
            while (j < i) {
              System.out.print("*");
         j++;
     }
      System.out.println();
    i++;
    }
    sc.close();
    }
}

```
#### 2.2.2 Execution Result / Screenshot Output
![Case study results](<Screenshot 2026-11-03 230237.png>)
#### 2.2.3 Answers to Questions / Reflection Questions
1. Identify the mismatches in the initial output, and at least two fixes needed to produce a
nested triangle pattern.
The initial output has several mismatches:
- The first row (i = 0) does not print any stars.
- The output includes unnecessary labels ([i=...]) that make the triangle pattern less clear.
- The triangle starts from zero stars instead of one star.
The fixes needed are:
1 Change the outer loop initialization from i = 0 to i = 1.
2 Remove the debugging text System.out.print("[i=" + i + "] ");.
3 Keep the inner loop condition j < i to print the correct number of stars in each row.
2. Explain the roles of the variables i and j. Why must the value of j be reset to 0 in every
iteration of the outer loop? What happens if j is not reset?
- Variable i controls the outer loop and represents the current row of the triangle.
- Variable j controls the inner loop and determines how many stars (*) are printed in each row.
The value of j must be reset to 0 every time the outer loop starts a new iteration because each row needs to start counting from zero.
If j is not reset, the inner loop will not execute correctly because the previous value of j may already exceed the condition. As a result, the stars will not be printed properly, and the triangle pattern will be incorrect.

3. Explain the changes to the initialization, the condition, and the update of the outer loop
that are needed to form the inverted triangle.
o create an inverted triangle, the outer loop must start from the largest number and count down to 1.

The changes are:
1. Initialization: Change int i = 0 to int i = n so the loop starts from the largest row.
2. Condition: Change i <= n to i >= 1 so the loop continues until i reaches 1.
3. Update: Change i++ to i-- so the number of rows decreases in each iteration.
```java
import java.util.Scanner;

public class Star02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = n;

        while (i >= 1) {
            int j = 0;

            while (j < i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i--;
        }

        sc.close();
    }
}
```

### 2.2 Experiment 4: 

#### 2.2.1 Program Code Java
```java
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

```
#### 2.2.2 Execution Result / Screenshot Output
![Case study results](<Screenshot 2026-11-03 230342.png>)
![Case study results](<Screenshot 2026-11-03 230427.png>)
#### 2.2.3 Answers to Questions / Reflection Questions
1. Why must totalScore be reset inside the outer loop, but highestAverage must not
be reset for each group?
• totalNilai (Total Score): Must be reset to 0 inside the outer loop so each group starts with a clean slate. If it is not reset, scores from previous groups will carry over, causing an incorrect and inflated total for subsequent groups.
• rataTertinggi (Highest Average): Must not be reset because its purpose is to keep track of the absolute highest average among all groups from the beginning to the end of the program. Resetting it would clear the memory of the highest score found so far.

2. For 3 groups and 2 graders (without any invalid input), how many times is the body of the
FOR loop executed in total?
• The outer while loop runs for each group: 3 times.
• The middle for loop runs for each grader within each group: 2 times.
• Total Executions: 3 groups × 2 graders = 6 times.

3. What happens if totalScore is declared as int and the average is calculated using
integer division? Give an example of values.
If totalNilai is declared as an int, dividing it by jumlahPenilai (which is also an int) results in integer division. This throws away the decimal portion (truncation), leading to inaccurate averages.
• Example:
	• Total Score (totalNilai) = 175
	• Number of Graders (jumlahPenilai) = 2
	• Expected result: 175 / 2 = 87.5
	• Actual integer division result: 175 / 2 = 87 (The .5 is lost).


4. Why is highestAverage given the initial value -1 rather than 0? Give an example of
input that produces a wrong result if the initial value were 0.
Initializing rataTertinggi to -1 ensures that a valid average of 0 is still recognized as a new highest score (0 > -1).
• Wrong Result Example if Initial Value is 0:
	• Suppose there is 1 group evaluated by 1 grader, and the grader inputs a score of 0.
	• The calculated rataRata will be 0.
	• The program checks: if (rataRata > rataTertinggi) \(\rightarrow \) if (0 > 0), which is false.
	• Because it is false, kelompokTerbaik remains 0 instead of updating to 1. The final summary will incorrectly report that group 0 is the best group with an average of 0.

5. This program has three levels of loops. Name each type of loop and its role.
• Outer Loop (while loop):
	• Role: Iterates through each team or group sequentially until all groups (jumlahKelompok) have been evaluated.
• Middle Loop (for loop):
	• Role: Controls the fixed number of iterations needed to collect a score from every grader (jumlahPenilai) for the current group.
• Inner Loop (do-while loop):
	• Role: Handles input validation. It continuously prompts the user until a valid score between 0 and 100 is provided

---

## 3: ASSIGNMENT

 
#### 3.1.1 Program Code Java
```java
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
```
#### 3.1.2 Execution Result / Screenshot Output



#### Task 2: 

```java
import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        
        do {
            System.out.print("Masukkan nilai n = ");
            n = input.nextInt();

            if (n < 3) {
                System.out.println("n minimal harus 3!");
            }
        } while (n < 3);

        int jumlah = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                int hasil = i * j;

                System.out.printf("%4d", hasil);

                jumlah += hasil;
            }

            System.out.println();
        }
        System.out.println("Jumlah seluruh angka: " + jumlah);

        input.close();
    }
}
```


#### 3.2.1 Program Code Java
```java
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

```

#### 3.1.2 Execution Result / Screenshot Output


---


