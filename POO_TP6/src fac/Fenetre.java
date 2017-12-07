import javax.swing.JFrame;

public class Fenetre extends JFrame {

	private Panel pan;  // zone de dessin dans la fenêtre

	// Constructeur d'une fenêtre
	public Fenetre(String titre, int largeur, int hauteur) {
		super(titre);
        setSize(largeur,hauteur);

        // ajout d'un panel dans la fenêtre
        pan = new Panel(largeur,hauteur);
        getContentPane().add(pan);

        // paramétrage de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        setLocationRelativeTo(null);

        // affichage à l'écran
        pack();
        setVisible(true);
	}

	// dessiner une nouvelle forme
	public void dessiner(Forme f) {
		pan.ajouterForme(f);
	}

	// effacer toutes les formes
	public void effacer() {
		pan.effacer();
	}
}