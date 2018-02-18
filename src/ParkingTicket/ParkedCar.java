package ParkingTicket;

public class ParkedCar {
	
	String make,color,license;
	int minute,model;
	
	public ParkedCar(String make, int model, String color, String license, int minute )
	{
		this.make = make;
		this.model = model;
		this.color = color;
		this.license = license;
		this.minute=minute;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public int getModel()
	{
		return model;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String getLicenseNumber()
	{
		return license;
	}
	
	public int getMinutesParked()
	{
		return minute;
	}
	
	public void setMake(String make)
	{
		this.make = make;
	}
	
	public void setModel(int model)
	{
		this.model=model;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public void setLicenseNumber(String license)
	{
		this.license=license;
	}
	
	public void setMinutesParked(int minute)
	{
		this.minute=minute;
	}
	
	public String toString()
	{
		return make +","+model+","+color+","+"license no."+license+","+ minute+ " mins. Parked";
	}

	
}
