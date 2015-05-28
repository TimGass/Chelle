

	/*************************************************************************
	 *  Compilation:  javac Tokenizer.java In.java
	 *  Execution:    java Tokenizer
	 *  
	 *  Takes a string as input and tokenizes it into an array of substrings
	 *  using a specified delimiter character.
	 *
	 *  % java StringTokenizer : http://www.cs.princeton.edu/introcs/datafiles/
	 *
	 *  See also java.util.StringTokenizer.
	 *
	 *************************************************************************/

	public class Tokenizer {

	    public static void main (String[] args) {
	        String s = "I'm doing quite well. Thank you!";
	        char delimiter =  ' ';

	        // calculate number of delimiter characters
	        int N = 0;
	        for (int i = 0; i < s.length(); i++)
	            if (s.charAt(i) == delimiter) N++;
	        String[] tokens = new String[N+1];

	        // parse N+1 tokens and store in an array
	        int right = 0, left = 0;
	        for (int i = 0; i < N; i++) {
	            while(s.charAt(right) != delimiter)
	                right++;
	            tokens[i] = s.substring(left, right);
	            right++;
	            left = right;
	        }
	        tokens[N] = s.substring(right, s.length());

	        // print results for testing
	        for (int i = 0; i < tokens.length; i++)
	            System.out.println(i + ": " + tokens[i]);
	    }

	}


