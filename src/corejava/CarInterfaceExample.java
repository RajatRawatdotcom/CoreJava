package corejava;
import corejava.interfaces.*;

public class CarInterfaceExample implements VehicalInterface{

	String name="";
	String vnumber="";
	int seatnumber;
	int speed;
	String modelnumber="";	
		
	@Override
	public void vehical_name(String v_name) {
		name=v_name;		
	}
	
	@Override
	public void vehical_number(String v_number) {
		vnumber=v_number;
	}

	@Override
	public void vehical_seat(int no_of_seat) {
		seatnumber=no_of_seat;	
	}

	@Override
	public void vehical_spead(int max_speed) {
		speed=speed+max_speed;		
	}

	@Override
	public void model_no(String m_number) {
		modelnumber=m_number;
	}
	
	
	
	
	public void print_car_Details() {
		System.out.println("car name :"+name);
		System.out.println("car number :"+vnumber);
		System.out.println("car no of seat :"+seatnumber);
		System.out.println("car max speed :"+speed);
		System.out.println("car model number :"+modelnumber);
		
	}

	

}
