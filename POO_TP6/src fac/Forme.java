import java.awt.Graphics;

public interface Forme {
	public void dessiner(Graphics g);
	public void deplacer(int X,int Y);
	public void setX(int x);
	public void setY(int y);
}
