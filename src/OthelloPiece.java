import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class OthelloPiece extends JPanel {
private int posX, posY;
private boolean isBlack, isSet;//Boolean value for later to tell us if the piece should be movable or not.
	public OthelloPiece(int posX, int posY, boolean isBlack){
	this.posX = posX;
	this.posY = posY;
	this.isBlack = isBlack;
	isSet = false;
	}
	public OthelloPiece(boolean isBlack){
		this.isBlack = isBlack;
	}
	public void drawPiece(Graphics g){
		if(!isBlack){
			g.setColor(Color.BLACK);
			g.drawOval(posX + 1, posY + 1, 66, 66);
			g.drawOval(posX - 1, posY - 1, 69, 69);
			g.setColor(Color.WHITE);
			g.fillOval(posX, posY, 68, 68);
		}
		else if(isBlack){
			g.setColor(Color.WHITE);
			g.drawOval(posX + 1, posY + 1, 66, 66);
			g.drawOval(posX -1, posY - 1, 68, 68);
			g.setColor(Color.BLACK);
			g.fillOval(posX, posY, 67, 67);
		}
		else{
			throw(new IllegalArgumentException("Color must be either white or black"));
		}
	}
	public void setLocation(int x, int y){
		posX = x;
		posY = y;
	}
	public int getX(){
		return posX;
	}
	public int getY(){
		return posY;
	}
	public void changeColor(){
		isBlack = !isBlack;
	}
	public boolean isBlack(){
		return isBlack;
	}
	public boolean isSet(){
		return isSet;
	}
	public void setIsSet(){
		isSet = true;
	}
}
