import java.util.*;
import java.util.stream.*;

class ForEach{
	public static void main(String[] args) {
		List<Integer> numbers=List.of(1,2,3,4,5);

		Stream<Integer> stream=numbers.stream();

		System.out.println(Arrays.toString(stream));

	}
}