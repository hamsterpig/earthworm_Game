package earthworm_Game;

public class Move extends Thread{
	boolean move = true;
	
	Move(){
		while(move){
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(Main.Direction.equals("d")){
				Main.Location_X += 25;
				for(int i=0; i<Main.aWorm.size(); i++){
					
					Main.aWorm.get(i).setBounds(Main.Location_X-(i*25), Main.Location_Y, 24, 24);
					System.out.println(Main.aWorm.size());
				}
			}
		}
	}
	
}
	
