package x.mvmn.lang.container;

public class TupleOfTwo<A, B> {

	private final A one;
	private final B two;

	public TupleOfTwo(A one, B two) {
		this.one = one;
		this.two = two;
	}

	public A getOne() {
		return one;
	}

	public B getTwo() {
		return two;
	}
}
