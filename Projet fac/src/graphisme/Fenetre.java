package graphisme;
import javax.swing.*;
 
public class Fenetre extends JFrame {
	//private Panneau  pannel= new Panneau();
	private JButton bouton = new JButton("Mon bouton");
	
	public Fenetre(/*int posX, int posY*/){             
		this.setTitle("Animation");//"Ma première fenêtre Java");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		this.setVisible(true);
		//go(posX,posY);
	}
	
	/*private void go(int posX, int posY){
		pannel.setPosX(posX);
		pannel.setPosY(posY);
		for(int i=posX;i<posY;i++){
			int x=pannel.getPosX(), y=pannel.getPosY();
			if(x==pannel.getPosX()){x++;}
			if(y==pannel.getPosY()){y++;}
			pannel.setPosX(x);
			pannel.setPosY(y);
			pannel.repaint();
			try {Thread.sleep(10);}catch(InterruptedException e){e.printStackTrace();}
		}
	}*/
}