//Java program for matrix multiplication using threads, where each thread multiplies one row of the resulting matrix.

import java.util.Scanner;
import java.lang.Thread;

public class ThreadedMatrixMultiplication {

    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);

        // Get input for rows and columns
        System.out.print("Enter the number of rows: ");
        int nRows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int nColumns = scanner.nextInt();

        // Initialize matrices
        int[][] matrixA = new int[nRows][nColumns];
        int[][] matrixB = new int[nRows][nColumns];
        int[][] resultMatrix = new int[nRows][nColumns];

        // Input values for matrices
        System.out.println("Enter values for Matrix A:");
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nColumns; j++) {
                System.out.printf("Enter element [%d,%d]: ", i + 1, j + 1);
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter values for Matrix B:");
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nColumns; j++) {
                System.out.printf("Enter element [%d,%d]: ", i + 1, j + 1);
                matrixB[i][j] = scanner.nextInt();
            }
        }
        
        /* Get number of threads
           System.out.print("Enter the number of threads: ");
           int numThreads = scanner.nextInt();*/
           
        // number of threads = number of rows
        int numThreads = nRows+1;
        
        // Create and start threads
        Thread[] threads = new Thread[nRows];
        for (int i = 0; i < nRows; i++) {
            final int row = i;
            threads[i] = new Thread(() -> multiplyRow(matrixA, matrixB, resultMatrix, row));
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print the result matrix
        System.out.println("Result matrix:");
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nColumns; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void multiplyRow(int[][] matrixA, int[][] matrixB, int[][] resultMatrix, int row) {
        for (int j = 0; j < matrixB[0].length; j++) {
            int sum = 0;
            for (int k = 0; k < matrixA[0].length; k++) {
                sum += matrixA[row][k] * matrixB[k][j];
            }
            resultMatrix[row][j] = sum;
        }
    }
}
