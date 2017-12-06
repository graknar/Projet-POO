import java.awt.Color;
import java.awt.Graphics;

public class Point implements Forme {
	private int x;		// abcisse
	private int y;		// ordonnée
	private Color coul;	// couleur
	
	public Point(int x, int y, Color coul) {
		this.x = x;
		this.y = y;
		this.coul = coul;
	}

	// Méthode de dessin dans un objet graphique g
	public void dessiner(Graphics g) {
        g.setColor(coul);
        g.drawRect(x,y,1,1);
        
	}

	public void deplacer(int X,int Y){
		x=X;
		y=Y;
	}
	public int getX(){return x;}
	public int getY(){return y;}
	
	public void setX(int x){
		this.x=x;
	}
	
	public void setY(int y){
		this.y=y;
	}
}