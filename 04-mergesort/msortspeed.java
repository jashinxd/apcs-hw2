import java.io.*;
import java.util.*;

public class msortspeed {
    public static void main(String[] args) {
	//100,000 elements in array, numbers from 0 - 999
	mergesort m = new mergesort(500000, 1000);
	m.msortspeed();
    }
}
