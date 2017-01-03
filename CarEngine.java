package cs141.ice2;

public class CarEngine {
	CarEngine engine = new CarEngine();
	
	public CarEngine(){
		System.out.println("Engine on");
	}
	
	public void finalize(){
		System.out.println("Engine Off");
	}
	
}
