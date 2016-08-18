import java.awt.Graphics;

public class FigureManager {
	// 상수, 필드
	final static int MAXFIGURES = 10;
	Figure[] theFigures;
	int count;
	int maxFigures;
	
	// 생성자
	public FigureManager() {
		theFigures = new Figure[MAXFIGURES];
		maxFigures = MAXFIGURES;
		count = 0;
	}
	
	public FigureManager(int max) {
		theFigures = new Figure[max];
		maxFigures = max;
		count = 0;
	}
	
	// 메소드
	public void addFigure(Figure aFigure) {
		if (count < maxFigures) {
			theFigures[count] = aFigure;
			count = count + 1;
		}
	}
	
	public Figure topFigure() {
		if (count > 0) {
			count = count - 1;
			return theFigures[count];
		}
		return null;
	}
	
	public void deleteFigure(int x, int y) {
		for (int i = count-1; i >= 0; i--) {

			if (theFigures[i].includes(x, y)) {

				for (int j=i; j<count-1; j++) {
					theFigures[j] = theFigures[j+1];
				}
				count = count -1;
				break;
			}
		}
	}
	
	public void display(Graphics g) {
		for (int i=0; i<count; i++) {
			theFigures[i].draw(g);
		}
	}

}
