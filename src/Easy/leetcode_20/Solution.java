package Easy.leetcode_20;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] t = s.toCharArray();
        for(char a : t){
            if(stack.size() == 0){
                stack.push(a);
            }else if(isSystem(stack.peek(), a)){
                stack.pop();
            }else{
                stack.push(a);
            }
        }
        return stack.size() == 0;
    }
    private boolean isSystem(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }
}
