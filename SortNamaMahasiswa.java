public class SortNamaMahasiswa {
    public static void main(String[] args) {
        String[] nama = {"Budi", "Andi", "Cindy", "Doni", "Eka"};

        System.out.println("Sebelum sorting:");
        tampil(nama);

        for (int i = 0; i < nama.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nama.length; j++) {
                if (nama[j].compareToIgnoreCase(nama[min]) < 0) {
                    min = j;
                }
            }
            String temp = nama[min];
            nama[min] = nama[i];
            nama[i] = temp;
        }

        System.out.println("Sesudah sorting:");
        tampil(nama);
    }

    static void tampil(String[] data) {
        for (String x : data) System.out.print(x + " ");
        System.out.println();
    }
}
