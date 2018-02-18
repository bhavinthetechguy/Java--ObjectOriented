package ParkingTicket;

public class ParkingTicketSimulator {
	
	public static void main(String[] args)
	{
	
	ParkedCar car = new ParkedCar("Volswagon",1972,"Red","147RHZM",125);
	System.out.println("ParkedCar:" +car);
	
	PoliceOfficer police = new PoliceOfficer(4788,"Joe Friday");
	System.out.println("PoliceOfficer:"+police);
	
	ParkingMeter park = new ParkingMeter(60);
	System.out.println("Minutes Purchased:"+park.getMinutesPurchased());
	
	ParkingTicket ticket = police.patrol(car, park);
	
	if(ticket == null)
	{
		System.out.println("No crime commited!");
	}
	else
	{
		System.out.print(ticket);
	}
	}
}
