import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if(s == null || s.equals("")){
            return true;
        }
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('[', ']');
        Stack<Character> helper = new Stack<Character>();
        int len = s.length();
        for(int i = 0; i < len; i++){
            if(brackets.containsKey(s.charAt(i))){
                helper.push(s.charAt(i));
            }else{
                //注意只有不为空才能取
                if(!helper.isEmpty() && brackets.get(helper.peek()) ==  s.charAt(i)){
                    helper.pop();
                }else return false;
            }
        }
        //一定要考虑只有'['和']'的情况
        if(helper.isEmpty()) return true;
        return false;
    }
}
