import java.io.*;
import java.util.*;

public class nqueens{
    private char[][] chessboard;
    private int size;

    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    
    public nqueens(int s) {
	size = s;
	chessboard = new char[size][size];
	for (int i = 0; i < size; i++) {
	    for (int n = 0; n < size; n++) {
		chessboard[i][n] = 'X';
	    }
	}
    }

    public String toString() {
	String s = "";			
	for (int i = 0; i < size; i++) {
	    for (int n = 0; n < size; n++) {
		s = s + " " + chessboard[i][n];
	    }
	    if (i != size - 1) {
		s = s + "\n";
	    }
	}
	return s;
    }

    public void solve(int x, int y) {
	
	

    }

    public static void main(String[] args) {
	nqueens s = new nqueens(5);
	System.out.println(s);
    }
}
    
