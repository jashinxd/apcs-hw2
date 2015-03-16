public class LList {

    private Node l = null;

    public void add(String s) {
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }

    public Node nodeFind(int n) {
	Node tmp = l;
	for (int i = 0; i < n; i++) {
	    tmp = tmp.getNext();
	}
	return tmp;
    }

    public String find(int n) {
	return nodeFind(n).getData();
    }

    public void insert(String s, int i) {
	if (i == 0) {
	   add(s);
	} else {
	    Node insert = new Node(s);
	    insert.setNext(nodeFind(i));
	    nodeFind(i - 1).setNext(insert);
	}
	System.out.println(this);
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
	l.add("Beauitful");
	l.add("World");
	System.out.println("l: " + l);
	System.out.println("l.find(1): " + l.find(1));
	System.out.println("l.find(2): " + l.find(2));
	System.out.println("l.insert(Awesome, 1): ");
	l.insert("Awesome", 1);
    }
}
