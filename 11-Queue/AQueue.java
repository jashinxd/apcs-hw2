public class AQueue {
    
    private int[] a;
    
    public AQueue() {
	a = new int[0];
    }

    public void enqueue(int data) {
	int[] n = new int[a.length+1];
	n[0] = data;
	for(int i = 0; i <a.length; i++) {
	    n[i + 1 ] = a[i];
	}
	a = n;
    }
    
    public String toString() {
	String ret = "[";
	for (int i = 0; i < a.length; i++) {
	    ret = ret + a[i] + ", ";
	}
	ret = ret + "]";
	return ret;
    }

    public static void main(String[] args) {
	AQueue a = new AQueue();
	a.enqueue(1);
	System.out.println(a);
    }
}
    
