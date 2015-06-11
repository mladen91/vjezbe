package Vjezbe;

import java.util.Scanner;

public class ZagrijavanjeTask1 {

	public static void print2D(int[][] array, int column) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void insertInto2D(int[][] array) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Insert values for indexes ["+i+"] ["+j+"]");
				array[i][j]=in.nextInt();
			//	System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}
	

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Insert number of rows: ");
		int rows = in.nextInt();
		System.out.println("Insert number of columns: ");
		int columns = in.nextInt();

		int[][] array2D = new int[rows][columns];
		insertInto2D(array2D);
		print2D(array2D, columns);
		

	}

}
