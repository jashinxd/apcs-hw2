import java.util.*;
import java.io.*;

public class Maze{
    private char[][]board;
    private Queue frontier;
    private int maxX;
    private int maxY;
    private char wall=' ';
    private char exit='$';
    private char path='#';
    private char me='z';
    private char visited='.';
    private boolean solved = false;

    public Maze(){
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
	try{
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext()){
		String line = sc.nextLine();
		for (int i=0;i<maxX;i++){
		    board[i][j] = line.charAt(i);
		}
		j++;
	    }
	} catch (Exception e){}
    }
    public String toString(){
	//String s = "[2J\n";
	String s = "[2J\n";
	//s = s + "[31;43m";
	for (int y=0;y<maxY;y++){
	    for (int x=0;x<maxX;x++){
		s = s + board[x][y];
	    }
	    s=s+"\n";
	} return s;
    }
    public void solve(int x, int y){
	/*try{
	    Thread.sleep(50);
	} catch (Exception e){}*/
	/*if (board[x][y]==wall    ||
	    board[x][y]==me      ||
	    board[x][y]==visited ||
	    solved){
	    return;
	} if (board[x][y]==exit){
	    System.out.println(this);
	    //System.exit(0);
	    solved = true;
	}
	try{
	    Thread.sleep(50);
	} catch (Exception e){}
	System.out.println(this);
	board[x][y]=me;
	solve(x+1,y);
	solve(x-1,y);
	solve(x,y-1);
	solve(x,y+1);
	if (!solved){
	    board[x][y]=visited;
	}*/
	frontier = new Queue();
	frontier.enqueue(board[x][y], x, y);
	//System.out.println(frontier);
	//System.out.println(x);
	//System.out.println(frontier.head().getX());
	while (!frontier.empty()){
	    Node<Character> current = frontier.dequeue();
	    board[current.getX()][current.getY()] = me;
	    //System.out.println(current.getX());
	    //System.out.println(current.getY());
	    if(board[current.getX()+1][current.getY()] == path){
		frontier.enqueue(board[current.getX()+1][current.getY()], current.getX()+1, current.getY(), current);
	    } if(board[current.getX()-1][current.getY()] == path){
		frontier.enqueue(board[current.getX()-1][current.getY()], current.getX()-1, current.getY(),current);
	    } if(board[current.getX()][current.getY()+1] == path){
		frontier.enqueue(board[current.getX()][current.getY()+1], current.getX(), current.getY()+1, current);
	    } if(board[current.getX()][current.getY()-1] == path){
		frontier.enqueue(board[current.getX()][current.getY()-1], current.getX(), current.getY()-1, current);
	    }
	    try{
		Thread.sleep(25);
	    } catch (Exception e){}
	    System.out.println(this);
	}
    }
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	m.solve(1,1);
	System.out.println(m);
    }
}
