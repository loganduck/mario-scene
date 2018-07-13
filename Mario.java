import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Literally this just draws the Mario scene.
 * @author LoganDuck
 * @version 07/12/18
 */
public class Mario extends JFrame {
	private static final long serialVersionUID = 1L;
	private static JLabel pipe;
	private static JLabel ground;
	
	public Mario() {
		Dimension d = new Dimension(700, 700);
		
		ground = new JLabel(new ImageIcon(Mario.class.getResource("/resources/ground.png")));
		add(ground);
		ground.setBounds(0, 625, 700, 55);
		
		getContentPane().setBackground(new Color(110, 170, 255));
		setLayout(null);
		setMinimumSize(d);
		setMaximumSize(d);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setUpBricks();
		
		/* PIPE IT UP */
		pipe = new JLabel(new ImageIcon(Mario.class.getResource("/resources/pipe.png")));
		add(pipe);
		pipe.setBounds(178, 540, 88, 89);
		setVisible(true);
	}

	
	public JLabel[] setUpBricks() {
		JLabel[] bricks = new JLabel[44];
		int x = 655;
		int y = 270;
		int width = 45;
		int height = 45;
		
		for (int i = 0; i < bricks.length; i++) {
			switch (i) {
			case 8:
				x -= 45;
				y = 270;
				break;
			
			case 16:
				x -= 45;
				y = 270 + (45) * 1;
				break;
				
			case 23:
				x -= 45;
				y = 270 + (45) * 2;
				break;
				
			case 29:
				x -= 45;
				y = 270 + (45) * 3;
				break;
				
			case 34:
				x -= 45;
				y = 270 + (45) * 4;
				break;
				
			case 38:
				x -= 45;
				y = 270 + (45) * 5;
				break;
				
			case 41:
				x -= 45;
				y = 270 + (45) * 6;
				break;
			
			case 43:
				x -= 45;
				y = 270 + (45) * 7;
				break;
			}			
			
			bricks[i] = new JLabel(new ImageIcon(Mario.class.getResource("/resources/brick.png")));
			add(bricks[i]);
			bricks[i].setBounds(x, y, width, height);
			y += 45;
		}
		return bricks;
	}
	
	public static void main(String[] args) {
		new Mario();
	}
}