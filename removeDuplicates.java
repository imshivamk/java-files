import java.util.Scanner;

public class removeDuplicates {

    // main function
    public static void main(String[] args) {
        int[] array = new int[5];
        userInput(array);
        int size = array.length;
        showArray(array, size);
        size = removeDuplicates(array, size);
        showArray(array, size);
    }

    // remove the duplicates
    public static int removeDuplicates(int[] array, int size) {
        
        int i, j, k; // declared the loop index counters

        // run the outermost 'i' loop to check each and every element
        for (i = 0; i < size; i++) {
            // middle 'j' loop to check for duplicates
            for (j = i + 1; j < size; j++) {

                // checking duplicates
                if (array[i] == array[j]) {

                    // if duplicate found Shift elements to the left
                    for (k = j; k < size - 1; k++) {
                        // backward shifting to remove duplicate and 
                        //move other elements to left
                        array[k] = array[k + 1];
                    }
                    // decrease size so loop runs only till 
                    size--;
                    // Decrement j to check the new element at position j
                    j--; 
                }
            }
        }
        return size;
    }

    // take the user input
    public static void userInput(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
    }

    // print the array
    public static void showArray(int[] array, int size) {
        System.out.println("The elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
