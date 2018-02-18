package WorkerDemo;


public class Employee {

	String name;
	String no;
	String date;
	
	public Employee()
	{
		
	}
	
	public Employee(String name , String no, String date)
	{
		this.name = name;
		this.no= no;
		this.date = date;
		
	}
	
	public String getName()
	{
		return name;
	}
	public String getEmployeeNumber()
	{
		return no;
	}
	public String getHireDate()
	{
		return date;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setEmployeeNumber(String no)
	{
		this.no= no;
	}
	public void setHireDate(String date)
	{
		this.date = date;
	}
	public boolean isValidEmpNum()
	{
		if(isValidEmpNum())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		return name + ","+"Employee no." + no + ","+"Hire:" + date;
	}
}
