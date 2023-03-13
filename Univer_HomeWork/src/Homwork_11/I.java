package Homwork_11;
import java.awt.*;

public class I extends Tetromino {
	
	I(int x, int y, Color color) {
		super(x, y, color);
	}

	@Override
	public void initPoints() {
		this.points = new Point[] { new Point(-1, 0), new Point(-2, 0), new Point(1, 0) };
	}

@Override
// CurvedTetromino의 rotateSelf를 사용할 경우 4*4 크기 밖으로 나가는 문제가 발생하므로 별도로 함수 작성
public boolean rotateSelf(Color[][] grid) { 
	Point[] oldPoints = this.points.clone(); 
	if (oldPoints[0].getX() == (double) 0) {
//I가 세워져 있을 경우
this.points = new Point[] {
		new Point(-2, 0), new Point(-1, 0), new Point(1, 0) }; 
} else {
// I가 누워있을 경우
this.points = new Point[] { new Point(0, 2), new Point(0, -1), new Point(0, 1) }; 
}
if (isValidPos(grid)) { 
	return true;
} else {
this.points = oldPoints; 
return false;
} }
}