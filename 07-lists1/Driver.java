public class Driver {

    public static void main(String[] args) {
	Node n = new Node("Hello");
	//System.out.println(n);
	
	Node n2 = new Node("World");
	//System.out.println(n2);
	
	n.setNext(n2);

	//System.out.println(n.getNext().getData());
	//System.out.println(n.getNext());

	n.getNext().setData("Pickle");
	//System.out.println(n2);
	//System.out.println(n.getNext().getData());
	
	n2.setData("Watermelon");
	//System.out.println(n.getNext().getData());

	n2.setNext(new Node("abc"));
	//System.out.println(n.getNext().getNext().getData());

	n.getNext().getNext().setNext(new Node("yabba dabba doo"));

	// Setting new node at the beginning
	Node tmp = new Node("Start");
	tmp.setNext(n);
	//You have to do this b/c we want to keep n at the start of the list
	n = tmp;
	//System.out.println(tmp);
	//System.out.println(n);
	//System.out.println(n.getNext());

	//Printing out all elements in Linked List
	//tmp loops through the whole LL, tmp = tmp.getNext() is equivalent to
	//i++
	tmp = n;
	while (tmp != null) {
	    System.out.println(tmp);
	    tmp = tmp.getNext();
	}
	System.out.println();
	for (tmp = n; tmp != null; tmp = tmp.getNext()) {
	    System.out.println(tmp);
	}
    }
}
