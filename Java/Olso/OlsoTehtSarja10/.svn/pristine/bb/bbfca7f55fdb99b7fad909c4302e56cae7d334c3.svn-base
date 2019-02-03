import javafx.application.Platform;

public class GrafiikkaSaie extends Thread {
	
	private volatile boolean kaynnissa = true;
	private boolean vari;
	private boolean kuvio;
	
	public GrafiikkaSaie() {
		
	}
	
	@Override
    public void run(){
        while (kaynnissa){
            if (Math.random()<=0.5) {
            	vari = false;
            }
            	
            else {
            	vari = true;
            }
            
            if (Math.random() <= 0.5) {
            	kuvio = false;
            }
            else {
            	kuvio = true;
            }
               
            try{
                sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
       
    public void lopeta(){
        kaynnissa = false;
    }
    
    public boolean getVari() {
    	return vari;
    }
    
    public boolean getKuvio() {
    	return kuvio;
    }
}
