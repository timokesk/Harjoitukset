import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

public class Aja {
	
	RegulatedMotor mA = new EV3MediumRegulatedMotor(MotorPort.A);
	RegulatedMotor mD = new EV3MediumRegulatedMotor(MotorPort.D);
	
	public Aja(RegulatedMotor mA, RegulatedMotor mD) { 
		this.mA = mA;
		this.mD = mD;
		this.mA.setSpeed(900);
		this.mD.setSpeed(900);
		mA.synchronizeWith(new RegulatedMotor[] {mD});
		}
	
	public Aja() {
		this.mA.setSpeed(900);
		this.mD.setSpeed(900);
		mA.synchronizeWith(new RegulatedMotor[] {mD});
		}
	
	public void eteenpain() { 
		mA.startSynchronization();
		mA.forward();
		mD.forward();
		mA.endSynchronization();
		}
		
	public void taaksepain() { 
		mA.startSynchronization();
		mA.backward();
		mD.backward();
		mA.endSynchronization();
		}
		
	public void kaannyOikealle() {
		mA.startSynchronization();
		mA.forward();
		mD.stop();
		mA.endSynchronization();
		}
		
	public void kaannyVasemmalle() {
		mA.startSynchronization();
		mA.stop();
		mD.forward();
		mA.endSynchronization();
		}
		
	public void pysahdy() {
		mA.startSynchronization();
		mA.stop();
		mD.stop();
		mA.endSynchronization();
		}

}
