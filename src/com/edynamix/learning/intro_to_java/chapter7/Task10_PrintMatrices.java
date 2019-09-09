package com.edynamix.learning.intro_to_java.chapter7;

import java.util.Arrays;

public class Task10_PrintMatrices {

	private static void printArray(int[][] arr) {
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
	}

	private static void printMatrixA(int n) {
		System.out.println("A:");
		int counter = 1;
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[j][i] = counter;
				counter++;
			}
		}
		printArray(arr);
	}

	private static void printMatrixB(int n) {
		System.out.println("B:");

		int[][] arr = new int[n][n];
		int counter = 1;
		int row = 0;
		int col = 0;
		boolean isGoingDown = true;
		while (counter <= n * n) {
			arr[row][col] = counter;

			if (isGoingDown) {
				if (row == n - 1) {
					col++;
					isGoingDown = false;
				} else {
					row++;
				}

			} else {
				if (row == 0) {
					col++;
					isGoingDown = true;
				} else {
					row--;
				}
			}
			counter++;
		}
		printArray(arr);
	}

	private static void printMatrixC(int n) {
		System.out.println("C:");
		final int LAST_ROW_OR_COL_IN_THE_MATRIX = n - 1;

		int[][] arr = new int[n][n];
		int counter = 1;
		int row = n - 1;
		int col = 0;
		int nextRow = n - 1;
		int nextCol = 1;
		boolean isSettingElementsBelowTheMainDiagonal = true;

		while (counter <= n * n) {
			arr[row][col] = counter;
			counter++;

			if (isSettingElementsBelowTheMainDiagonal) {
				if (row == LAST_ROW_OR_COL_IN_THE_MATRIX) {
					nextRow--;
					if (col == LAST_ROW_OR_COL_IN_THE_MATRIX) {
						isSettingElementsBelowTheMainDiagonal = false;
						row = 0;
						col = nextCol;
						continue;
					}
					row = nextRow;
					col = 0;
					continue;
				}
			} else {
				if (col == LAST_ROW_OR_COL_IN_THE_MATRIX) {
					nextCol++;
					row = 0;
					col = nextCol;
					continue;
				}
			}

			row++;
			col++;
		}
		printArray(arr);
	}

	private static int goDownAndReturnCounter(int steps, int[][] arr, int counter) {
		int row = rowOfLastElem + 1;
		for (int i = 0; i < steps; i++) {
			arr[row][colOfLastElem] = counter;
			counter++;
			row++;
		}
		rowOfLastElem = --row;

		return counter;
	}
	
	private static int goRightAndReturnCounter(int steps, int[][] arr, int counter) {
		int col = colOfLastElem + 1;
		for (int i = 0; i < steps; i++) {
			arr[rowOfLastElem][col] = counter;
			counter++;
			col++;
		}
		colOfLastElem = --col;

		return counter;
	}
	
	private static int goUpAndReturnCounter(int steps, int[][] arr, int counter) {
		int row = rowOfLastElem - 1;
		for (int i = 0; i < steps; i++) {
			arr[row][colOfLastElem] = counter;
			counter++;
			row--;
		}
		rowOfLastElem = ++row;

		return counter;
	}
	
	private static int goLeftAndReturnCounter(int steps, int[][] arr, int counter) {
		int col = colOfLastElem - 1;
		for (int i = 0; i < steps; i++) {
			arr[rowOfLastElem][col] = counter;
			counter++;
			col--;
		}
		colOfLastElem = ++col;

		return counter;
	}

	enum Direction {
		LEFT, RIGHT, UP, DOWN
	};
	
	private static int rowOfLastElem = -1;
	private static int colOfLastElem = 0;

	private static void printMatrixD(int n) {
		System.out.println("D:");

		int[][] arr = new int[n][n];
		int counter = 1;
		int steps = n;
		Direction nextDirection = Direction.DOWN;
		arr[0][0] = counter;
		
		while (counter <= n * n) {
			switch (nextDirection) {
			case DOWN: {
				counter = goDownAndReturnCounter(steps, arr, counter);
				nextDirection = Direction.RIGHT;
				steps--;
				break;
			}
			case RIGHT: {
				counter = goRightAndReturnCounter(steps, arr, counter);
				nextDirection = Direction.UP;
				break;
			}
			case UP: {
				counter = goUpAndReturnCounter(steps, arr, counter);
				nextDirection = Direction.LEFT;
				steps--;
				break;
			}
			case LEFT: {
				counter = goLeftAndReturnCounter(steps, arr, counter);
				nextDirection = Direction.DOWN;
				break;
			}
			}

		}
		printArray(arr);
	}

	public static void main(String[] args) {
		int n = 6;

		printMatrixA(n);
		printMatrixB(n);
		printMatrixC(n);
		printMatrixD(n);

	}

}
