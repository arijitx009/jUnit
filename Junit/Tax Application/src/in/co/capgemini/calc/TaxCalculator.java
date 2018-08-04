package in.co.capgemini.calc;

public class TaxCalculator {
	
//	String empName;
//	Boolean isIndian;
//	int empSal;
//	
	public double calculateTax(String empName, Boolean isIndian, int empSal) throws Exception
	{
		float tax=0f;
		//this.empName=empName;
		//this.isIndian=isIndian;
		//this.empSal=empSal;
		try {
		if(empName.equals(null)|| empName.isEmpty())
		{
			throw new EmployeeNameInvalidException();
		}
		
		if(!isIndian)
		{
			throw new CountryNotValidException();
		}
		
		if(empSal<10000)
		{
			throw new TaxNotEligibleException();
		}
		
		if(empSal>=100000 && (isIndian))
		{
			tax= (empSal *8)/100;
			System.out.println(tax);
		}
		
		else if(empSal>=50000 && empSal<100000 && (isIndian))
		{
			tax = (empSal *6)/100;
		}
		
		else if(empSal>=30000 && empSal<50000 && (isIndian))
		{
			tax = (empSal *5)/100;
		}
		
		else if(empSal>=10000 && empSal<30000 && (isIndian))
		{
			tax = (empSal *4)/100;
		}
		}catch(CountryNotValidException | EmployeeNameInvalidException |TaxNotEligibleException e)
		{
			System.out.println(e.toString());
		}
		return tax;
		
	}
	

}
