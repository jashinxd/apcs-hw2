public class Queue<E> {
    
    private Node<E> start;
    private Node<E> end;
    private int len;

    public Queue() {
	start = new Node<E>();
	end = new Node<E>();
	start.setNext(end);
	len = 0;
    }

    public void enqueue(E data) {
	len++;
	Node<E> d = new Node<E>(data);
	Node<E> temp = start.getNext();
	start.setNext(d);
	d.setNext(temp);
	if (len == 1) {
	    end = temp;
	}
    }

    public E dequeue() {
	/*
	if (len==0) {
	    return "Len = 0";
	}
	*/
	E ans = start.getData();
	if (len == 1) {
	    ans= start.getNext().getData();
	    start.setNext(end);
	    len--;
	}
	else {
	    for (Node<E> tmp = start.getNext(); tmp != null; tmp = tmp.getNext()) {
		if (tmp.getNext().getNext() == null) {
		    ans = tmp.getNext().getData();
		    tmp.setNext(null);
		    end = tmp;
		    len--;
		}
	    }
	}
	return ans;
    }
    
    public boolean empty() {
	return len == 0;
    }

    public E head() {
	return start.getNext().getData();
    }

    public String toString(){
	String s = "";
	Node<E> tmp;
	for (tmp=start.getNext() ; tmp!=end ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public static void main(String[] args) {
	Queue q = new Queue();
	q.enqueue(1);
	q.enqueue(2);
	q.enqueue(3);
	q.enqueue(4);
	System.out.println(q);
	System.out.println(q.dequeue());
	System.out.println(q);
	System.out.println(q.empty());
	System.out.println(q.head());
    }
}
