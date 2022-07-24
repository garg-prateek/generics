
public class Test {

	public static void main(String[] args) {
		MyGenericClass<String> s = new MyGenericClass<String>("Prateek");
		s.displayObjectDetails();
		System.out.println(s.getObject());

		MyGenericClass<Integer> i = new MyGenericClass<Integer>(123);
		i.displayObjectDetails();
		System.out.println(i.getObject());

		MyGenericClass<Double> d = new MyGenericClass<>(123.25);
		d.displayObjectDetails();
		System.out.println(d.getObject());

	}

}
