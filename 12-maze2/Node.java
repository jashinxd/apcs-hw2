public class Node<E>{
    private E data;
    private int x, y;
    private Node<E> next;
    private Node<E> previous;

    public Node(E s){
	data = s;
	next = null;
    }
    public Node(E s, int xcor, int ycor){
	data = s;
	x = xcor;
	y = ycor;
	next = null;
    }
    public Node(){
	data = null;
	next = null;
    }

    public void setData(E s){
	data = s;
    }
    public E getData(){
	return data;
    }
    public int getX(){
	return x;
    }
    public int getY(){
	return y;
    }

    public void setNext(Node<E> n){
	next = n;
    }
    public Node<E> getNext(){
	return next;
    }

    public String toString(){
	return "" + data;
    }
}
