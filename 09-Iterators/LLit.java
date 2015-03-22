import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E>{
    private Node<E> t;
    private Node<E> prev;
    private boolean nextCalled = false;
    private boolean removeCalled = false;
    public LLit(Node<E> n){
	t = n;
    }

    public boolean hasNext(){
	return t.getNext() != null;
    }

    public E next(){
	E retval = t.getNext().getData();
	//if (!removeCalled) {
	    prev = t;
	    t = t.getNext();
	    //}
	//t = t.getNext();
	nextCalled = true;
	removeCalled = false;
	return retval;
    }

    public void remove() {
	if (nextCalled && !removeCalled) {
	    prev.setNext(t.getNext());
	    //prev = t;
	    //t = prev.getNext();
	    //t = t.getNext();
	    removeCalled = true;
	}  
    }
}
