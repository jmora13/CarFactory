package cs141.ice2;
import java.io.*;
import java.util.*;
public class CarFactory {
	
	private static Car cars[] = new Car[5];
	public static Scanner s = new Scanner(System.in);
	
	public static Car addCar(int count){
		if(count > cars.length){
			System.out.println("Factory is full");
			return null;
		} 
		for(int i = 0; i < count; i++){
			cars[i] = new Car();
			System.out.println("Enter make for car " + (i+1) + ": ");
			cars[i].setMake(s.next());
			System.out.println("Enter model for car " + (i+1) + ": ");
			cars[i].setModel(s.next());
			System.out.println("Enter year for car " + (i+1) + ": ");
			cars[i].setYear(s.nextInt());
			System.out.println("Enter location for car " + (i+1) + ": ");
			cars[i].setLocation(s.nextInt());
			//System.out.println(cars[i]);
				} return cars[count];
			}
	public static void main(String []args) throws IOException{
		System.out.println("How many cars would you like to add?");
		int a = s.nextInt();
		Car c = CarFactory.addCar(a);
		Car.saveData("Car");
		Car.LoadData("Car");
		for(int i = 0; i < a; i++){
		System.out.println("Car " + (i+1) + "\n" + cars[i].toString());
		}
	}
}
