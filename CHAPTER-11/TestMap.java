import java.util.*;

public class TestMap{

	public static void main(String[] args) {
		Map<String,Integer> scores=new HashMap<>();
		scores.put("Surya",500);
		scores.put("Ashok",200);
		scores.put("Sarada",100);

		System.out.println(scores);
		System.out.println(scores.get("Ashok"));
	}
	
}