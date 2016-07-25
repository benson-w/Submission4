package god;

import java.util.Random;

public class randomString {

	  private static final char[] symbols;

	  static {
	    StringBuilder tmp = new StringBuilder();
	    //for (char ch = '0'; ch <= '9'; ++ch)
	     // tmp.append(ch);
	    for (char ch = 'a'; ch <= 'z'; ++ch) {
	      if (ch != 'x' || ch != 'z') {
	    	  tmp.append(ch);
	    	 
		     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		    	  tmp.append(ch);
		    	  tmp.append(ch);
		    	  tmp.append(ch);
		    	  tmp.append(ch);
		     }
		     
	    }
	    }
	    symbols = tmp.toString().toCharArray();
	  }   

	  private final Random random = new Random();

	  private final char[] buf;

	  public randomString(int length) {
	    if (length < 1)
	      throw new IllegalArgumentException("length < 1: " + length);
	    buf = new char[length];
	  }

	  public String nextString() {
	    for (int idx = 0; idx < buf.length; ++idx) {
	      if (idx == 0) {
	    	  char a = symbols[random.nextInt(symbols.length)];
	    	  buf[idx] = Character.toUpperCase(a);
	      } else {
	    	  buf[idx] = symbols[random.nextInt(symbols.length)];
	      }
	    }
	    return new String(buf);
	  }
}
