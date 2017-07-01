// fileName CarDemo
// writtenOn 4/22/2017
// writtenBy nicholasMagee

public class CarDemo
{
	public static void main(String[] args)
	{
		Car firstCar = new Car(2012, Model.MINIVAN, Color.BLUE);
		Car secondcar = new Car(2014, Model.CONVERTIBLE, Color.RED);
		firstCar.display();
		secondcar.display();
	
	}
}