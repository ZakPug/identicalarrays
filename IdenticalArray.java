//Zakwan Berlin

import java.util.Scanner;

public class IdenticalArray {

    public static void main(String[] args) {
        // Prompt the user to enter two 3x3 arrays
        System.out.println("Enter the first 3x3 array:");
        int[][] m1 = enterMatrix();

        System.out.println("Enter the second 3x3 array:");
        int[][] m2 = enterMatrix();

        // Check if the arrays are the same, display the result
        if (areIdentical(m1, m2)) {
            System.out.println("The two arrays are identical.");
        } else {
            System.out.println("The two arrays are not identical.");
        }
    }

    public static boolean areIdentical(int[][] m1, int[][] m2) {
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            return false; // Arrays are different , not identical try again.
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false; //Arrays are different , not identical try again.
                }
            }
        }

        return true; // Arrays are identical.
    }

    public static int[][] enterMatrix() {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                matrix[i][j] = input.nextInt();
            }
        }
      input.close(); // Close the Scanner object

        return matrix;
    }
}
