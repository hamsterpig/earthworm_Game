package earthworm_Game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame implements KeyListener{
	
	JPanel pa, pa_n, pa_s, pa_c, pa_e, pa_w;
	static String Direction = "d";
	static ArrayList<LbWorm> aWorm;
	static int Location_X = 300, Location_Y = 250;
	
	Main(){
		pa = new JPanel();
		pa_n = new JPanel();
		pa_s = new JPanel();
		pa_c = new JPanel();
		pa_e = new JPanel();
		pa_w = new JPanel();
		
		this.setLayout(new BorderLayout());
		this.add(pa);
		pa.setBackground(new Color(150,150,255));
		pa.add(pa_n, BorderLayout.PAGE_START);
		pa.add(pa_s, BorderLayout.PAGE_END);
		pa.add(pa_c, BorderLayout.CENTER);
		pa.add(pa_e, BorderLayout.LINE_END);
		pa.add(pa_w, BorderLayout.LINE_START);
		
		pa_c.setLayout(null);
		pa_c.setPreferredSize(new Dimension(600,500));
		pa_c.setBackground(Color.black);
		
		aWorm= new ArrayList<>();
		aWorm.add(new LbWorm(1));
		aWorm.add(new LbWorm());
		aWorm.add(new LbWorm());
		
		for(int i=0; i<aWorm.size(); i++){
			pa_c.add(aWorm.get(i));
			aWorm.get(i).setBounds(Location_X-(i*25),Location_Y,24,24);
			System.out.println("dd");
		}
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((dim.width/2)-(this.getWidth()/2)-375, (dim.height/2)-(this.getHeight()/2)-300);
		setVisible(true);
		pack();
		
		Move tt = new Move();
		tt.start();
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
		
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
