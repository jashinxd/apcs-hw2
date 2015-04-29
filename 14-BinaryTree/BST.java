public class BST {
    private Node root;

    public BST() {
	root = null;
    }

    public BST(int n) {
	root = new Node(n);
    }

    public void insert(Node r, int i) {
	Node n = new Node(i);
	if (r == null) {
	    root = n;
	} else {
	    boolean left = false;
	    Node tmp = r, piggyback = r;
	    while (tmp != null) {
		piggyback = tmp;
		if (i < tmp.getData()) {
		    tmp = tmp.getLeft();
		    left = true;
		} else {
		    tmp = tmp.getRight();
		    left = false;
		}
	    } if (left) {
		piggyback.setLeft(n);
	    } else {
		piggyback.setRight(n);
	    }
	}
    }

    public Node search(Node root, int i){
	while (root!=null){
	    int n = i - root.getData();
	    if (n==0){
		return root;
	    } else if(n>0){
		root=root.getRight();
	    } else if (n<0){
		root=root.getLeft();
	    }
	}
	return root;
    }
    
    public Node searchR(Node t, int i) {
	if (t == null || t.getData() == i) {
	    return t;
	} else if (i<t.getData()) {
	    return searchR(t.getLeft(), i);
	} else {
	    return searchR(t.getRight(), i);
	}
    }

    public String traverse(Node n) {
	String s = "";
	if (n == null) {
	    return "";
	} else {
	    s = s + traverse(n.getLeft()) + " " + n.getData() + " " + traverse(n.getRight());
	}  
	return s;
    }
    
    public Node remove(int i) {
	Node piggyback = null;
	Node tmp = null;
	boolean left = true;
	if (root == null) {
	    return root;
	} else {
	    tmp = root;
	    while (tmp.getData() != i) {
		piggyback = tmp;
		if (i < tmp.getData()) {
		    tmp = tmp.getLeft();
		    left = true;
		} else {
		    tmp = tmp.getRight();
		    left = false;
		}
	    }
	    if (tmp == null) {
		return tmp;
	    } else if (tmp.getLeft() == null && tmp.getRight() == null) {
		if (left) {
		    piggyback.setLeft(null);
		} else {
		    piggyback.setRight(null);
		}
		return tmp;
	    } else if (left) {
		if (tmp.getLeft() == null) {
		    piggyback.setLeft(tmp.getRight());
		} else piggyback.setLeft(tmp.getLeft());
	    } else if (!left) {
		if (tmp.getLeft() == null) {
		    piggyback.setRight(tmp.getRight());
		} else piggyback.setRight(tmp.getLeft());
	    }
	}
    }

    public String toString() {
	return "" + traverse(root);
    }

    public static void main(String[] args) {
	BST b = new BST();
	b.insert(b.root, 5);
	b.insert(b.root, 20);
	b.insert(b.root, 30);
	System.out.println(b);
	System.out.println(b.search(b.root, 30));
    }
}

    
