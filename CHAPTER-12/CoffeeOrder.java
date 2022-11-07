import java.util.*;
import java.util.stream.*;

class CoffeeOrder{
	public static void main(String[] args) {
		List<String> coffees=List.of("Cappuccino","Americano","Espresso","Cortado","Mocha","Cappuccino","Flat White","Lette");

		List<String> coffeesEndingInO=coffees.stream().distinct().sorted().filter(s->s.endsWith("o")).collect(Collectors.toList());

		System.out.println(coffeesEndingInO);
	}
}