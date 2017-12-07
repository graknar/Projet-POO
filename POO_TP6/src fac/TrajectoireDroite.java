import java.awt.Color;

public class TrajectoireDroite implements Trajectoire{
		private int a,b;
		boolean Vertical=false, Horizontal=false; 
		
	TrajectoireDroite(Point Deb, Point Arr){
		a=(Arr.getY()-Deb.getY())/(Arr.getX()-Deb.getX());
		b=-a*Deb.getX() +Deb.getY();
		if(Deb.getX()==Arr.getX())
		{
			Vertical=true;
		}
		if(Deb.getY()==Arr.getY())
		{
			Horizontal=true;
		}
	}
	
	public Point prochainPoint(Point Cour){
		Point P;
		if(Vertical==false && Horizontal==false){
			P= new Point(Cour.getX()+10,a*(Cour.getX()+1)+b,new Color(0,0,0,0));
		}else if(Vertical==true){
			P= new Point(Cour.getX(),a*(Cour.getX()+1)+b,new Color(0,0,0,0));
		}else{
			P= new Point(a*(Cour.getX()+1)+b,Cour.getX(),new Color(0,0,0,0));
		}
		return P;
	}
}