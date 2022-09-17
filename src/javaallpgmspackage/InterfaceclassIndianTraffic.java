package javaallpgmspackage;

public class InterfaceclassIndianTraffic implements Interfacecentraltraffic, Interfacecontinentaltraffic {

	public static void main(String[] args) {

		//interfacename objname = new classname();
		
		
		Interfacecentraltraffic	interfaceobj = new InterfaceclassIndianTraffic();
		
		interfaceobj.Greenmethod();
		
		interfaceobj.Redmethod();
		
		Interfacecontinentaltraffic  continentalinterfaceobj = new  InterfaceclassIndianTraffic();
		
		continentalinterfaceobj.flashyellowmethod();
		
		
		InterfaceclassIndianTraffic localobj = new InterfaceclassIndianTraffic();
		
		localobj.flashyellowmethod();
		
		
		
	}

	@Override
	public void Greenmethod() {
	System.out.println("signal is green so you can move");
		
	}

	@Override
	public void Redmethod() {

		System.out.println("RED SIgnal so Stop");
	}

	@Override
	public void flashyellowmethod() {
	System.out.println("FLash yellow : show flash yellow light");
		
	}
	
	void localindiatrafficmethod()
	{
		System.out.println("This is local Indian traffic method");
	}

}
