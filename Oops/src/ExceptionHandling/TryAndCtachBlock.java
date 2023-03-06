package ExceptionHandling;

public class TryAndCtachBlock {

	public static void main(String[] args) {

		try {
			method("UYGDUAS");
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.code);
		}

	}

	public static void method(String str) throws NotFoundException {

		try {
			if (str.endsWith("123")) {
				System.out.println("hello");
			} else
				throw new NotFoundException("input is invalid");
		} catch (NumberFormatException e) {
			throw new NotFoundException("input is invalid" + e);

		}
	}
}
