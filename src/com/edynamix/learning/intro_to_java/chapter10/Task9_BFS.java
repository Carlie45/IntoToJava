package com.edynamix.learning.intro_to_java.chapter10;

import java.util.LinkedList;

public class Task9_BFS {
	
	public static class Elem {
		
		int i,j;
		
		public Elem(int i, int j) {
			this.i = i;
			this.j = j;
		}

		public String toString() {
			return "Elem [i=" + i + ", j=" + j + "]";
		}
			
	}
	
	
	private static LinkedList<Elem> queue = new LinkedList<>();
	
	private static void findPathWithBFS(int currentI, int currentJ, char[][] lab) {
		if (currentI < 0 || currentI >= lab.length || currentJ < 0 || currentJ >= lab[0].length || lab[currentI][currentJ] == '*') {
			return;
		}
		
		lab[currentI][currentJ] = '*';
		queue.add(new Elem(currentI, currentJ));
		
		while (!queue.isEmpty()) {
			Elem el = queue.poll();
			System.out.println(el.i + " " + el.j);
			if (lab[el.i][el.j] == 'e') {
				System.out.println("found");
				return;
			}
			
			for (int i = el.i - 1; i <= el.i + 1; i++) {
				for (int j = el.j - 1; j <= el.j + 1; j++) {
					if (i >= 0 && j >= 0 && i < lab.length && j < lab[0].length && ((Math.abs(el.i - i) == 1) ^ (Math.abs(el.j - j) == 1))) {
						if (lab[i][j] == 'e') {
							System.out.println("found");
							return;
						}
						
						if (lab[i][j] != '*') {
							queue.add(new Elem(i, j));
							lab[i][j] = '*';
						}
					}
				}
			}
		}
				

	}
	
	private static void printPath() {
		while(!queue.isEmpty()) {
			Elem e = queue.pop();
			System.out.print(e.i + " " + e.j);
		}
	}

	public static void main(String[] args) {
		char[][] lab = {
			    {' ', ' ', ' ', '*', ' ', ' ', ' '},
			    {'*', '*', ' ', '*', ' ', '*', ' '},
			    {' ', ' ', ' ', ' ', ' ', ' ', ' '},
			    {' ', '*', '*', '*', '*', '*', ' '},
			    {' ', ' ', ' ', ' ', ' ', ' ', 'e'},
			};

		findPathWithBFS(0, 0, lab);
	}

}
