package OOPsPackage;

public class laptop {

	// State
	boolean isOn;
	String brightness;
	String processor;
	String os;
	
	laptop(boolean val1, String val2, 
			String val3, String val4){
		
		System.out.println(this);
		this.isOn=val1;
		this.brightness=val2;
		this.processor= val3;
		this.os=val4;
	}
	
	laptop(){
		
	}
	
	
	
}
