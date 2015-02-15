import java.io.*;
import java.util.*;

public class nqueens{
    private char[][] chessboard;
    private int size;
    private char queen = 'Q';
    private char bad = '.';
    private char empty = 'X';
    private int numQueen = 0;
    private int numEmpty = 0;
    private boolean solved = false;

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
		numEmpty++;
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
	s += "\n";
	return s;
    }

    public void solve(int x, int y) {
	Random r = new Random();
	//int[] badx = new int[](n*n);
	//int[] bady = new int[](n*n);
	char[][] origboard = chessboard;
	int origNumEmpty = numEmpty;
	int origNumQueen = numQueen;
	if (numEmpty == 0 ||
	    chessboard[x][y] != empty ||
	    solved) {
	    return;
	}
	if (numQueen == size) {
	    System.out.println(this);
	    solved = true;
	}
	chessboard[x][y] = queen;
	numQueen++;
	numEmpty--;
	for (int i = 0; i < size; i++) {
	    if (chessboard[x][i] == empty) {
		chessboard[x][i] = bad;
		numEmpty--;
	    }
	    if (chessboard[i][y] == empty) {
		chessboard[i][y] = bad;
		numEmpty--;
	    }	  
	    if (y - i - 1 >= 0 && x - i - 1 >= 0) {
		if (chessboard[x - i - 1][y - i - 1] == empty) {
		    chessboard[x - i - 1][y - i - 1] = bad;
		    numEmpty--;
		}
	    }
	    if (y + i + 1 < size && x + i + 1 < size) {
		if (chessboard[x + i + 1][y + i + 1] == empty) {
		    chessboard[x + i + 1][y + i + 1] = bad;
		    numEmpty--;
		}
	    }
	    if (y + i + 1 < size && x - i - 1 >= 0) {
		if (chessboard[x - i - 1][y + i + 1] == empty) {
		    chessboard[x - i - 1][y + i + 1] = bad;
		    numEmpty--;
		}
	    }
	    if (y - i - 1 >= 0 && x + i + 1 < size) {
		if (chessboard[x + i + 1][y - i - 1] == empty) {
		    chessboard[x + i + 1][y - i - 1] = bad;
		    numEmpty--;
		}
	    }
	}

	delay(100);
	System.out.println(this);
        for (int i = 0; i < size; i++) {
	    for (int n = 0; n < size; n++) {
		if (numEmpty == 0) {
		    chessboard = origboard;
		    numQueen = origNumQueen;
		    numEmpty = origNumEmpty;
		}	
		solve(i, n);	
	    }
	}
    }

    public static void main(String[] args) {
	nqueens s = new nqueens(9);
	s.solve(0, 2);
    }
}
    
