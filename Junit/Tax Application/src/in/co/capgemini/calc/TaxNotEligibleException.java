package in.co.capgemini.calc;

public class TaxNotEligibleException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "The employee does not need to pay tax.";
	}

	
}
