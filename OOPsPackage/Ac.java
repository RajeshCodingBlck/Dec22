package OOPsPackage;

public class Ac {

	
	// State  -> Varibles
	boolean isOn;
	int temp;
	int fanSpeed;
	
	// behaviour -> function
	
	void getOn() {
		boolean  isOn=false;
		System.out.println("I am called by "+ this);
		this.isOn=true;
	}
	
	void getOff() {
		
		isOn=false;
	}
	
	void incrTemp() {
		if(temp<30) {
			temp++;
		}
	}
	
	void decrTemp() {
		if(temp>16) {
			temp--;
		}
	}
	
}
