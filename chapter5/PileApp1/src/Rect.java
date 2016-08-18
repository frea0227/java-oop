import java.awt.Color;
import java.awt.Graphics;

class Rect extends Figure {
	// 필드
	int width;
	int height;
	
	public Rect(int xv, int yv, int wid, int hgt) {
		super(xv, yv);
		width = wid;
		height = hgt;
	}
	
	// 메소드
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.clearRect(x, y, width, height);
		g.drawRect(x, y, width, height);
	}

	public boolean includes(int xv, int yv) {
		if (  (x < xv) && (x+width > xv)  ) {
			if (  (y < yv) && (y+height > yv)  ) {
				return true;
			}
		}
		return false;
	}
	
}
