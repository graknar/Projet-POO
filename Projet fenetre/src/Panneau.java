
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class Panneau extends JPanel { 
	private int posX=0;
	private int posY=0;
	
	public void paintComponent(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}

	public int getPosX(){
		return posX;
	}
	public int getPosY(){
		return posY;
	}
	
	public void setPosX(int posX){
		this.posX=posX;
	}
	public void setPosY(int posY){
		this.posY=posY;
	}
}
