import java.util.*;
import java.io.*;
import java.lang.Double;

public class Frontier{
    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(Node n){
	Node tmp = l.peekFirst();
	if (tmp == null) {
	    l.add(n);
	} else {
	    System.out.println(tmp.getPriority());
	    System.out.println(n.getPriority());
	    System.out.println(Double.compare(n.getPriority(), tmp.getPriority()));
	    int ind = 0;
	    while (Double.compare(n.getPriority(), tmp.getPriority()) < 0 || tmp != null){
		ind++;
		tmp = tmp.getNext();
	    }
	    l.add(ind, n);
    	}
    }
    
    public Node remove(){
	Node r = l.remove();
	return r;
    }
    
    public boolean isEmpty(){
	return l.isEmpty();
    }
}
