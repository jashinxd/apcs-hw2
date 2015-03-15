public class DriverLL {
    public static void main(String[] args) {
	LList l = new LList();
	l.add("Hello");
	l.add("Beauitful");
	l.add("World");
	System.out.println("l: " + l);
	System.out.println("l.find(1): " + l.find(1));
	System.out.println("l.insert(Awesome, 0): ");
	l.insert("Awesome", 0);
    }
}
