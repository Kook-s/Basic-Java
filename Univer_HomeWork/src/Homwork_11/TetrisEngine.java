package Homwork_11;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
// Tetris engine class which is the controller for Tetris MVC.
public class TetrisEngine implements Runnable {
	private SpaceGrid model;
	private TetrisView view;
	private long score;
	private int freeFallIterations; // 한칸씩 떨어질 때 마다 증가함

	public TetrisEngine(SpaceGrid model, TetrisView view) {
		this.model = model;
		this.view = view;
		score = 0;
		freeFallIterations = 0;
	}

// Main game loop
//Updates the grid for the view. Moves Tetromino if any. If none, creates new and updates score.
	@Override
	public void run() {
		boolean canMoveDown;
		boolean gameContinues = model.getNewTetromino();
		this.updateViewGrid();
		this.updateViewNextTetromino();
		long cycleStartTime = System.currentTimeMillis();

		while (gameContinues) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

			if ((System.currentTimeMillis() - cycleStartTime) >= 500) {
				if (model.hasTetromino()) {
					canMoveDown = model.moveTetrominoDown();
					if (!canMoveDown) {
//블록고정 
						this.placeTetromino();
					} else {
						freeFallIterations += 1;
					}
				} else {
					gameContinues = model.getNewTetromino();
					updateViewNextTetromino();
				}
				this.updateViewGrid();
				cycleStartTime = System.currentTimeMillis();
			} else {
				userActionHandler();
			}
		}
		view.setGameOver();
	}



//Method to update grid stored in view.
	private void updateViewGrid() {
		this.view.updateGrid(this.model.getGridWithTetromino());
	}

//Method to update next tetromino stored in view.
	private void updateViewNextTetromino() {
		this.view.updateNextTetrominoGrid(this.model.getNextTetrominoGrid());
	}

//Method to tell model to drop the tetromino and place tetromino if dropped.
	private void dropTetromino() {
		if (this.model.dropTetromino()) {
			placeTetromino();
		}
	}

//Method to place tetromino on main grid and update the view.
	private void placeTetromino() {
		this.model.placeTetromino();
		score = score + 100 * this.model.handleAllFilledRows();
		this.updateScore();
		this.updateViewGrid();
	}

//Method to tell model to move tetromino left and update view if moved.
	private void moveTetrominoLeft() {
		if (this.model.moveTetrominoLeft()) {
			this.updateViewGrid();
		}
	}

	private void moveTetrominoRight() {
		if (this.model.moveTetrominoRight()) {
			this.updateViewGrid();
		}

	}

	private void rotateTetromino() {
		if (this.model.rotateTetromino()) {
			this.updateViewGrid();
		}
	}

	private void updateScore() {
		this.score += 24 - freeFallIterations;
		freeFallIterations = 0;
		this.view.setScore(score);
	}

	private void userActionHandler() {
		int command = this.view.getLastCommand();
		switch (command) {
		case KeyEvent.VK_DOWN:
			this.dropTetromino();
			break;
		case KeyEvent.VK_LEFT:
			this.moveTetrominoLeft();
			break;
		case KeyEvent.VK_RIGHT:
			this.moveTetrominoRight();
			break;
		case KeyEvent.VK_UP:
			this.rotateTetromino();
			break;
		default:
			break;
		}
	}
}
