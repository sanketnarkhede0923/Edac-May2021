class EmployeeNotFoundException extends Exception{
	public EmployeeNotFoundException() {}
	public EmployeeNotFoundException(String msg) {
		super(msg);
	}
}

public class CustomException {
	public static void main(String[] args) throws EmployeeNotFoundException {
		try {
			throw new EmployeeNotFoundException("Employee not found");
		}catch(EmployeeNotFoundException ex) {
			System.err.println(ex.getMessage());
		}
	}
}