class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> openToClose = new HashMap<>();
        openToClose.put('(', ')');
        openToClose.put('{', '}');
        openToClose.put('[', ']');

        for (char c : s.toCharArray()) {
            if (openToClose.containsKey(c)) {
                stack.push(openToClose.get(c));
            } else {
                if (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
