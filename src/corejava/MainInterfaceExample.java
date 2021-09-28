package corejava;

// my interface
interface I1{
	void function1();
   public static final String mob_no="85204120555";
   String name="rajat rawat";
}

//class A implements interface
 class A implements I1{
	public void function1() {
		System.out.println("Show interface I1 "+mob_no);
		
		//mob_no="20"; cannot reassign value in interface variable
		System.out.println("Show interface I1 "+name);
	}
}

//another  class extend class a 
public class MainInterfaceExample extends A{
	public static void main(String[]args){
		A a=new A(); //creating object of class A
		a.function1(); // call method of interface using object of class A
		
		// 
		CarInterfaceExample c=new CarInterfaceExample();
		c.vehical_number("UP 70 YX 1452");
		c.vehical_name("Honda City");
		c.vehical_seat(5);
		c.vehical_spead(140);
		c.model_no("XUV");
		c.print_car_Details();
		
	}

}


//An interface in java is a blueprint of class.It has static constants and abstract method.
//declare constants field
//declare method that abstract
//by default
