import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.NumberFormat;
import javax.swing.*;
import javax.swing.JTextField;
 
public class Fenetre extends JFrame {
	//private JButton bouton = new JButton("Mon bouton");
	private JPanel content = new JPanel();
	private CardLayout c1=new CardLayout();
	//comboBox pour le choix des formes
	String[] tab= {"Triangle","Rectangle","Ovale","Cercle","Carre"};
	JComboBox combo=new JComboBox(tab);
	
	private JFormattedTextField jtf1 = new JFormattedTextField(NumberFormat.getIntegerInstance());
	private JFormattedTextField jtf2 = new JFormattedTextField(NumberFormat.getIntegerInstance());
	private JLabel labelPts1=new JLabel("Définir le point 1:");
	private JLabel labelPts2=new JLabel("Définir le point 2:");
	
	private int indice =0;
	private String[] listContent={"Card_1","Card_2","Card_3"};
	
	public Fenetre(){             
		//nom de la première fenetre
		this.setTitle("Bouton");
		//taille de la fenetre
		this.setSize(500, 500);
		//Potision
		this.setLocationRelativeTo(null);
		//Arrêt du process en cas de fermeture de la fenetre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
		//Redimention
		this.setResizable(false);
		//garder sur le dessus
		this.setAlwaysOnTop(true);
		
		//On crée trois conteneurs différent
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		
		JButton bouton = new JButton("Valider le résultat");
	    //Définition de l'action du bouton
	    bouton.addActionListener(new ActionListener(){
	      public void actionPerformed(ActionEvent event){
	        //Via cette instruction, on passe au prochain conteneur de la pile
	        c1.next(content);
	      }
	    });
	    bouton.addItemListener(new ItemState());
		bouton.addActionListener(new ItemAction());
		JPanel boutonPane=new JPanel();
		boutonPane.add(bouton);
		
		//comboBox pour le choix des formes
		combo.setPreferredSize(new Dimension(100,20));
		
		//Ajout du listener
		
		combo.setPreferredSize(new Dimension(100,20));
		combo.setForeground(Color.BLUE);
		
		//fin de la combo box
		
		
		
		//Fenetre 1 ajout des différents éléments
		JLabel label=new JLabel("choix de la forme :");
		card1.add(label);
		card1.add(combo);
		
		//TextField
		jtf1.setPreferredSize(new Dimension(150,30));
		jtf2.setPreferredSize(new Dimension(150,30));
		
		card1.add(labelPts1);
		card1.add(jtf1);
		card1.add(labelPts2);
		
		card1.add(jtf2);
		
		card1.add(boutonPane);
		
		//on définit le layout
		content.setLayout(c1);
		//on ajoute les cartes à la pile avec un nom pour les retrouver
		content.add(card1, listContent[0]);
		content.add(card2, listContent[1]);
		
		this.getContentPane().add(content, BorderLayout.CENTER);
		
		
		//affichage
		this.setVisible(true);
	}

	//Classe interne implémentant l'interface ItemListener
	 class ItemState implements ItemListener{
	    public void itemStateChanged(ItemEvent e) {
	      System.out.println("événement déclenché sur : " + e.getItem());
	    }    
	}
	 
	 //La classe interne ItemState reste inchangée

	  class ItemAction implements ActionListener{

	    public void actionPerformed(ActionEvent e) {
	      System.out.println("ActionListener : action sur " + combo.getSelectedItem());
	      System.out.println("TEXT:jtf1 "+jtf1.getText());
	      System.out.println("TEXT:jtf2 "+jtf2.getText());
	    }               
	  }
}