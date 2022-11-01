import java.util.*;
public class TestTree {
	public static void main(String[] args) {
		new TestTree().go();
	}
	public void go() {
		Book b1 = new Book("How Cats Work");
		Book b2 = new Book("Remix your Body");
		Book b3 = new Book("Finding Emo");
		BookCompare bc=new BookCompare();

		Set<Book> tree = new TreeSet<>(bc);
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		System.out.println(tree);
	}
}
class Book implement Comparable<Book>{
	String title;
	public Book(String t) {
		title = t;
	}

	public int compareTo(Book other) {
		return title.compareTo(other.title);
	}
}

class BookCompare implements Comparator<Book>{
	public int compare(Book one, Book two){
		return one.title.compareTo(two.title);
	}
}