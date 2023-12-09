package SetB;

import java.io.*;

public class UpperTriangular {

	static void upper(int matrix[][], int row, int col) {
		int i, j;
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				if (i > j) {
					System.out.print("0" + " ");
				} else
					System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int row = 3, col = 3;

		System.out.println("Upper triangular matrix: ");
		upper(matrix, row, col);
	}
}
