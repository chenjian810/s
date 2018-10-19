package client111;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JMain {
	public static void main(String[] args) {
		JFrame j=new JFrame("»­Í¼");
		j.setSize(800, 800);
		MyPanel my=new MyPanel();
		j.add(my);
		j.addKeyListener(my);
		j.addMouseMotionListener(my);
		j.setVisible(true);
	}
}
class MyPanel extends JPanel implements KeyListener,MouseMotionListener{
	
	int x=20;
	int y=20;
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		//g.fillOval(x, y,300, 300);
		for(int i=0;i<5;i++) {
			g.drawOval(x+20*i, y,20, 20);	
		}
		
		//g.drawOval(x+20, y,20, 20);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			y-=20;
			repaint();
		}
		else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			y+=20;
			repaint();
		}
		else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			x-=20;
			repaint();
		}
		else  if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			x+=20;
			repaint();
		}
		else if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x=e.getX()-150;
		y=e.getY()-150;
		repaint();
	}
}
