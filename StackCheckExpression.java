import java.util.Stack;

public class StackCheckExpression {

    public static boolean isValidExpression(String s){
        Stack <Character> stack = new Stack<>();

        for(Character c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else if (c == ')' || c == '}' || c ==  ']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(c == ')' && top != '(' ||
                    c == '}' && top != '{' ||
                    c == ']' && top != '[' ){
                    return false;
                }
            } 
            
        }


        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String input = "((1+2)*(3+4)/2))";
        if(isValidExpression(input)){
            System.out.println("corect parentheses ");
        }else {
            System.out.println("Not corect parentheses");
        }
    }
}
