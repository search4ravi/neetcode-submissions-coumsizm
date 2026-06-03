class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> qs = new LinkedList<>();

        for (int s : students) {
            qs.offer(s);
        }

        int counter = 0;
        int i = 0;
        while (!qs.isEmpty() && counter <= qs.size()) {
            if (sandwiches[i] == qs.peek()) {
                i++;
                counter = 0;
                qs.poll();
            } else {
                counter++;
                qs.offer(qs.poll());
            }
        }
        return qs.size();
    }
}