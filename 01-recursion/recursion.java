public class recursion {

    public int fib(int n) {
	if (n < 3) {
	    return 1;
	} else if (n < 0) {
	    return -1;
	} else {
	    return fib(n - 1) + fib(n - 2);
	}
    }

    public int lengthString(String s) {
	if (s.equals("")) {
	    return 0;
	} else {
	    return 1 + lengthString(s.substring(1));
	}
    }

    public int numchar(String s, char c) {
	if (s.equals("")) {
	    return 0;
	} else if (s.substring(0,1).equals(char.toString(c))) {
	    return 1 + numchar(s.substring(1), c);
	} else {
	    return numchar(s.substring(1), c);
	}
    }

    
    
    public static void main(String[] args) {
	recursion n = new recursion();
	System.out.println(n.fib(5)); //5
	System.out.println(n.fib(6)); //8
	
	System.out.println(n.lengthString("hello")); //5
	System.out.println(n.lengthString("bunnies are nice")); //16

	System.out.println(n.numchar("xxxx", 'x')); //4
	System.out.println(n.numchar("extremely excited extra", 'e')); //3

	
    }
}
