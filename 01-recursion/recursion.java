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
	} else if (s.charAt(0) == c){
	    return 1 + numchar(s.substring(1), c);
	} else {
	    return numchar(s.substring(1), c);
	}
    }

    public int bunnyEars2(int bunnies) {
	if (bunnies == 0) {
	    return 0;
	} else if (bunnies % 2 == 1) {
	    return 2 + (bunnyEars2(bunnies - 1));
	} else {
	    return 3 + (bunnyEars2(bunnies - 1));
	}
    }

    public int strCount(String str, String sub) {
	if (str.length() < sub.length()) {
	    return 0;
	} else if (str.substring(0, sub.length()).equals(sub)) {
	    return 1 + strCount(str.substring(sub.length()), sub);
	} else {
	    return strCount(str.substring(1), sub);
	}
    }

    public int sumDigits(int n) {
	if (n < 10) {
	    return n;
	} else {
	    return n % 10 + sumDigits(n / 10);
	}
    }

    public String allStar(String str) {
	if (str.length() < 2) {
	    return str;
	} else {
	    return str.substring(0,1) + "*" + allStar(str.substring(1));
	}
    }

    
    public static void main(String[] args) {
	recursion r = new recursion();
	//fib(n) - returns the nth fib number
	System.out.println(r.fib(5)); //5
	System.out.println(r.fib(6)); //8
	//lengthString(s) - returns the length of a string
	System.out.println(r.lengthString("hello")); //5
	System.out.println(r.lengthString("bunnies are nice")); //16
	//numchar(s,c) - counts the number of times char c appears in String s
	System.out.println(r.numchar("xxxx", 'x')); //4
	System.out.println(r.numchar("extremely excited extra", 'e')); //6
	//bunnyEar2(bunnies) - num of ears in bunny line of length bunnies (odd - 2 ears, even - 3 ears)
	System.out.println(r.bunnyEars2(0)); //0
	System.out.println(r.bunnyEars2(5)); //12
	//strCount(str, sub) - num of times sub appears in str
	System.out.println(r.strCount("catcowcatmousecat", "cat")); //3
	System.out.println(r.strCount("catcowcatmousecat", "dog")); //0
	//sumDigits(n) - sum of the digits of n
	System.out.println(r.sumDigits(126)); //9
	System.out.println(r.sumDigits(49)); //13
	System.out.println(r.sumDigits(6)); //6
	//allStar(str) - returns str with adjacent letters separated by a "*"
	System.out.println(r.allStar("hello")); //"h*e*l*l*o"
	System.out.println(r.allStar("Jason")); //"J*a*s*o*n"
    }
}
