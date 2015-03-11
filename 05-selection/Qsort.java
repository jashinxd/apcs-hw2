import java.io.*;
import java.util.*;

public class Qsort {
    private int[] a;

    public Qsort(int[] array) {
	a = array;
    }

    public String toString() {
	String ret = "[";
	for (int i = 0; i < a.length; i++) {
	    ret = ret + a[i] + ", ";
	}
	ret = ret.substring(0,ret.length() - 2) + "]";
	return ret;
    }

    // --Select using in place
    public void qsort(int[] A, int low, int high) {
        if (low >= high) {
	    return;
	}
	int pivotind = low;
	int li = low;
	int hi = high;
	int swap;
	int pivot = A[pivotind];
	A[pivotind] = A[hi];
	A[hi] = pivot;
	hi--;
	System.out.println("Start:" + this);
	System.out.println("Pivot: " + pivot);
	System.out.println("li: " + li);
	System.out.println("hi: " + hi);
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
	    System.out.println(this);
	    System.out.println("li: " + li);
	    System.out.println("hi: " + hi);
	}
	System.out.println("Done");
	qsort(A, low, li - 1);
	qsort(A, li + 1, high);
    }

    public void sort() {
	qsort(a, 0, a.length - 1);
	System.out.println(this);
    }
    
    public static void main(String[] args) {
	int[] ai = new int[]{4,1,6,2,8,3,0,5,9,7};
	Qsort s = new Qsort(ai);
	s.sort();
	//s.select(ai, 4, 0, ai.length - 1);
    }
}
