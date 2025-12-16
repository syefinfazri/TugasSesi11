public class SelectionSortCount {
    public static void main(String[] args) {
        int[] data = {20, 18, 25, 34, 6};
        int compare = 0;
        int swap = 0;

        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                compare++;
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = data[min];
                data[min] = data[i];
                data[i] = temp;
                swap++;
            }
        }

        System.out.println("Total perbandingan: " + compare);
        System.out.println("Total swap: " + swap);
    }
}
