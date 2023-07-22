package com.ttt.tdd;

public class TicTacToe {

	private Character[][] board = { { '\0', '\0', '\0' }, { '\0', '\0', '\0' }, { '\0', '\0', '\0' } };

	public void play(int column, int row) {

		if (board[column - 1][row - 1] != '\0') {
			throw new RuntimeException("Field is occupied!");
		}
	}

}
