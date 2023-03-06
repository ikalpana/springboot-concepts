package com.oops.strings;

public class StringBuilderExample {
	public static void main(String[] args) {
	StringBuilder s=new StringBuilder();
	 System.out.println("default capacity:"+s.capacity());
	 s.append("Kalpana");
	 s.append("Ithagoni");//now original string is changed  
	 System.out.println("using append method:"+s);
	 s.insert(0, "Shilpa");//
	 System.out.println("using insert method:"+s);
	 s.replace(0,6,"Java");  
	 System.out.println("replace the string from specified startIndex and endIndex:"+s);
	 System.out.println("substring from the specified beginIndex and endIndex:"+s.substring(4,11));
	 s.delete(0, 4);
	 System.out.println("using delete method:"+s);
     System.out.println("substring from the specified beginIndex:"+s.substring(7));
     s.reverse();
     System.out.println("using reverse string method:"+s);
     System.out.println("using capacity method:"+s.capacity());
     s.ensureCapacity(34);//now no change  
     System.out.println(s.capacity());//now 34  
     s.ensureCapacity(35);//now (34*2)+2  
     System.out.println(s.capacity());//now 70  
     System.out.println("Length of String:"+s.length());
     System.out.println("character at the specified position:"+s.charAt(7));
	}
}
