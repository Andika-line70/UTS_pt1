public class BubbleSort {
    public static void main(String[] args) {
        int[] nilai = {78, 82, 75, 88, 90, 84, 79, 85, 87, 80};
        int temp;

        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        System.out.println("Hasil Bubble Sort:");
        for (int n : nilai) {
            System.out.print(n + " ");
        }
    }
}
