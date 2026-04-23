class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> score = new Stack<>();

        int sum = 0;

        for (String ops : operations) {
            if (ops.equals("+")) {
                int top = score.pop();
                int newTop = top + score.peek();
                score.push(top);
                score.push(newTop);
                sum += newTop;
            } else if (ops.equals("D")) {
                score.push(score.peek() * 2);
                sum += score.peek();
            } else if (ops.equals("C")) {
                sum -= score.pop();
            } else {
                sum += score.push(Integer.parseInt(ops));
            }
        }
        return sum;
    }
}