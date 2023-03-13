package Homwork_11;
import java.awt.*;
//abstract class for J, L, S, T, Z
public abstract class CurvedTetromino extends Tetromino {
	CurvedTetromino(int x, int y, Color color) {
		super(x, y, color);
	}

	@Override
	public boolean rotateSelf(Color[][] grid) {
		Point[] oldPoints = new Point[3];
		for (int i = 0; i < points.length; i++) {
			oldPoints[i] = new Point(points[i]);
		}

		for (Point point : points) {
			point.setLocation(-point.getY(), point.getX());
		}
		if (isValidPos(grid)) {
			return true;
		} else {
			this.points = oldPoints;
			return false;
		}
	}
}