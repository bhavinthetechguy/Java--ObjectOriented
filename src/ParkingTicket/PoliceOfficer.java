package ParkingTicket;

public class PoliceOfficer {
	
	int no;
	String name;
	
	public PoliceOfficer(int no , String name)
	{
		this.no= no;
		this.name = name;
	}
	
	public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {

		ParkingTicket ticket = null;
		int illegalMinutes = car.getMinutesParked() - meter.getMinutesPurchased();
		
		if (illegalMinutes > 0) 
		{
			ticket = new ParkingTicket(car, this, illegalMinutes);
		}

		return ticket;
	}
	
	public int getBadgeNumber()
	{
		return no;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setBadgeNumber(int no)
	{
		this.no= no;
	}
	public String toString()
	{
		return name+","+"badge no."+no;
	}
}
