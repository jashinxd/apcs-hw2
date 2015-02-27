import java.io.*;
import java.util.*;

public class msortspeed {
    public static void main(String[] args) {
	mergesort m = new mergesort();
	ArrayList<Integer> randNums = new ArrayList<Integer>();
	for (int i = 0; i < 1000000; i++) {
	    Random r = new Random();
	    randNums.add(r.nextInt(1000));
	}
	System.out.println("Before msort: " + randNums);
	System.out.println("After msort: " + m.msort(randNums));
	//m.msort(randNums);
    }
}
