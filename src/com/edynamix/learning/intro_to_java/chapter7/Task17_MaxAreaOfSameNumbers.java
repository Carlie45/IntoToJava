package com.edynamix.learning.intro_to_java.chapter7;

public class Task17_MaxAreaOfSameNumbers {
	
	private static int getMaxAreaForCurrentElementAtIndex(int elemRow, int elemCol, int[][] arr, boolean[][] visited) {
		int elemAreaSize = 1;
		visited[elemRow][elemCol] = true;
		
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				int currentRow = elemRow + i;
				int currentCol = elemCol + j;
				if ((currentRow < 0 || currentRow >= arr.length || currentCol < 0 || currentCol >= arr[0].length)) {
					continue;
				}
				// We want at least one of the i or j to be 0, so that the current element would not be on diagonal to the current one.
				if (i * j == 0) {
					if (visited[currentRow][currentCol] == false && arr[elemRow][elemCol] == arr[currentRow][currentCol]) {
						elemAreaSize += getMaxAreaForCurrentElementAtIndex(currentRow, currentCol, arr, visited);
					}
				}
			}
		}
		
		return elemAreaSize;
	}
	
	public static void main(String[] args) {
		int[][] arr = { {1,3,2,2,2,4},
						{3,3,3,2,4,4},
						{4,3,1,2,3,3},
						{4,3,1,3,3,1},
						{4,3,3,3,1,1} };
		boolean[][] visited = new boolean[arr.length][arr[0].length];
		
		int maxAreaSize = 1;
		int currentElemArea = 1; 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (visited[i][j] == true) {
					continue;
				}
				currentElemArea = getMaxAreaForCurrentElementAtIndex(i, j, arr, visited);
				System.out.println(arr[i][j] + ": " + currentElemArea);
				maxAreaSize = Math.max(maxAreaSize, currentElemArea);				
			}
		}
		System.out.println("Max area of same elements: " + maxAreaSize);
	}

}
