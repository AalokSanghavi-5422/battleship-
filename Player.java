import BreezySwing.*;
import javax.swing.*;
public class Player {

	
	
	Grid playerboard;
	Ship[] ships; 

	public Player() {


		ships = new Ship[5];


		for(int i=0; i<5;i++){

			ships[i]=new Ship(i+1);
		}

	}
	
	
	public void attack(int x, int y) throws Exception{
		
		playerboard.attack(x, y);
		int i=playerboard.getPoint(x, y).getID();
		ships[i-1].hitShip();
		if(ships[i-1].sunk()==true){
			
			Board.sGUI.messageBox("Ship has been sunk!");
		}
		
		
	}
	 
	
	
	public Grid getGrid(){
		return playerboard;
	}
	
	
	
}
