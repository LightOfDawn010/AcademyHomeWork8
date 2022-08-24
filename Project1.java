package HomeWorkOfLecture8;

public class Project1 {
    public static void main(String[] args) {
        int[] arr = {0, 4, 0, 3, 0, 2, 0, 1};
        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            if (arr[i] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] % 2 == 1 && arr[j] >= max) {
                        max = arr[j];
                    }
                }
                arr[i] = max;
            }
        }
        printArray(arr);
    }
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
}
