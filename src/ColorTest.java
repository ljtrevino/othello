import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
 

public class ColorTest extends JPanel {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		ColorTest game = new ColorTest();
		frame.setLocation(200, 200);
		frame.setSize(500, 500);
		frame.add(game);
		frame.setVisible(true);
		frame.setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g;
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2D.setColor(new Color(0, 115, 0));
		g2D.fill3DRect(200, 200, 75, 75, false);
		g2D.setColor(new Color(0, 115, 0));
		g2D.fill3DRect(268, 200, 7, 75, true); //right border
		g2D.fill3DRect(195, 200, 7, 75, true); //left border
		g2D.fill3DRect(195, 268, 80, 7, true); //top border
		g2D.fill3DRect(195, 198, 80, 7, true); //bottom border
		
		
		for(int i = 0; i < 600; i += 75){
		for(int j = 0; j < 600; j += 75){
			g2D.fill3DRect(i+35,j+35, 75, 75, false);
			}//green grid background tiles
		}
		for(int i = 0; i < 663; i += 75){
		g2D.fill3DRect(i+30, 30, 7, 600, true);//column borders
		g2D.fill3DRect(30, i+30, 607, 7, true);//row borders
		}
		
		
		
		}


		
	}

