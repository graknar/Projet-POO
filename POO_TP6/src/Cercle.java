import java.awt.Color;
import java.awt.Graphics;


public class Cercle implements Forme{
	private int CentreX;		// abcisse
	private int CentreY;		// ordonnée
	private Color coul;	// couleur
	private int Rayon;

	public Cercle(int x, int y, Color coul,int rayon) {
		this.CentreX = x;
		this.CentreY= y;
		this.coul = coul;
		this.Rayon=rayon;
	}

	// Méthode de dessin dans un objet graphique g
	public void dessiner(Graphics g) {
        g.setColor(coul);
        g.fillOval(CentreX-Rayon,CentreY-Rayon,Rayon,Rayon);
	}
	
	public void setX(int X){
		CentreX=X;
	}
	
	public void setY(int Y){
		CentreY=Y;
	}
	
	public void deplacer(int X,int Y){
		CentreX=X;
		CentreY=Y;
	}
}
