package ParkingTicket;

public class ParkingTicket {
	
	int minPark ;
	double charge ;
	ParkedCar car;
	PoliceOfficer police;
	
	final double baseFine = 25;
	final double hourFine = 10;
	
	public ParkingTicket(ParkedCar car, PoliceOfficer police, int minPark)
	{
		super();
		this.car = car;
		this.police = police;
		this.minPark = minPark;
		
		calculateFine();
	}
	
	public void calculateFine()
	{
		double hr = minPark/60;
		int h = (int) hr ;
		
		if((hr - h) > 0)
		{
			h++;
		}
		
		charge = baseFine;	
		charge = charge + hourFine;		
	}
	
	public ParkedCar getCar() {
		return car;
	}

	public void setCar(ParkedCar car) {
		this.car = car;
	}

	public PoliceOfficer getOfficer() {
		return police;
	}

	public void setOfficer(PoliceOfficer officer) {
		this.police = officer;
	}

	public double getFine() {
		return charge;
	}
	
	public void setFine(double charge)
	{
		this.charge = charge;
	}
	public int getMinutes() 
	{
		return minPark;
	}

	public void setMinutes(int minPark) 
	{
		this.minPark = minPark;
	}
	public String toString() 
	{
		return "Charges = " + charge + ", "+ " Illegal Minutes = " + minPark ;
	}
	   

}
