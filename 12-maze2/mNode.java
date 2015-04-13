public class mNode{
    
    private int x,y;
    private mNode prev;
    
    public mNode(int x, int y) {
	this.x = x;
	this.y = y;
    }

    public mNode getPrev(){
	return prev;
    }

    public void setPrev(mNode n) {
	prev = n;
    }
    
    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }
}
