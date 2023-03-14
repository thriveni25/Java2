package com.jsp.cardevelopment;

public class Driver
{
	public void driver(Car car)
	{
		car.start();
		car.acceleration();
		car.stop();
	}
	
	public void accessbluetooth(Car car)
	{
		if(car instanceof Audi)
		((Audi)car).bluetooth();
		
		if(car instanceof Swift)
	    ((Swift)car).bluetooth();
	}
	
		
	
}
//public void driver(Swift swift)
//{
	//swift.start();
	//swift.acceleration();
	//swift.stop();
//}
//public void driver(Audi audi)
//{
//	audi.start();
//	audi.acceleration();
	//audi.stop();
//}
//public void driver(Bmw bmw)
//{
	//bmw.start();
	//bmw.acceleration();
	//bmw.stop();
//}
//}
