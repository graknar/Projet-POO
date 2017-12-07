import java.awt.Color;
import java.util.Scanner;
public class Main {
	//creation des variables
	private static boolean Saisie=false;
	
	private static String TitreFen;
	private static int TailleXFen=0,TailleYFen=0, FormeX=0, FormeY=0, rayon=0,R=0,G=0,B=0,Longueur=0,Largueur=0;
	//création des objets
	private static Scanner scan =new Scanner(System.in);
	private static Point Dep,Arr,Cour;
	public static void main(String[] args){

		Color coul=new Color(0,0,0);
		Trajectoire traj;

		Forme cercle =new Cercle(FormeX,FormeY,coul,rayon);;
		Forme rectangle= new Rectangle(FormeX,FormeY,coul,Longueur,Largueur);
	
		SaisieFenetre();
		//SaisieForme(cercle);
		//SaisieForme(rectangle);
		FormeX=100;FormeX=100; rayon=10;
		SaisiePoint();
		
		traj=new TrajectoireDroite(Dep,Arr);
		
		cercle =new Cercle(FormeX,FormeY,coul,rayon);
		//rectangle= new Rectangle(FormeX,FormeY,coul.red,Longueur,Largueur);
		//changement des couleurs
		coul=new Color(R,G,B);
		
		Fenetre fen=new Fenetre(TitreFen,TailleXFen,TailleYFen);

		// dessin de 100 points blancs
		//while(Cour!=Arr){
		for(int i=0;i<100;i++){
			cercle.deplacer(traj.prochainPoint(Cour).getX(),traj.prochainPoint(Cour).getY());
			fen.dessiner(cercle);
			//fen.dessiner(rectangle);
			Pause(20);
		}
	}
	
	// effectuer une pause d'une certaine durée en millisecondes
	static void Pause(int millisecondes) {
		try {
			Thread.sleep(millisecondes);
		}
		catch(Exception e) {}
	}

	static void SaisieFenetre(){	
		 //Saisie des données de la fenetre
		System.out.println("Saisie d'un nom de fenetre");
		TitreFen=scan.next();//nom de la fenetre
		do{
			try{
				System.out.println("Saisie d'une taille en X");
				TailleXFen = scan.nextInt();//taille X de la fenetre
				System.out.println("Saisie d'une taille en Y");
				TailleYFen = scan.nextInt();//taille Y de la fenetre
				Saisie=true;
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Erreur dans la saisie des tailles");
				scan.nextLine();
				Saisie=false;
			}
		}while(!Saisie);

	}
	static void SaisiePoint(){
		//Saisie des points de départ et d'arrivé
				Saisie=false;
				int x1=0,y1=0,x2=0,y2=0;
				do{
					try{
						System.out.println("Saisie la valeur X du point de départ");
						x1 = scan.nextInt();
						System.out.println("Saisie la valeur Y du point de départ");
						y1 = scan.nextInt();
						System.out.println("Saisie la valeur X du point de d'arrivé");
						x2 = scan.nextInt();
						System.out.println("Saisie la valeur Y du point de d'arrivé");
						y2 = scan.nextInt();
						Saisie=true;
						Dep= new Point(x1,y1,new Color(0,0,0,0));
						Arr= new Point(x2,y2,new Color(0,0,0,0));
						Cour=Dep;
					}
					catch(java.util.InputMismatchException e){
						System.out.println("Erreur dans la saisie des points");
						scan.nextLine();
						Saisie=false;
					}
				}while(!Saisie);
	}
	
	static void SaisieForme(Forme f){		
		//Saisie des données Forme
		Saisie=false;
		do{
			try{
				System.out.println("Saisie d'une position de départ en X");
				FormeX = scan.nextInt();//Centre en X
				System.out.println("Saisie d'une position de départ en Y");
				FormeY = scan.nextInt();//Centre en Y
				if(f instanceof Cercle){
					System.out.println("Saisie d'un rayon");
					rayon = scan.nextInt();//Rayon
				}else if(f instanceof Rectangle){
					System.out.println("Saisie de la longueur");
					Longueur = scan.nextInt();//Longueur	
					System.out.println("Saisie de la largueur");
					Largueur = scan.nextInt();//Longueur	
				}
				Saisie=true;
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Erreur dans la saisie des tailles");
				scan.nextLine();
				Saisie=false;
			}
		}while(!Saisie);
		
		//Saisie de la couleur forme
		Saisie=false;
		do{
			try{
				System.out.println("Saisie d'une nuance de Rouge");
				R = scan.nextInt();// nuance R
				System.out.println("Saisie d'une nuance de Vert");
				G = scan.nextInt();// nuance G
				System.out.println("Saisie d'une nuance de Bleu");
				B = scan.nextInt();// nuance B
				Saisie=true;
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Erreur dans la saisie des tailles");
				scan.nextLine();
				Saisie=false;
			}
		}while(!Saisie);
	};
}
