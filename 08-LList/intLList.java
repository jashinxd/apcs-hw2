public class intLList {

    private intNode l = null;
    private intNode dummy;
    private int len;

    public intLList() {
	dummy = new intNode(-1);
	dummy.setNext(l);
	len = 0;
    }

    public LLit getLLit() {
	LLit llit = new LLit(l);
	return llit;
    }

    public void add(int s) {
	intNode tmp = new intNode(s);
	tmp.setNext(l);
	l = tmp;
	dummy.setNext(l);
	len++;
    }

    public void add(int s, int i) {
	intNode insert = new intNode(s);
	intNode prevN = nodeGet(i - 1);
	insert.setNext(prevN.getNext());
	prevN.setNext(insert);
	if (i == 0) {
	    l = dummy.getNext();
	}
	len++;
	System.out.println(this);
    }

    public intNode nodeGet(int n) {
	intNode tmp = dummy;
	for (int i = 0; i < n + 1; i++) {
	    tmp = tmp.getNext();
	}
	return tmp;
    }

    public int get(int n) {
	return nodeGet(n).getData();
    }

    public int indremove(int n) {
	if (n >= len || n < 0) {
	    return -1;
	}
        intNode tmp = nodeGet(n - 1);
	int s = tmp.getNext().getData();
	tmp.setNext(tmp.getNext().getNext());
	if (n == 0) {
	    l = tmp.getNext();
	}
	len--;
	return s;
    }

    
    public boolean remove(int s) {
	intNode tmp;
	for (tmp = dummy; tmp.getNext().getNext() != null; tmp = tmp.getNext()) {	    
	    if (tmp.getNext().getData() == s) {
		System.out.println(tmp.getNext().getData());
		tmp.setNext(tmp.getNext().getNext());
		if (tmp == dummy) {
		    l = tmp.getNext();
		}
		return true;

	    }
	}
	len--;
	tmp.setNext(null);
	return true;
    }

    public String toString() {
	String s = "";
	intNode tmp;
	for (tmp = l; tmp != null; tmp = tmp.getNext()) {
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
    
    public int size() {
	return len;
    }

    public static void main(String[] args) {
	intLList l = new intLList();
	l.add(2);
	l.add(1);
	l.add(0);
	System.out.println("l: " + l);
	System.out.println("l.get(0): " + l.get(0));
	System.out.println("l.get(1): " + l.get(1));
	System.out.println("l.get(2): " + l.get(2));	
	System.out.println("l.add(-1, 0): ");
	l.add(-1, 0);
	System.out.println("l.indremove(3): ");
	l.remove(3);
	System.out.println(l);
	System.out.println("l.remove(0): ");
	l.remove(0);
	System.out.println(l);
    }
}
