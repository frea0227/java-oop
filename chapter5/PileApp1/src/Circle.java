import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Figure {
	// 필드
	int radius;
	
	// 생성자
	Circle(int xv, int yv, int rv) {
		super(xv, yv);
		radius = rv;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.white);
		g.fillOval(x-radius, y-radius, radius * 2, radius * 2);
		g.setColor(color);
		g.drawOval(x-radius,  y-radius, radius * 2, radius * 2);
	}

	@Override
	public boolean includes(int xv, int yv) {
		// TODO Auto-generated method stub
		int distance = (int) Math.sqrt(  Math.pow((double)(xv-x), 2.0) + Math.pow((double)(yv-y), 2.0)  );
		if (distance <= radius) {
			return true;
		}
		return false;
	}

}
