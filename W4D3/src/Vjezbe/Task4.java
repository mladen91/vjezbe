package Vjezbe;

import java.util.Scanner;

public class Task4 {

	public static void Minesweeper() {

	}

	public static void insertInto2D(int[][] array) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = 0;
				array[i][j] = (int) (Math.random() * array.length);
			}
		}

		for (int i = 0; i < array.length; i++) {
			int j = (int) (Math.random() * array.length);
			array[i][j] = -1;
			array[j][i] = -1;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				int counter = 0;
				if (array[i][j] == -1) {
					if (j<array.length-1) {
					array[i][j + 1] = 1;
					}else if (j!=0) {
						array[i][j -1] = 1;
					}
					//array[i][j-1] =1;
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Which level do you want to play");
		int level = in.nextInt();
		int[][] matrix = new int[level][level];

		insertInto2D(matrix);

		ZagrijavanjeTask1.print2D(matrix, level);

	}

}
