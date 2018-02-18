package WorkerDemoExecption;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {

	String name;
	String no;
	String date;
	
	public Employee()
	{
		
	}
	
	public Employee(String name , String no, String date) throws InvalidEmployeeNumber
	{
		Pattern p = Pattern.compile("\\d\\d\\d");
		Matcher mat = p.matcher(no);
		if(mat.matches())
		{
		this.no= no;
		}
		else
		{
			throw new InvalidEmployeeNumber();
		}
		this.name = name;
		//this.no= no;
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
	public void setEmployeeNumber(String no) throws InvalidEmployeeNumber
	{
		Pattern p = Pattern.compile("\\d\\d\\d");
		Matcher mat = p.matcher(no);
		if(mat.matches())
		{
		this.no= no;
		}
		else
		{
			throw new InvalidEmployeeNumber();
		}
	}
	public void setHireDate(String date)
	{
		this.date = date;
	}
	
	public String toString()
	{
		return name + ","+"Employee no." + no + ","+"Hire:" + date;
	}
}
