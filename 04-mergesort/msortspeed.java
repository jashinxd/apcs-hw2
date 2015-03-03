import java.io.*;
import java.util.*;

public class msortspeed {
    public static void main(String[] args) {
	//100,000 elements in array
	mergesort m = new mergesort(100000, 1000);
	m.msortspeed();
    }
}
