
public class MethodLevelGenerics {

	public <T> void method1(T t) {
		System.out.println("garg");

	}

	public <T extends Runnable> void method2(T t) {

	}

	public <T extends Runnable & Comparable<String>> void method3(T t) {

	}

	public static void main(String[] args) {
		MethodLevelGenerics g = new MethodLevelGenerics();
		g.method1(null);
		g.method2(null); //null ki jagah kya kya daal sakte h or T t in method() kya h
		g.method3(null);
	}
}
