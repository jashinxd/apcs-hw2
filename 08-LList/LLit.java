public class LLit {
    private intNode l;
    public LLit(intNode n) {
	l = n.getNext();
    }
    
    public boolean hasNext() {
	return l == null;
    }

    //Move to the next node and returns the value in the node before the move
    public int next() {
	int i = l.getData();
	l = l.getNext();
	return i;
    }
}
		 
