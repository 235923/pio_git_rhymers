package edu.kis.vh.nursery;

/**
 * rhymes
 */
public class DefaultCountingOutRhymer {


	//TODO TODO: needs refactoring - change names
	private static final int INT = 12;
	private static final int INT1 = -1;
	private static final int INT2 = 11;

	private final int[] numbers = new int[INT];


	private int total = INT1;


	/**
	 * adds number
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * checks if empty
	 */
	public boolean callCheck() {
			return total == INT1;
		}

	/**
	 * checks if full*/
	public boolean isFull() {
				return total == INT2;
			}

	/**
	 * returns last number*/
	protected int peekaboo() {
		if (callCheck())
			return INT1;
		return numbers[total];
	}

	/**
	 * returns and then deletes the last number*/
	public int countOut() {
		if (callCheck())
			return INT1;
		return numbers[total--];
	}

}
