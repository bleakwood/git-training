import java.io.*;
import java.util.*;
// nothing to do

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    Solution s = new Solution();
    boolean res = s.validParentheses("");

    System.out.println(res);
  }
  
  public boolean validParentheses(String input) {
    Stack<Character> st = new Stack<Character>();
    for(int i=0; i<input.length(); i++){
      if(input.charAt(i) == '(') {
        st.push(input.charAt(i));
      }else{
        if(input.charAt(i) == ')'){
          if(st.empty())
            return false;
          char last = st.pop();
          if(last != '(')
            return false;
        }
      }
    }
    if(st.empty())
      return true;
    return false;
  }
}


/* 
Your previous Ruby content is preserved below:

# Given a string filled with parentheses, detect whether they are matching
# validParentheses( "()" ) => returns true 
# validParentheses( ")(()))" ) => returns false 
# validParentheses( "(" ) => returns false 
# validParentheses( "(())((()())())" ) => returns true 
 */