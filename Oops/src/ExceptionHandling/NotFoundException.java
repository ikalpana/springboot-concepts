package ExceptionHandling;

public class NotFoundException extends Exception{

	public String code;

	public NotFoundException(String code) {
		super();
		this.code = code;
	}
	
}
