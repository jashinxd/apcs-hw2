import java.io.*;
import java.util.*;

public class alselection {

    public int select(ArrayList<Integer>  L, int SI, int EI) {
	ArrayList<Integer> D = new ArrayList<Integer>();
	for (int i = 0; i < L.size(); i++) {
	    if (i < SI) {
		D.set(i, L.get(i));
	    } else if (i > EI) {
		D.set(i, L.get(i));
	    }
	}
	System.out.println(D);
	int pivot = L.get(SI);
	for (int ind = SI; SI != EI; ind++) {
	    if (L.get(ind) < pivot) {
		D.set(SI, L.get(ind));
		SI++;
	    } else if (L.get(ind) > pivot) {
		D.set(EI, L.get(ind));
		EI--;
	    }
	    System.out.println("SI: " + SI);
	    System.out.println("EI: " + EI);
	}
	D.set(SI, pivot);
	System.out.println(D);
	return SI;
    }
    
    public static void main(String[] args) {
	alselection s = new alselection();
	ArrayList<Integer> ai = new ArrayList<Integer>(Arrays.asList(4,1,6,2,3,8,7,9,5,0));
	
	System.out.println(s.select(ai, 0, ai.size() - 1));
    }
}
