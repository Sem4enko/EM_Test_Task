import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipCounterTest {

	@Test
	void testShipCounter() {
		int[][] board = {
				{ 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 1, 0, 0, 0, 1, 1, 1 },
				{ 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 0, 1, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 0, 0, 0, 0, 1, 0, 0 },
				{ 1, 0, 1, 0, 0, 0, 0, 0, 0, 1 }
		};

		assertEquals(10, ShipCounter.countShips(board));
		assertEquals(9, ShipCounter.countShips(ShipCounter.ships));
	}

	@Test
	public void testCountShipsWithEmptyBoard() {
		int[][] board = {
				{ 0, 0, 0 },
				{ 0, 0, 0 },
				{ 0, 0, 0 }
		};

		int expected = 0;
		int actual = ShipCounter.countShips(board);

		assertEquals(expected, actual);
	}

	@Test
	public void testCountShipsWithFullBoard() {
		int[][] board = {
				{ 1, 1, 1 },
				{ 1, 1, 1 },
				{ 1, 1, 1 }
		};

		int expected = 1;
		int actual = ShipCounter.countShips(board);

		assertEquals(expected, actual);
	}

	@Test
	public void testCountShipsWithNull() {
		int expected = 0;
		int actual = ShipCounter.countShips(null);

		assertEquals(expected, actual);
	}
}