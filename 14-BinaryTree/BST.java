public class BST {
    private Node root;

    public BST() {
	root = null;
    }

    public BST(int n) {
	root = new Node(n);
    }

    public void insert(Node r, int i) {
	if (r == null) {
	    root = new Node(i);
	} else {
	    boolean left = false;
	    Node n = new Node(i);
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
	    }
	    if(n>0){
		root=root.getRight();
	    } else if (n<0){
		root=root.getLeft();
	    }
	}
	return root;
    }
 
    public String toString() {
	return ""+root;
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

    
