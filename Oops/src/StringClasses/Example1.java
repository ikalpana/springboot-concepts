package StringClasses;

public class Example1 {
	public static void main(String[] args) {
        //converting array to String
		String s1="Anjali";
		
		char[] ch= {'a','n','j','u'};
		char[] charArray = s1.toCharArray();
		String s2=new String(ch);
		System.out.println(s1);
		System.out.println(s2);

	}
}
