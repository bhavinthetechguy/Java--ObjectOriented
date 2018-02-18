package ParkingTicket;

public class ParkingMeter {
	
	int minute;
	
	public ParkingMeter(int minute)
	{
		this.minute = minute;
	}
	
	public int getMinutesPurchased()
	{
		return minute;
	}
	
	public void setMinutesPurchased(int minute)
	{
		this.minute = minute;
	}

}
