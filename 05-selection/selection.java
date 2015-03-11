import java.io.*;
import java.util.*;

public class selection {

    public String toString(int[] a) {
	String ret = "[";
	for (int i = 0; i < a.length; i++) {
	    ret = ret + a[i] + ", ";
	}
	ret = ret.substring(0,ret.length() - 2) + "]";
	return ret;
    }

    /* -- Select by creating a new array
    public int select(int[] L, int SI, int EI) {
	int[] D = new int[L.length];
	for (int i = 0; i < L.length; i++) {
	    if (i < SI) {
		D[i] = L[i];
	    } else if (i > EI) {
		D[i] = L[i];
	    }
	}
	System.out.println(toString(D));
	int pivot = L[SI];
	for (int ind = SI; SI != EI; ind++) {
	    if (L[ind] < pivot) {
		D[SI] = L[ind];
		SI++;
	    } else if (L[ind] > pivot) {
		D[EI] = L[ind];
		EI--;
	    }
	    System.out.println("SI: " + SI);
	    System.out.println("EI: " + EI);
	    System.out.println(toString(D));
	}
	D[SI] = pivot;
	System.out.println(toString(D));
	return SI;
    }
    */

    // --Select using in place
    public int select(int[] A, int k, int low, int high) {
	Random r = new Random();
	//int pivotind = low + r.nextInt(high - low);
	int pivotind = low;
	int li = low;
	int hi = high;
	int swap;
	int pivot = A[pivotind];
	A[pivotind] = A[hi];
	A[hi] = pivot;
	hi--;
	System.out.println(pivot);
	System.out.println(toString(A));
	while (li < hi) {
	    if (A[li] < pivot) {
	        li++;
	    } else if (A[li] > pivot) {
		swap = A[li];
		A[li] = A[hi];
		A[hi] = swap;
		hi--;
	    }
	    if (li == hi) {
		if (A[li] < pivot) {
		    li++;
		    hi++;
		}
		A[high] = A[li];
		A[li] = pivot;
	    }
	    System.out.println(toString(A));
	}
	System.out.println("Done");
	System.out.println("li: " + li); 
	System.out.println(toString(A));
	if (li == k) {
	    return A[li];
	} else if (li > k) {
	    return select(A, k, low, li - 1);
	} else {
	    return select(A, k, li + 1, high);
	}
    }
    
    public static void main(String[] args) {
	selection s = new selection();
	int[] ai = new int[]{7,2,8,3,9,6,1,0,5,4};
	System.out.println(s.select(ai, 4, 0, ai.length - 1));
	//s.select(ai, 4, 0, ai.length - 1);
    }
}
