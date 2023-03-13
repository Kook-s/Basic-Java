package Homwork_11;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TetrisGame {
	private TetrisEngine controller;
	private SpaceGrid model;
	private TetrisView view;
	private JFrame jFrame;
	private int width;
	private int height;

	TetrisGame(int width, int height) {
		this.width = width;
		this.height = height;
		initMVC();
		initJFrame();
		new Thread(controller).start(); //JFrame 과 별도의 Thread로 Game loop 실행 
	}

	private void initMVC() {
		view = new TetrisView(width, height, SpaceGrid.GRID_WIDTH, SpaceGrid.GRID_HEIGHT);
		model = new SpaceGrid();
		controller = new TetrisEngine(model, view);
		// controller 는 view , model 정도를 모두 가짐 
	}

	private void initJFrame() {
		jFrame = new JFrame();
		jFrame.add(view);
		jFrame.pack();
		jFrame.setTitle("Tetris");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}

	public static void main(String[] argv) {
		new TetrisGame(400, 600);
	}
}