package earthworm_Game;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;

public class LbWorm extends JLabel{
	LbWorm(){
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(25,25));
		this.setOpaque(true);
	}
	
	LbWorm(int n){
		this.setBackground(Color.red);
		this.setPreferredSize(new Dimension(25,25));
		this.setOpaque(true);
	}
}
