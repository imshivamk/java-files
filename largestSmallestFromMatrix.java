import java.util.Scanner;

public class largestSmallestFromMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 3x3 matrix elements:");
        for(int i = 0 ; i < 3; i++){
            for(int j  = 0; j < 3; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        int min, max;
        min = max = matrix[0][0];

        for(int i = 0 ; i < 3; i++){
            for(int j  = 0; j < 3; j++){
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }

                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        System.out.println("the largest element is : " + max);
        System.out.println("the smallest element is : " + min);

    }
    
}
