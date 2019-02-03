import lejos.hardware.Button;
import lejos.hardware.sensor.EV3IRSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class IrsChecker extends Thread {
	
	private EV3IRSensor infraredSensor;

	public IrsChecker(EV3IRSensor sensor) {
		this.infraredSensor = sensor;
	}
	
	Aja aja = new Aja ();
	
	public void run() {
		
		SampleProvider distance = infraredSensor.getDistanceMode();
		float[] distSample = new float[distance.sampleSize()];
		
		while (!Button.ENTER.isDown()) {
			
			while (distSample[0] > 0.1) {
				int remoteCommand = infraredSensor.getRemoteCommand(0);
				
				if (remoteCommand != 0) {
					switch (remoteCommand) {
					case 1:
						aja.eteenpain();
						break;
					case 2:
						aja.kaannyVasemmalle();
						break;
					case 3:
						aja.taaksepain();
						break;
					case 4:
						aja.kaannyOikealle();
						break;
					case 9:
						aja.pysahdy();
						break;
					default:
						break;
					}
				}
				distance = infraredSensor.getDistanceMode();
				distSample = new float[distance.sampleSize()];
				distance.fetchSample(distSample, 0);
			}				
			aja.pysahdy();
		}
	}

}
