public class LList {

    private Node l = null;
    private Node dummy;
    private int len;

    public LList() {
	dummy = new Node("");
	dummy.setNext(l);
	len = 0;
    }

    public void add(String s) {
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
	dummy.setNext(l);
	len++;
    }

    public Node nodeGet(int n) {
	int ind = n + 1;
	Node tmp = dummy;
	for (int i = 0; i < ind; i++) {
	    tmp = tmp.getNext();
	}
	return tmp;
    }

    public String get(int n) {
	return nodeGet(n).getData();
    }

    public void add(String s, int i) {
	Node insert = new Node(s);
	insert.setNext(nodeGet(i));
	nodeGet(i - 1).setNext(insert);
	l = nodeGet(0);
	System.out.println(this);
    }

    /*
    public String remove(int n) {
	if (n < len || n < 0) {
	    return "";
	}
	Node t = l;
	for (int i = 0; i < n - 1; i++) {
	    t = t.getNext();
	}
	String s = t.getNext().getData();
	t.setNext(t.getNext().getNext());
	l = t.nodeGet(0);
	return s;
    }

    */
    public String toString() {
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp = tmp.getNext()) {
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public static void main(String[] args) {
	LList l = new LList();
	l.add("Hello");
	l.add("Beauitful");
	l.add("World");
	System.out.println("l: " + l);
	System.out.println("l.get(0): " + l.get(0));
	System.out.println("l.get(1): " + l.get(1));
	System.out.println("l.get(2): " + l.get(2));	
	System.out.println("l.add(Awesome, 0): ");
	l.add("Awesome", 0);
	System.out.println("l.remove(1): ");
	//l.remove(1);
	//System.out.println(l);
    }
}
