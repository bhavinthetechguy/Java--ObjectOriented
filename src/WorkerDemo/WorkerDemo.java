package WorkerDemo;

public class WorkerDemo 
{
	public static void main(String[] args)
	{
		ProductionWorker worker1 = new ProductionWorker("John Smith","123-A","11-15-2005","Day",16.50);
		System.out.println(worker1);
		
		ProductionWorker worker2 = new ProductionWorker();
		worker2.setName("Joan Jones");
		worker2.setEmployeeNumber("222-L");
		worker2.setHireDate("12-12-2005");
		worker2.setShift("Night");
		worker2.setPayRate(18.50);
		
		worker2.getName();
		worker2.getEmployeeNumber();
		worker2.getHireDate();
		worker2.getShift();
		worker2.getPayRate();
		
		System.out.println(worker2);
		
		
		
	}

}
