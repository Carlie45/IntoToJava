package com.edynamix.learning.intro_to_java.chapter7;

import java.util.Scanner;

public class Task11_MaxSumInSubmatrix {

	private static int[][] readMatrix(Scanner sc, int n, int m) {
		int[][] matrix = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("matrix[%d][%d] = ", n, m);
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}
	
	private static boolean isSubmatrixAvailableWithCentralElement(int row, int col, int n, int m) {
		if (row - 1 >= 0 && row + 1 < n && col - 1 >= 0 && col + 1 < m) {
			return true;
		}
		return false;
	}
	
	private static int sumOfSubmatrix(int[][] fullArr, int centralElemRow, int centralElemCol) {
		int sum = 0;
		for (int i = centralElemRow - 1; i <= centralElemRow + 1; i++) {
			for (int j = centralElemCol - 1; j <=centralElemCol + 1; j++) {
				sum += fullArr[i][j];
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = sc.nextInt();
		
		System.out.print("m = ");
		int m = sc.nextInt();
		
		if (n < 3 || m < 3) {
			System.err.println("Invalid matrix dimensions.");
		}
		
		// TODO replace the example matrix with the read method above.
		int[][] matrix = {	{1, 20, 19, 18, 17, 16},
							{2, 21, 32, 31, 30, 15},
							{3, 22, 33, 36, 29, 14},
							{4, 23, 34, 35, 28, 13},
							{5, 24, 25, 26, 27, 12},
							{6, 7, 8, 9, 10, 11}};
		
		
		// We will identify the submatrix by its central element.
		int currentSubMatrixSum = 0;
		int maxSubmatrixSum = 0;
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (isSubmatrixAvailableWithCentralElement(i, j, n, m)) {
					currentSubMatrixSum = sumOfSubmatrix(matrix, i, j);
					if (currentSubMatrixSum > maxSubmatrixSum) {
						maxSubmatrixSum = currentSubMatrixSum;
					}
				}
			}
		}
		
		System.out.println("Max sum of submatrix: " + maxSubmatrixSum);
	}

}
