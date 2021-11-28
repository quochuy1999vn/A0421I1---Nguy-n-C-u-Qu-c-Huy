package sortAlgorithm.bai_tap.install_insertion_sort_algorithm;

public class InsertionSort {
    static int[] list = {1, 9, 5, 6, 7, 8};

    public static void insertionSort(int[] list) {
        int length = list.length;
        for (int j = 1; j < length; j++) {
            int key = list[j];
            int i = j - 1;
            while ((i > -1) && (list[i] > key)) {
                list[i + 1] = list[i];
                i--;
            }
            list[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
