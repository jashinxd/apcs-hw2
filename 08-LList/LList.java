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

    public void add(String s, int i) {
	Node insert = new Node(s);
	Node prevN = nodeGet(i - 1);
	insert.setNext(prevN.getNext());
	prevN.setNext(insert);
	if (i == 0) {
	    l = dummy.getNext();
	}
	len++;
	System.out.println(this);
    }

    public Node nodeGet(int n) {
	Node tmp = dummy;
	for (int i = 0; i < n + 1; i++) {
	    tmp = tmp.getNext();
	}
	return tmp;
    }

    public String get(int n) {
	return nodeGet(n).getData();
    }

    public String remove(int n) {
	if (n >= len || n < 0) {
	    return "";
	}
        Node tmp = nodeGet(n - 1);
	String s = tmp.getNext().getData();
	tmp.setNext(tmp.getNext().getNext());
	if (n == 0) {
	    l = tmp.getNext();
	}
	len--;
	return s;
    }

    
    public boolean remove(String s) {
	Node tmp;
	for (tmp = dummy; tmp.getNext().getNext() != null; tmp = tmp.getNext()) {	    
	    if (tmp.getNext().getData().equals(s)) {
		System.out.println(tmp.getNext().getData());
		tmp.setNext(tmp.getNext().getNext());
		if (tmp == dummy) {
		    l = tmp.getNext();
		}
		return true;

	    }
	}
	tmp.setNext(null);
	return true;
    }

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
	l.add("Beautiful");
	l.add("World");
	System.out.println("l: " + l);
	System.out.println("l.get(0): " + l.get(0));
	System.out.println("l.get(1): " + l.get(1));
	System.out.println("l.get(2): " + l.get(2));	
	System.out.println("l.add(Awesome, 0): ");
	l.add("Awesome", 0);
	System.out.println("l.remove(3): ");
	l.remove(3);
	System.out.println(l);
	System.out.println("l.remove(Awesome): ");
	l.remove("Awesome");
	System.out.println(l);
    }
}
