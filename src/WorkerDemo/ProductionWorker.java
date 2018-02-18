package WorkerDemo;

import java.text.NumberFormat;

public class ProductionWorker extends Employee {
	
	double rate;
	String shift;
	
	public ProductionWorker() 
	{
		
	}

	public ProductionWorker(String name, String no, String date, String shift, double rate) 
	{
		super(name, no, date);
		this.rate = rate;
		this.shift = shift;
	}
	

	public String getShift()
	{
		return shift;
	}
	public double getPayRate()
	{
		return rate;
	}
	public void setShift(String shift)
	{
		this.shift = shift;
	}
	public void setPayRate(double rate)
	{
		this.rate = rate;
	}
	
	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	
	public String toString()
	{
		return super.toString() +","+"Shift:" + shift +","+ "Hourly rate:" + formatter.format(rate);
	}
	
	
	

	
}
