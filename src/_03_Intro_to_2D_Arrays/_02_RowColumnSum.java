package _03_Intro_to_2D_Arrays;

public class _02_RowColumnSum {

	public int getSumByRow(int[][] matrix, int row) {
		// {10, 20, 30
		// 80, -10, 100
		// 75, -25, -50}
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[row][i];
		}
		return sum;

	}

	public int getSumByColumn(int[][] matrix, int col) {
		int add = 0;
		for (int i = 0; i < matrix.length; i++) {
			add += matrix[i][col];
		}

		return add;
	}
}
