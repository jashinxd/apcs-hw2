public class LList {

    private Node l = null;

    public void add(String s) {
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }

    public Node nodeFind(int n) {
	for (int i = 0; i < n; i++) {
	    l = l.getNext();
	}
	return l;
    }

    public String find(int n) {
	return nodeFind(n).getData();
    }

    public void insert(String s, int i) {
	int atind1 = nodeFind(i);
	int atind2 = nodeFind(i - 1);
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
   
}
