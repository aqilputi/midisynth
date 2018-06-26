package genius;

/**
 * triplets to handle list
 * 
 * @author Carolina Arenas Okawa
 * @author Eric
 * @author Fernando Akio
 * @author Vin�cius
 */
public class Triple<F, S, T> {

	private F first;
	private S second;
	private T third;

	public Triple(F first, S second, T third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public F getFirst() {
		return first;
	}

	public void setFirst(F first) {
		this.first = first;
	}

	public S getSecond() {
		return second;
	}

	public void setSecond(S second) {
		this.second = second;
	}

	public T getThird() {
		return third;
	}

	public void setThird(T third) {
		this.third = third;
	}

}
