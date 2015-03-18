public class intNode {
    
    private int data;
    private intNode next;

    public intNode(int s) {
	data = s;
    }
    
    public void setData(int s) {
	data = s;
    }
    
    public int getData() {
	return data;
    }

    public void setNext(intNode n) {
	next = n;
    }

    public intNode getNext() {
	return next;
    }

    public String toString() {
	return "" + data;
    }
}
