import java.io.*;
import java.util.*;
import java.lang.System;
public class test {
    public static void main(String[] args) {
	long t = System.currentTimeMillis();
	//System.out.println(t);
	long alstart, alelapsed;
	long llstart, llelapsed;
	long bistart, bielapsed;

	Random rnd = new Random();
	ArrayList<Integer> al = new ArrayList<Integer>();
	for (int i = 0; i < 100000; i++) {
	    al.add(rnd.nextInt(11));
	}
	
	intLList ll = new intLList();
	for (int i = 0; i < 100000; i++) {
	    ll.add(rnd.nextInt(11));
	}
	
	LinkedList<Integer> bi = new LinkedList<Integer>();
	for (int i = 0; i < 100000; i++) {
	    bi.add(rnd.nextInt(11));
	}
	
	//Timing for ArrayList
	alstart = System.currentTimeMillis();
	int alSum = 0;
	for (int i = 0; i < al.size(); i++) {
	    alSum += al.get(i);
	}
	alelapsed = System.currentTimeMillis() - alstart;
	System.out.println("Time for Arraylist " + alelapsed);

	//Timing for LinkedList
	llstart = System.currentTimeMillis();
	int llSum = 0;
	for (int i = 0; i < ll.size(); i++) {
	    llSum += ll.get(i);
	}
	llelapsed = System.currentTimeMillis() - llstart;
	System.out.println("Time for Linkedlist " + llelapsed);

	//Timing for Built in LinkedList
	bistart = System.currentTimeMillis();
	int biSum = 0;
	for (int i = 0; i < bi.size(); i++) {
	    biSum += bi.get(i);
	}
	bielapsed = System.currentTimeMillis() - bistart;
	System.out.println("Time for BI LinkedList " + bielapsed);
	
    }
}
