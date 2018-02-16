/** Stephen Green
 * I certify that this code is my own creation.
*/
public class HW4Driver {

	public static <E> void main(String[] args) {
		AStack<E> test = new AStack<>();
		test.push("Hey");
		test.push("second");
		System.out.print(test);
	}

}
