import java.util.Scanner;
 // James Aaron
public class TrafficLight {
	
	public static void main(String args[]) {
		
		Scanner userInput = new Scanner(System.in);
			
		String red_light;
		System.out.print("Do not cross. Wait for Green Light." + "\n Type any letter to continue" );
		red_light = userInput.next();
		
		String green_light;
		System.out.print("You have the Green Light" + " proceed through intersection.\n You now have");
		System.out.print(" the Yellow Light, Type any letter to continue");
		green_light = userInput.next();
		
		String yellow_light;
		System.out.print("Continue to cross if unable to stop safely.");
		System.out.println("You have now completed this Traffic Simulation Congratulations!");
		yellow_light = userInput.next();
		
		String redLight = "Red";
		String greenLight = "Green";
		String yellowLight = "Yellow";
		
		if(redLight == greenLight) {
			System.out.print(green_light);
		} else {
			System.out.print(red_light);}
		}
		
		public static int carDetection(int a, int b) {
			int car;
			if (a > b)
				car = b;
			else
				car = a;
			return car;
	}
}
