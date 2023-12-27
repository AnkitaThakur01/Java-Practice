/* Match the Parenthesis - write a function that takes as input a sentence 
containing nested parentheses and the position of an opening parenthesis. 
The function should find the corresponding closing parenthesis and return its position.
For example, if the input sentence is:
Sometimes (when I nest my parenthesis (also called parenthetical) too many times
(like this (and this))) they get quite confusing.
And the position of the opening parenthesis is 10, 
the function should return 104, which is the position of the corresponding closing parenthesis.
*/

package javaPracticeQuestions;

public class MatchingParenthesis {
	
	public static void main(String[] args) {   
		String sentence = "Sometimes (when I nest my parenthesis (also called parentheticals) too many times (like this (and this))) they get quite confusing.";
		
		// Starting position of the opening parenthesis
	    int op = 10;
	    
	    // Counter to keep track
	    int c=0;
	    
	    for(int i=op;i<sentence.length();i++)
	    {
	        // If an opening parenthesis is encountered, increment the counter
	    	if(sentence.charAt(i)=='(')
	    	{
	    		c++;
	    	}
	    	// If a closing parenthesis is encountered, decrement the counter
	    	if(sentence.charAt(i)==')')
	    	{
	    		c--;
	    	}
	    	// If the counter becomes zero, it means we found the corresponding closing parenthesis
	    	if(c==0)
	    	{
	    		System.out.println("The corresponding closing parenthesis for " + op+" is : "+i);
	    		break;
	    	}
    	}
	}	
}

