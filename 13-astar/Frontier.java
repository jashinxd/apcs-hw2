import java.util.*;

public class Frontier {
    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(int priority, Node n){
	Node tmp = l.peek();
	int ind = 0;
	while (n.getPriority() > tmp.getPriority()) {
	    ind++;
	    tmp = tmp.getNext();
	}
	l.add(ind, n);
    }

    public Node remove() {
	return l.remove(0);
    }

    public boolean isEmpty(){
	return l.isEmpty();
    }
}










