package WorkerDemoExecption;

import java.text.NumberFormat;

public class ProductionWorker extends Employee {
	
	double rate;
	String shift;
	
	public ProductionWorker() 
	{
		
	}

	public ProductionWorker(String name, String no, String date, String shift, double rate) throws InvalidEmployeeNumber , InvalidPayRate, InvalidShift
	{
		super(name, no, date);
		if(rate < 0)
		{
			throw new InvalidPayRate();
		}
		else
		{
		this.rate = rate;
		}
		if(shift.equals("Day") || shift.equals("Night"))
		{
			this.shift = shift;
		}
		else
		{
			throw new InvalidShift();
			
		}
	}
	

	public String getShift()
	{
		return shift;
	}
	public double getPayRate()
	{
		return rate;
	}
	public void setShift(String shift)throws InvalidShift
	{
		if(!shift.equals("Day") || !shift.equals("Night"))
		{
			throw new InvalidShift();
		}
		else
		{
			this.shift = shift;
		}
	}
	public void setPayRate(double rate)throws InvalidPayRate
	{
		if(rate < 0)
		{
			throw new InvalidPayRate();
		}
		else
		{
		this.rate = rate;
		}
	}
	
	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	
	public String toString()
	{
		return super.toString() +","+"Shift:" + shift +","+ "Hourly rate:" + formatter.format(rate);
	}
	
	
	

	
}
