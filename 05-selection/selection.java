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
	return SI;
    }
    
    public static void main(String[] args) {
	selection s = new selection();
	int[] ai = new int[]{7,2,8,3,9,6,1,0,5,4};
	System.out.println(s.select(ai, 0, ai.length - 1));
    }
}
