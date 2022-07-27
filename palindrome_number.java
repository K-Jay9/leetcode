package solutions_leetcode;

/* 
 * Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

    For example, 121 is a palindrome while 123 is not.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
*/

public class palindrome_number {

    public boolean isPalindrome(int x) {
    	
    	// convert into a string and produce a copy 
        String pal = String.valueOf(x);
        String sec = String.valueOf(pal);
        
        // use stringBuilder to reverse the string
        StringBuilder second = new StringBuilder();
        second.append(sec);
        
        StringBuilder  palind = new StringBuilder();
        
        palind.append(pal);
        palind.reverse();

        
        // see if they are equal
        if(second.toString().equals(palind.toString())){
            return true;
        }
        
        return false;
    }
}
