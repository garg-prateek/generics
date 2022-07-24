import java.util.ArrayList;

public class WildCardParams {
	public static void main(String[] args) {
		WildCardParams wcp = new WildCardParams();
		wcp.myMethod(new ArrayList<A>());
	}

	public void myMethod(ArrayList<? super B> l) {
		l.add(null);
		l.add(new B());
		// l.add("Pkg");// ? is wild card and it allow only null.
	}

}
