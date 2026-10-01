class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String str:tokens){
            if(str.equals("+")){
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(a+b));
            }
            else if(str.equals("-")){
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(a-b));
            }
            else if(str.equals("*")){
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(a*b));
            }
            else if(str.equals("/")){
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(a/b));
            }
            else{
                stack.push(str);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
