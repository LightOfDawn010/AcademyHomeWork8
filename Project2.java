package HomeWorkOfLecture8;
public class Project2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5, 2};
        System.out.print("პირველადი სახე :");
        printArray(arr);
        System.out.print("მაგიის შემდეგ :");
        printArray(changeAlone(arr));

    }
    private static int[] changeAlone(int[] arr) {
        for (int i = 0; i <= arr.length - 3; i++) {
            if (checkIsAlone(arr[i], arr[i + 1], arr[i + 2])) {
                arr[i + 1] = checkMaxNumber(arr[i], arr[i + 1], arr[i + 2]);

            }
        }
        return arr;
    }
    private static boolean checkIsAlone(int a, int b, int c) {
        if (b != a || b != c) return true;
        return false;
    }

    private static int checkMaxNumber(int firstNum, int secondNum, int thirdNum) {
        {
            if (firstNum >= secondNum && firstNum >= thirdNum) {
                return firstNum;
            } else if (secondNum >= firstNum && secondNum >= thirdNum) {
                return secondNum;
            } else
                return thirdNum;
        }
    }
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
}
