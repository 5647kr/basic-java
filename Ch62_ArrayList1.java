import java.util.ArrayList;

public class Ch62_ArrayList1 {
	public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
		for(int i = 0; i < arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}

		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");

		for(int i = 0; i < al.size(); i++) {
			String value = al.get(i);
			System.out.println("value: " + value);
			System.out.println("al.get(i): " + al.get(i));
		}
	}
}
