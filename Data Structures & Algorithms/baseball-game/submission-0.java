class Solution {
    public int calPoints(String[] operations) {

        ArrayList<Integer> stack = new ArrayList<Integer>();

        int result=0;
        
        for(String ops : operations){
            if(ops.equalsIgnoreCase("+")){
                stack.add(stack.get(stack.size()-1) + stack.get(stack.size()-2));
            } else if(ops.equalsIgnoreCase("D")){
                stack.add(stack.get(stack.size()-1) *2 );
            } else if(ops.equalsIgnoreCase("C")){
                stack.remove(stack.size()-1);
            } else {
                stack.add(Integer.parseInt(ops));
            }
        }

        for(int i : stack){
            result += i;
        }
        
        return result;
    }
}