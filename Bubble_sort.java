public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {78, 82, 75, 88, 90, 84, 79, 85, 87, 80};

        System.out.println("Data awal:");
        tampil(data);

        System.out.println("\nProses Bubble Sort:");

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }

            System.out.print("Iterasi " + (i + 1) + ": ");
            tampil(data);
        }

        System.out.println("\nHasil akhir:");
        tampil(data);
    }

    static void tampil(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
