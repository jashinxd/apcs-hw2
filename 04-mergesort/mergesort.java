import java.io.*;
import java.util.*;

public class mergesort {
    private ArrayList<Integer> deck = new ArrayList<Integer>();
    //private ArrayList<Integer> a = new ArrayList<Integer>();
    //private ArrayList<Integer> b = new ArrayList<Integer>();

    /*
    public mergesort() {
	Random r = new Random();
	for (int i = 0; i < 5; i++) {
	    //a.add(r.nextInt(10));
	    //b.add(r.nextInt(10));
	    a.add(i);
	    b.add(i);
	}
    }
    */

    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
	ArrayList<Integer> sorted = new ArrayList<Integer>();
	while (a.size() > 0 || b.size() > 0) {
	    if (b.size() == 0 && a.size() > 0) {
		sorted.add(a.get(0));
		a.remove(0);	       
	    } else if (a.size() == 0 && b.size() > 0) {
		sorted.add(b.get(0));
		b.remove(0);		
	    } else if (a.get(0) <= b.get(0)) {
		sorted.add(a.get(0));
		a.remove(0);
	    } else if (b.get(0) <= a.get(0)) {
		sorted.add(b.get(0));
		b.remove(0);
	    }
	}
	return sorted;
    }
	    
	    
	//if (a.size <= 1) return a;
	//if (b.size <= 1) return b;
    public static void main(String[] args) {
	mergesort m = new mergesort();
	ArrayList<Integer> a = new ArrayList<Integer>();
	ArrayList<Integer> b = new ArrayList<Integer>();
	for (int i = 0; i < 5; i++) {
	    a.add(i);
	    b.add(i);
	}
	a.add(7);
	a.add(9);
	b.add(5);
	b.add(6);
	System.out.println(a);
	System.out.println(b);
	System.out.println(m.merge(a, b));	
    }
}

    
