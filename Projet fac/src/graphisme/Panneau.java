package graphisme;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class Panneau extends JPanel { 
	private int posX=-50;
	private int posY=-50;
	
	public void paintComponent(Graphics g){
		//Vous verrez cette phrase chaque fois que la méthode sera invoquée
		//System.out.println("Je suis exécutée !"); 
		/*int x1 = this.getWidth()/4;
    	int y1 = this.getHeight()/4;
    	g.fillOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
    	g.drawLine(x1, y1, 10, 15);
    	g.drawRect(10, 10, 50, 60);
    	g.fillRoundRect(100, 65, 100, 30, 10, 10);
    	g.drawString("Test.1.2. Test.1.2.", 0, this.getHeight()-10);
		g.drawOval(this.getWidth()/4,this.getHeight()/4,this.getWidth()/2, this.getHeight()/2);*/
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.BLUE);
		g.fillOval(posX, posY, 50, 50);
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
