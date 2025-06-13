import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ch64_Set2 {
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);

		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);

		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);

		System.out.println(A.containsAll(B));
		System.out.println(A.containsAll(C));

//		합집합
		A.addAll(B);
//		교집합
//		A.retainAll(B);
//		차집합
//		A.retainAll(B);

		Iterator hi = (Iterator) A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
	}
}
