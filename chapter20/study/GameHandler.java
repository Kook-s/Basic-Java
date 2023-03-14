package chapter20.study;
import javax.swing.JTextArea;

public class GameHandler {
	private final int SCREEN_WIDTH = 50;
	private final int SCREEN_HEIGHT = 25;
	private String[][] buffer;
	private JTextArea textArea;
	private boolean isGameOver;

	public GameHandler(JTextArea ta) {
		textArea = ta;
		buffer = new String[SCREEN_WIDTH][SCREEN_HEIGHT];
		isGameOver = false;
		clearBuffer();
	}

	public void clearBuffer() {
		for (int y = 0; y < SCREEN_HEIGHT; y++) {
			for (int x = 0; x < SCREEN_WIDTH; x++) {
				buffer[x][y] = " ";
			}
		}
	}

	public void drawToBuffer(int px, int py, String c) {
		buffer[px][py] = c;
	}

	public void drawGameOver() {
		isGameOver = true;
	}

	public boolean isGameOver() {
		return isGameOver;
	}

	public void drawAll() {
		StringBuilder sb = new StringBuilder();
		for (int y = 0; y < SCREEN_HEIGHT; y++) {
			for (int x = 0; x < SCREEN_WIDTH; x++) {
				sb.append(buffer[x][y]);
			}
			sb.append("\n");
		}
		textArea.setText(sb.toString());
	}
}
