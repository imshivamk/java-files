import java.util.Scanner;

public class moveZeroesToEnd {
    public static void main(String[] args) {
        int[] array = new int[5];
        userInput(array);
        showArray(array);
        moveZeroesToEnd(array);
        showArray(array);
    }

    public static void moveZeroesToEnd(int[] array) {
        int n = array.length;
        // Move all non-zero elements to the front
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                array[index] = array[i];
                index++; // maintains the index of non zero elements
            }
        }
        // Fill the remaining elements with zero
        while (index < n) {
            array[index] = 0;
            index++;
        }
    }

    public static void userInput(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static void showArray(int[] array) {
        System.out.println("The elements are:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
