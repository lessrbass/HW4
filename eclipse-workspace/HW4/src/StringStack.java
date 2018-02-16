/** Stephen Green
 * I certify that this code is my own creation.
*/

/** Array-based stack implementation */
class AStack<E> {

  private static final int defaultSize = 10;

  private int maxSize;            // Maximum size of stack
  private int top;                // Index for top Object
  private E [] listArray;         // Array holding stack

  /** Constructors */
  AStack() { this(defaultSize); }
  @SuppressWarnings("unchecked") // Generic array allocation
  AStack(int size) {
    maxSize = size;
    top = 0; 
    listArray = (E[])new Object[size];   // Create listArray
  }

  /** Reinitialize stack */
  public void clear() { top = 0; }

  /** Push "it" onto stack */
public void push(String string) {
	  assert top != maxSize : "Stack is full";
	  listArray[top++] = (E) string;
	  String sample = (String) string;
	  int i = 0;
	  char temp;
	  int length = sample.length();
	  //System.out.print(length);
	  while (i < sample.length()) {
		  temp = sample.charAt(i);
		 // listArray[i] = temp;
		  
		  System.out.println(temp);
		  i++;
	  }
	  System.out.print(listArray[0]);
	  System.out.print(listArray[1]);
	  System.out.println(listArray[2]);
  }

  /** Remove and top element */
  public E pop() {
    assert top != 0 : "Stack is empty";
    return listArray[--top];
  }

  /** @return Top element */
  public E topValue() {
    assert top != 0 : "Stack is empty";
    return listArray[top-1];
  }

  /** @return Stack size */
  public int length() { return top; }
  
  public boolean StringTooLongException() {
	  
	  return true;
  }

// Extra stuff not printed in the book.

  /**
   * Generate a human-readable representation of this stack's contents
   * that looks something like this: < 1 2 3 >.
   * This method uses toString() on the individual elements.
   * @return The string representation of this stack
   */
  public String toString()
  {
    StringBuffer out = new StringBuffer((length() + 1) * 4);
    out.append("< ");
    for (int i = top-1; i >= 0; i--) {
      out.append(listArray[i]);
      out.append(" ");
    }
    out.append(">");
    return out.toString();
  }
}
