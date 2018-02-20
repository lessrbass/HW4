/** Stephen Green
 * I certify that this code is my own creation.
*/

/** Array-based stack implementation */
class StringStack<Char> {

  private static final int defaultSize = 100;

  private int maxSize;            // Maximum size of stack
  private int top;                // Index for top Object
  private char [] listArray;         // Array holding stack

  /** Constructors */
  StringStack() { this(defaultSize); }
  @SuppressWarnings("unchecked") // Generic array allocation
  StringStack(int size) {
    maxSize = size;
    top = 0; 
    listArray = (char[])new char[size];   // Create listArray
  }

  /** Reinitialize stack */
  public void clear() { top = 0; }

  /** Push "it" onto stack */
public void push(String string) {
	  assert top != maxSize : "Stack is full";
	//  listArray[top++] = string;
	  int i;
	  char temp;
	  int length = string.length();
	  if (length > 255) {
		  System.out.print("String too long");
	  }
	  else {
	  //System.out.print(length);
		  for(i=top; i<length; i++) {
			  temp = string.charAt(i);
			  listArray[top + i] = temp;
		  }
		  listArray[length] = (char) length;
	  }
	  top = listArray[length];
  }

  /** Remove and top element */
  public String pop() {
    assert top != 0 : "Stack is empty";
    int i = 0;
    //int lnth = (char) top;
    //System.out.print(lnth);
    for (i= 0; i < top; i++) {
    	char temp = listArray[top - (top-i)];
    	System.out.print(temp);
    }
    return (String) toString();
  }

  /** @return Top element */
  public String topValue() {
    assert top != 0 : "Stack is empty";
    top = listArray[]
    return (String) toString();
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
