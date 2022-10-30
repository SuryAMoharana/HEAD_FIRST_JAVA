public class TestBox {
	private Integer i=10;
	private int j=20;
	public static void main(String[] args) {
		TestBox t = new TestBox();
		t.go();
		System.out.println(String.format("I have %,.3f, bugs kitty fix",476578.09876));
		System.out.println(String.format("I have %,d, bugs kitty fix",476578));
		System.out.println(String.format("I have %.2f, bugs kitty fix",476578.453));
	}
	public void go() {
		j = i;
		System.out.println(j);
		System.out.println(i);
	}
}
