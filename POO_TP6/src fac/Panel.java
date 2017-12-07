import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.ArrayList;

public class Panel extends JPanel {

	private ArrayList<Forme> formes;	// liste des formes graphiques
										// pour l'instant : des Formes

	// construction d'un panel étant données ses dimensions
	public Panel(int largeur, int hauteur) {
        super();

        // dimensionnement du panel
        setPreferredSize(new Dimension(largeur,hauteur));

        // construction de la liste vide
        formes = new ArrayList<Forme>();
	}

	// ajout et dessin d'un nouvel objet dans le panel
	public void ajouterForme(Forme f) {
		// ajout
		formes.add(f);

		// dessin (repaint appelle paintComponent)
        repaint();
	}
	
	public void effacer() {
		// le tableau est vidé
		formes.clear();

		// dessin
        repaint();
	}

	// méthode de dessin des formes dans un panel
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
 
        // remplissage de la couleur de fond
        g.setColor(Color.GRAY);
        g.fillRect(0,0,this.getWidth(),this.getHeight());

        // dessin des formes
        for (int i=0; i<formes.size(); ++i) {
        	formes.get(i).dessiner(g);
        }
	}
}