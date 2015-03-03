import java.io.*;
import java.util.*;

public class nqueens2{
    private char[][] chessboard;
    private ArrayList<Integer> queenCoors;
    private int size;
    private char queen = 'Q';
    private char empty = '.';
    private char bad = 'X';
    private int numQueen = 0;
    private int numEmpty = 0;
    private boolean solved = false;

    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    
    public nqueens2(int s) {
	size = s;
	chessboard = new char[size][size];
	for (int i = 0; i < size; i++) {
	    for (int n = 0; n < size; n++) {
		chessboard[i][n] = '.';
		numEmpty++;
	    }
	}
	queenCoors = new ArrayList<Integer>();
	for (int i = 0; i < size; i++) {
	    queenCoors.add(-1);
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
	int xcor = queenCoors.indexOf(y);
	int ycor = queenCoors.get(x);
	boolean add = true;
	//int[] badx = new int[](n*n);
	//int[] bady = new int[](n*n);
	if (chessboard[x][y] != empty ||
	    solved) {
	    return;
	}

	if (xcor != -1 ||
	    ycor != -1) {
	    add = false;
	} else {
	    for (int i = 0; i < size; i++) {
		if (y - i - 1 >= 0 && x - i - 1 >= 0) {
		    if (chessboard[x - i - 1][y - i - 1] == queen ||
			chessboard[x - i - 1][y - i - 1] == bad) {
			add = false;
		    }
		}
		if (y + i + 1 < size && x + i + 1 < size) {
		    if (chessboard[x + i + 1][y + i + 1] == queen ||
			chessboard[x + i + 1][y + i + 1] == bad) {
			add = false;
		    }
		}
		if (y + i + 1 < size && x - i - 1 >= 0) {
		    if (chessboard[x - i - 1][y + i + 1] == queen || 
			chessboard[x - i - 1][y + i + 1] == bad) {
			add = false;
		    }
		}
		if (y - i - 1 >= 0 && x + i + 1 < size) {
		    if (chessboard[x + i + 1][y - i - 1] == queen ||
			chessboard[x + i + 1][y - i - 1] == bad) {
			add = false;
		    }
		}
	    }	
	    /*
	    for (int i = 0; i < size; i++) {
		if (x - i - 1 >= 0 && y - i - 1 >= 0) {
		    if (queenCoors.get(x - i - 1) != -1 &&
			queenCoors.indexOf(y - i - 1) != -1 ) {
			return;
		    }
		}
		if (x + i + 1 < size && y + i + 1 < size) {
		    if (queenCoors.get(x + i + 1) != -1 && 
			queenCoors.indexOf(y + i + 1) != -1) {
			return;
		    }
		}
		if (ycor + i + 1 < size && xcor - i - 1 >= 0) {
		    if (queenCoors.get(x - i - 1) != -1 && 
			queenCoors.indexOf(y + i + 1) != -1) {
			return;
		    }
		}
		if (ycor - i - 1 >= 0 && xcor + i + 1 < size) {
		    if (queenCoors.get(x + i + 1) != -1  &&
			queenCoors.indexOf(y - i - 1) != -1) {
			return;
		    }
		}
	    */
	}
	if (add = true) {
	    chessboard[x][y] = queen;
	    queenCoors.set(x, y);
	    numQueen++;
	    numEmpty--;
	}
	if (numQueen == size) {
	    System.out.println(this);
	    solved = true;
	}

	/*		    
	for (int i = 0; i < size; i++) {
	    if (chessboard[x][i] == empty) {
		chessboard[x][y] = bad;
		numEmpty--;
	    }
	    if (chessboard[i][y] == empty) {
		chessboard[i][y] = bad;
		numEmpty--;
	    }	  
	    
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

	*/

	delay(1000);
	System.out.println(this);
	if (x == size - 1 && y == size - 1) {
	    chessboard[queenCoors.size() - 1][queenCoors.get(queenCoors.size() - 1)] = bad;
	    queenCoors.remove(queenCoors.size() - 1);
	}
        for (int i = 0; i < size; i++) {
	    for (int n = 0; n < size; n++) {
		solve(i, n);
	    }
	}
    }

    public static void main(String[] args) {
	nqueens2 s = new nqueens2(9);
	s.solve(0, 2);
    }
}
    

