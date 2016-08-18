import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FigureEditorApp extends Frame {
	public FigureManager theManager;
	public int choice = 1;		// 1 사각형, 2 원, 3 삭제
	
	public FigureEditorApp() {
		setSize(600, 500);
		setTitle("Figure Editor 응용");

		MouseKeeper mouse = new MouseKeeper();
		addMouseListener(mouse);
		
		KeyKeeper key = new KeyKeeper();
		addKeyListener(key);
		theManager = new FigureManager(15);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString("사각형(r)  원(c)  삭제(d)", 30, 70);
		theManager.display(g);
	}
	
	private class MouseKeeper implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			int x = e.getX();
			int y = e.getY();
			
			switch(choice) {
			case 1:
				Rect rect = new Rect(x, y, 70, 50);
				theManager.addFigure(rect);
				break;
			case 2:
				Circle circle = new Circle(x, y, 40);
				theManager.addFigure(circle);
				break;
			case 3:
				theManager.deleteFigure(x, y);
			}
			repaint();
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class KeyKeeper extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			char keyChar = e.getKeyChar();
			
			if (keyChar == 'r') {
				choice = 1;
			} else if (keyChar == 'c') {
				choice = 2;
			} else if (keyChar == 'd') {
				choice = 3;
			} else {
				System.out.println("입력오류!!");
			}
		}
		
	}
	
	
}
