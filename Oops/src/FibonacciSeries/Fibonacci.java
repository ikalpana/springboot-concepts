package FibonacciSeries;

public class Fibonacci {
	public static void main(String[] args) {
//		Write a java program To check if given array is fibonacci series or not 3
//		input array of numbers and o/p is Yes or No
//		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 -- Yes
//		0,1,1,2,3,5,9,13 -- No
		int[] input1 = {0,1,1,2,3,5,8,13,21,34,55};
		//int[] input2 = {0,1,1,2,3,5,9,13};
		
		int n = input1.length;
		int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        int count = 0;
        for (int i = 0; i < input1.length; i++) {
			if(fib[i] == input1[i] ) {
				count += 1;
			}
		}
        if(count == input1.length) 
        	System.out.println("fibonacci");
        else
        	System.out.println("Not fibonacci");
        System.out.println("-----------------------");
//		String to char array
		String str = "Kalpana";
		char[] chr = str.toCharArray();
		System.out.println(chr);
		System.out.println("------------------------");
		
		String str1 = "kalpanaIthagoni";
		System.out.println(str1.charAt(0));
		System.out.println(str1.compareTo("k"));
		System.out.println(str1.compareToIgnoreCase("Kalpa"));
		System.out.println(str1.concat(str1));
		System.out.println(str1.contains("kalpana"));
		System.out.println(str1.equals("kalpanaIthagoni"));
		System.out.println(str1.equalsIgnoreCase("Ithagoni"));
		System.out.println(str1.indexOf(1));
		
	}

}
