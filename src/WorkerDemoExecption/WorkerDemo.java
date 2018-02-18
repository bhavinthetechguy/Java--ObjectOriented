package WorkerDemoExecption;

public class WorkerDemo 
{
	public static void main(String[] args) throws InvalidEmployeeNumber, InvalidPayRate, InvalidShift
	{
	
		CreateWorker1();
		CreateWorker2();
		CreateWorker3();
		CreateWorker4();
	}
	
	public static void CreateWorker1()
	{
		try
		{
			ProductionWorker worker1 = new ProductionWorker("John Smith","123","11-15-2009","Day",16.50);
			System.out.println(worker1);
		}
		catch(Exception error)
		{
			System.out.println(error);
		}
		System.out.println("\n");
	}
	public static void CreateWorker2()
	{
		try
		{
			ProductionWorker worker2 = new ProductionWorker("John Smith","10001","11-15-2009","Day",16.50);
			System.out.println(worker2);
		}
		catch(Exception error)
		{
			System.out.println(error);
		}
		System.out.println("\n");
	}
	public static void CreateWorker3()
	{
		try
		{	
			ProductionWorker worker3 = new ProductionWorker("John Smith","123","11-15-2009","66",16.50);
			System.out.println(worker3);
			
		}
		catch(Exception error)
		{
			System.out.println(error);
		}
		System.out.println("\n");
	}
	public static void CreateWorker4()
	{
		try
		{
			ProductionWorker worker4 = new ProductionWorker("John Smith","123","11-15-2009","Day",-99.00);
			System.out.println(worker4);
			
		}
		catch(Exception error)
		{
			System.out.println(error);
		}
		System.out.println("\n");
	}

}
