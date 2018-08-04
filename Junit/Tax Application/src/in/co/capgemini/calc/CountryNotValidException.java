package in.co.capgemini.calc;

public class CountryNotValidException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "The employee should be an Indian citizen for calculating tax.";
	}

}
