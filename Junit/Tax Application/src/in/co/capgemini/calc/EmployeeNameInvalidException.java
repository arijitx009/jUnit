package in.co.capgemini.calc;

public class EmployeeNameInvalidException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "The employee name cannot be empty";
	}

	

}
