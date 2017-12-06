
import java.awt.Color;

public class AppliDessin {

	// effectuer une pause d'une certaine durée en millisecondes
	static void Pause(int millisecondes) {
		try {
			Thread.sleep(millisecondes);
		}
		catch(Exception e) {}
	}

	public static void main(String[] args) {
		// construction et affichage de la fenêtre
		Fenetre fen = new Fenetre("TP6",566,350);

		// dessin de 100 points blancs
		for (int i=1; i<=100; ++i) {
			fen.dessiner(new Point(i,i,Color.WHITE));
			Pause(200);
		}
	}
}
