import java.io.*;
import java.util.*;
public class Tree{

    private Node root;

    public Tree() {
	root = null;
    }
    
    public Tree(int i) {
	root = new Node(i);
    }

    public void add(Node root, int i) {
	Node tmp = new Node(i);
	if (root == null) {
	    root = tmp;
	} else if (root.getLeft() == null) {
	    root.setLeft(tmp);
	} else if (root.getRight() == null) {
	    root.setRight(tmp);
	} else {
	    Random r = new Random();
	    if (r.nextInt(2) == 0){
		add(root.getLeft(), i);
	    } else {
		add(root.getRight(), i);
	    }
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
    

    public String toString() {
	return "" + traverse(root);
    }

    /*
    public int maxvalue(Node n) {
	if (n == null) {
	    r
    }

    public int height(Node n) {

    }

    public String maxpath(Node n) {

    }

    public void splitdupes(Node n) {

    }
    */

    public static void main(String[] args) {
	Tree b = new Tree();
	b.add(b.root, 5);
	b.add(b.root, 20);
	b.add(b.root, 30);
	System.out.println(b);
    }
}
