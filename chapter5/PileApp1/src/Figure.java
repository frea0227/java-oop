import java.awt.Color;
import java.awt.Graphics;

public abstract class Figure {
	// 필드
	public int x;
	public int y;
	public Color color;
	
	// 생성자
	public Figure(int xv, int yv) {
		x = xv;
		y = yv;
		color = Color.blue;
	}
	
	// 메소드
	public void moveTo(int xv, int yv) {
		x = xv;
		y = yv;
	}
	
	// 추상 메소드
	public abstract void draw(Graphics g);
	
	public abstract boolean includes(int xv, int yv);

}
