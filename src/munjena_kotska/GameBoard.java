package munjena_kotska;

import hsa_ufa.Console;

import java.awt.Color;

public class GameBoard
{
	static final int SIZE_X = 800;
	static final int SIZE_Y = 800;

	static final int P_BOUNDS_X0 = 150;
	static final int P_BOUNDS_Y0 = 650;

	private static final int P_SPAWN_X = 475;
	private static final int P_SPAWN_Y = 750;

	public static Console C = new Console(800, 800, "Munjena Kotska");
	public static Player P = new Player(P_SPAWN_X, P_SPAWN_Y);

	/**
	 * Draws the background for the entire board.
	 */
	public static void drawBoard()
	{
		C.setColor(Color.BLACK);
		C.fillRect(0, 0, SIZE_X, SIZE_Y);
	}

	/**
	 * Draws the area in which the Player moves.
	 */
	public static void drawPlayableArea()
	{
		C.setColor(Color.LIGHT_GRAY);
		C.fillRect(P_BOUNDS_X0 + 1, P_BOUNDS_Y0, SIZE_X - P_BOUNDS_X0 - 1, SIZE_Y - P_BOUNDS_Y0 - 1);
		C.setColor(Color.GREEN);
		C.drawRect(P_BOUNDS_X0 + 1, P_BOUNDS_Y0, SIZE_X - P_BOUNDS_X0 - 2, SIZE_Y - P_BOUNDS_Y0 - 1);
	}

}