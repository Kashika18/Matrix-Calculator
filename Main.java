package com.Kashika;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter the matrix 1");
        Scanner sc = new Scanner(System.in);
        Double a[][] = new Double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextDouble();
        }

        System.out.println("Enter the matrix 2");
        Double b[][] = new Double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                b[i][j] = sc.nextDouble();
        }

        Double result[][] = new Double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                result[i][j] = b[i][j] + a[i][j];
        }


        System.out.println("The matrices are added as follows:");

        Double[][][] matrices = {a,b, result };

        // print values for each i of each matrix
        for (int i = 0; i < 3; i++) {
            for (Double[][] matrix : matrices) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[i][j] + " ");
                }

                // print a +, =, or whitespace depending on
                // the current matrix and i
                if (i == 1) {
                    if (matrix == a) {
                        System.out.print(" +  ");
                    } else if (matrix == b) {
                        System.out.print(" =  ");
                    }
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println(); // new line for each i
        }
    }

}


