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
	if (n == null) {
	    return null;
	} else {
	    return n.getData() + "\nLeft: " + traverse(n.getLeft()) + " Right " + traverse(n.getRight());
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

    
