import java.util.*;

public class Frontier {
    public LinkedList<mNode> l = new LinkedList<mNode>();
    
    public void add(mNode n) {
	l.add(n);
    }

    public mNode remove() {
	mNode r = l.remove();
	return r;
    }

    public boolean isEmpty() {
	return l.isEmpty();
    }
}
