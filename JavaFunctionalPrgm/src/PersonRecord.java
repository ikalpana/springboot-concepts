
public record PersonRecord(String name, int age) {
	public static void main(String[] args) {
	PersonRecord person = new PersonRecord("Alice", 25);
	String name = person.name();
	int age = person.age();
	System.out.println(person.age);
}
}
