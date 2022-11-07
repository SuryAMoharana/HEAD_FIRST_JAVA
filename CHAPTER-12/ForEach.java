import java.util.*;
import java.util.stream.*;

class ForEach{
	public static void main(String[] args) {
		List<String> strings=List.of("I","am","a","List");

		Stream<String> stream=strings.stream().sorted((a,b)->a.compareToIgnoreCase(b));

		System.out.println(stream);

	}
}