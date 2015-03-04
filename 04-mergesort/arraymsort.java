import java.io.*;
import java.util.*;

public class arraymsort {
    private int[] randNums;
    private int listLen;
    private int greatestInt;
    
    public arraymsort() {
    }
    
    public arraymsort(int listLength, int greatestInteger) {
	Random r = new Random();
	listLen = listLength;
	greatestInt = greatestInteger;
	randNums = new int[listLen];
	for (int i = 0; i < listLen; i++) {
	    randNums[i] = r.nextInt(greatestInt);
	}
    }
    
    public String toString(int[] a) {
	String ret = "[";
	for (int i = 0; i < a.length; i++) {
	    ret = ret + a[i] + ", ";
	}
	ret = ret.substring(0,ret.length() - 2) + "]";
	return ret;
    }
	

    public int[] merge(int[] a, int[] b){
	int[] sorted = new int[a.length + b.length];
	int iA = 0;
	int iB = 0;
	int iSorted = 0;
	while (iA < a.length || iB < b.length) {
	    if (iB == b.length && iA < a.length) {
		sorted[iSorted] = a[iA];
		iA++;
	    } else if (iA == a.length && iB < b.length) {
		sorted[iSorted] = b[iB];
		iB++;
	    } else if (a[iA] <= b[iB]) {
		sorted[iSorted] = a[iA];
		iA++;
	    } else if (b[iB] <= a[iA]) {
		sorted[iSorted] = b[iB];
		iB++;
	    }
	    iSorted++;
	}
	return sorted;
    }

    public int[] msort(int[] a) {
	//ArrayList<Integer> sorted = new ArrayList<Integer>();
	int[] half1 = new int[a.length / 2];
	int[] half2 = new int[a.length - (a.length / 2)];
	if (a.length <= 1) {
	    return a;
	} else {
	    for (int i = 0; i < a.length; i++) {
		if (i < a.length / 2) {
		    half1[i] = a[i];
		} else {
		    half2[i - (a.length / 2)] = a[i];
		}
	    }
	    int[] r1 = msort(half1);
	    int[] r2 = msort(half2);
	    return merge(r1, r2);
	}
    }	
	    
    public static void main(String[] args) {
	arraymsort m = new arraymsort();
	// -- Testing merge function --	
	int[] test1 = new int[7];
	int[] test2 = new int[7];
	for (int i = 0; i < 5; i++) {
	    test1[i] = i;
	    test2[i] = i;
	}
	test1[5] = 7;
	test1[6] = 9;
	test2[5] = 5;
	test2[6] = 6;
	System.out.println("List 1: " + m.toString(test1));
	System.out.println("List 2: " + m.toString(test2));
	System.out.println("After merging L1 and L2: " + m.toString(m.merge(test1, test2)));

	// -- Testing msort funstion --
	int[] randNums = new int[20];
	for (int i = 0; i < 20; i++) {
	    Random r = new Random();
	    randNums[i] = r.nextInt(10);
	}
	System.out.println("Before msort: " + m.toString(randNums));
	System.out.println("After msort: " + m.toString(m.msort(randNums)));
    }
}
