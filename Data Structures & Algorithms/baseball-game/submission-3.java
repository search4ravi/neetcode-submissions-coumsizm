class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> score = new Stack<>();

        int result = 0;

        for (String ops : operations) {
            if (ops.equals("+")) {
                int top = score.pop();
                int newTop = top + score.peek();
                score.push(top);
                result += score.push(newTop);
            } else if (ops.equals("D")) {
                int newTop = 2 * score.peek();
                result += score.push(newTop);
            } else if (ops.equals("C")) {
                result -= score.pop();
            } else {
                result += score.push(Integer.parseInt(ops));
            }
        }

        return result;
    }
}