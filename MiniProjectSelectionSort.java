import java.util.Scanner;

class Mahasiswa {
    String nama;
    int nilai;

    Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
}

public class MiniProjectSelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();

        Mahasiswa[] mhs = new Mahasiswa[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Nilai: ");
            int nilai = sc.nextInt();
            sc.nextLine();
            mhs[i] = new Mahasiswa(nama, nilai);
        }

        // Selection Sort Descending
        for (int i = 0; i < n - 1; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (mhs[j].nilai > mhs[max].nilai) {
                    max = j;
                }
            }
            Mahasiswa temp = mhs[max];
            mhs[max] = mhs[i];
            mhs[i] = temp;
        }

        System.out.println("\n=== Ranking Mahasiswa ===");
        int total = 0;
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + mhs[i].nama + " - " + mhs[i].nilai);
            total += mhs[i].nilai;
        }

        System.out.println("Rata-rata nilai: " + (total / (double) n));

        System.out.println("\n=== 3 Mahasiswa Terbaik ===");
        for (int i = 0; i < Math.min(3, n); i++) {
            System.out.println(mhs[i].nama + " - " + mhs[i].nilai);
        }
    }
}
