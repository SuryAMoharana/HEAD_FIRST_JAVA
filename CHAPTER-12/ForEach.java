import java.util.*;
import java.util.stream.*;

class ForEach{
	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Hi!");
		Consumer<String> c = s ->System.out.println(s);
		Supplier<String> s = () ->System.out.println("Some string");
		Consumer<String> c = (s1, s2) ->System.out.println(s1 + s2);
		Runnable r = (String str) ->System.out.println(str);
		Function<String, Integer> f = s ->s.length();
		Supplier<String> s = () -> "Some string";
		Consumer<String> c = s -> "String" + s;
		Function<String, Integer> f = (int i) -> "i =" + i;
		Supplier<String> s = s -> "Some string: " +s;
		Function<String, Integer> f = (String s) ->s.length();
	}
}