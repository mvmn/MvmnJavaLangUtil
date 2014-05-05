package x.mvmn.lang.container;

public class TupleOfThree<A, B, C> {

	private final A first;
	private final B second;
	private final C third;

	public TupleOfThree(A first, B second, C third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public A getFirst() {
		return first;
	}

	public B getSecond() {
		return second;
	}

	public C getThird() {
		return third;
	}
}
