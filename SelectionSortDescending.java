public class SelectionSortDescending {
    public static void main(String[] args) {
        int[] data = {20, 18, 25, 34, 6};

        System.out.println("Data sebelum sorting:");
        tampil(data);

        for (int i = 0; i < data.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = data[maxIndex];
            data[maxIndex] = data[i];
            data[i] = temp;
        }

        System.out.println("Data setelah sorting:");
        tampil(data);
    }

    static void tampil(int[] data) {
        for (int x : data) System.out.print(x + " ");
        System.out.println();
    }
}
