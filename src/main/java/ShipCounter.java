import org.apache.commons.lang3.ArrayUtils;

public class ShipCounter {
	static int[][] ships = {

			{0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 0, 0, 0, 1, 0, 0},
			{0, 1, 0, 1, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 1, 1, 0, 0, 1, 1, 1},
			{0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{1, 1, 1, 1, 0, 1, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{1, 1, 0, 0, 0, 0, 0, 1, 0, 0},
			{1, 1, 0, 0, 0, 0, 0, 0, 0, 1}

	};

	public static int countShips(int[][] board) {
		if (ArrayUtils.isEmpty(board)) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 1) {
					if (i == 0 || board[i - 1][j] == 0) {
						if (j == 0 || board[i][j - 1] == 0) {
							count++;
						}
					}
				}
			}
		}
		return count;
	}
}
