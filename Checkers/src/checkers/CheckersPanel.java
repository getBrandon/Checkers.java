package checkers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class CheckersPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private int playBoard[][];
	private static final int BOARD_X = 8;
	private static final int BOARD_Y = 8;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 800;
	
	public CheckersPanel() {
		
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.GRAY);
		
		playBoard = new int[BOARD_X][BOARD_Y];
		
		addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				handleMouseClick(e);
			}
		});
		
		addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				handleMouseMove(e);
			}
		});
		
	}

	protected void handleMouseClick(MouseEvent e) {
		
		repaint();
	}
	
	protected void handleMouseMove(MouseEvent e) {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
	}
}