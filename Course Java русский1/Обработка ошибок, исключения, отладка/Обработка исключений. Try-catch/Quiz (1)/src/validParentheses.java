import java.util.Stack;

public class validParentheses {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                st.pop();
                if(st.peek() == '(' && s.charAt(i)==')');
                else if(st.peek()=='{' && s.charAt(i)=='}');
                else if(st.peek()=='[' && s.charAt(i)==']');
                else{
                    return false;
                }
            }
        }
            if (st.isEmpty())
                return true;
        return false;
    }

    public static void main(String[] args) {
        validParentheses validParentheses = new validParentheses();
        String test1 = "{}{}[]({})";
        String test2 = "{}{(})[]({})";
        String test3 = "{]";
        String test4 = "{[]}";
        String test5 = "(])";
        System.out.println(validParentheses.isValid(test1) + "\n" +
                validParentheses.isValid(test2) + "\n" +
               validParentheses.isValid(test3) + "\n" +
                validParentheses.isValid(test4) + "\n" +
                validParentheses.isValid(test5)
        );
    }
}

