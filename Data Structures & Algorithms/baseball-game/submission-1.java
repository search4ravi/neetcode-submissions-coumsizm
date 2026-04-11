class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        int result=0;
        
        for(String ops : operations){
            if(ops.equals("+")){
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
                result += newTop;
            } else if(ops.equals("D")){
                int newTop = stack.peek() * 2;
                stack.push(newTop);
                result += newTop;
            } else if(ops.equals("C")){
                result -= stack.pop();
            } else {
                int newTop = Integer.parseInt(ops);
                stack.push(newTop);
                result += newTop;
            }
        }
        
        return result;
    }
}